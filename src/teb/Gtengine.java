/*
 * $Copyright: copyright(c) 2007-2011 kuwata-lab.com all rights reserved. $
 * $License: Creative Commons Attribution (CC BY) $
 */
package teb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import play.template2.GTJavaBase;
import play.template2.GTTemplateLocationWithEmbeddedSource;
import play.template2.GTTemplateRepo;
import teb.gtengine.GTTemplateRepoBuilder;
import teb.model.Stock;

public class Gtengine extends _BenchBase {

	private String template = "templates/stocks.gtengine.html";

	public Gtengine() {
	}

	@Override
	public void execute(Writer w0, Writer w1, int ntimes, List<Stock> items)
			throws Exception {
		while (--ntimes >= 0) {
			if (ntimes == 0) {
				render(w1, items);
				w1.close();
			} else {
				render(w0, items);
			}
		}

	}

	@Override
	public void execute(OutputStream o0, OutputStream o1, int ntimes,
			List<Stock> items) throws Exception {
		while (--ntimes >= 0) {
			if (ntimes == 0) {
				String result = renderToString(items);
				o1.write(result.getBytes("UTF-8"));
				o1.close();
			} else {
				String result = renderToString(items);
				o0.write(result.getBytes("UTF-8"));
			}
		}

	}

	@Override
	protected String execute(int ntimes, List<Stock> items) throws Exception {
		String result = null;
		while (--ntimes >= 0) {
			result = renderToString(items);
		}
		return result;
	}

	static String readFile(String path) throws IOException {
		String content = new Scanner(new File(path)).useDelimiter("\\Z").next();
		return content;
	}

	private String renderToString(List<Stock> items) throws IOException {
		GTTemplateRepo templateRepo = new GTTemplateRepoBuilder().build();

		String src = readFile(template);
		GTTemplateLocationWithEmbeddedSource tl = new GTTemplateLocationWithEmbeddedSource(
				src);

		GTJavaBase t = templateRepo.getTemplateInstance(tl);
		Map<String, Object> args = new HashMap<String, Object>();
		t.renderTemplate(args);

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		t.writeOutput(stream, "utf-8");

		String result = new String(stream.toByteArray(), "utf-8");
		return result;
	}

	private void render(Writer out, List<Stock> items) throws IOException {

		out.append(renderToString(items));
	}

	public static void main(String[] args) {
		new Gtengine().run();
	}

}
