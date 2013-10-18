/*
 * $Copyright: copyright(c) 2007-2011 kuwata-lab.com all rights reserved. $
 * $License: Creative Commons Attribution (CC BY) $
 */
package teb;

import java.io.OutputStream;
import java.io.Writer;
import java.util.List;

import teb.model.Stock;
import cn.bran.japid.compiler.OpMode;
import cn.bran.japid.template.JapidRenderer;

public class Japid extends _BenchBase {

	private String template = "japid";

	public Japid() {
		cn.bran.japid.util.JapidFlags.verbose = false;
		JapidRenderer.init(OpMode.dev, "templates", 1, null);

	}

	@Override
	public void execute(final Writer w0, final Writer w1, int ntimes,
			final List<Stock> items) throws Exception {
		while (--ntimes >= 0) {
			if (ntimes == 0) {
				String result = renderToString(items);
				w1.append(result);
				w1.close();
			} else {
				String result = renderToString(items);
				w0.append(result);
			}
		}

	}

	@Override
	public void execute(final OutputStream o0, final OutputStream o1,
			int ntimes, final List<Stock> items) throws Exception {
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
	protected String execute(int ntimes, final List<Stock> items)
			throws Exception {
		String result = null;
		while (--ntimes >= 0) {
			result = renderToString(items);
		}
		return result;
	}

	private String renderToString(final List<Stock> items) {

		String output = JapidRenderer.renderWith(template, items);
		return output;
	}

	public static void main(final String[] args) {
		new Japid().run();
	}

}
