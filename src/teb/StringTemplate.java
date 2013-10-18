/*
 * $Copyright: copyright(c) 2007-2011 kuwata-lab.com all rights reserved. $
 * $License: Creative Commons Attribution (CC BY) $
 */
package teb;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.List;

import org.stringtemplate.v4.ST;

import teb.model.Stock;

public class StringTemplate extends _BenchBase {

	private ST st = null;
	private boolean initialized = false;

	public StringTemplate() {
		String template;
		try {
			template = readFile("./templates/stocks.stringtemplate.html");
			st = new ST(template, '$', '$');
		} catch (IOException e) {
			throw new RuntimeException("Cannot read file", e);
		}

	}

	private String readFile(final String filePath) throws IOException {
		FileInputStream input = new FileInputStream(filePath);

		byte[] fileData = new byte[input.available()];

		input.read(fileData);
		input.close();

		return new String(fileData, "UTF-8");
	}

	@Override
	public void execute(final Writer w0, final Writer w1, int ntimes,
			final List<Stock> items) throws Exception {
		addItems(items);
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
		addItems(items);
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
		addItems(items);
		String result = null;
		while (--ntimes >= 0) {
			result = renderToString(items);
		}
		return result;
	}

	private void addItems(final List<Stock> items) {
		if (initialized)
			return;
		st.add("name", "CARL");
		st.add("items", items);
		initialized = true;
	}

	private String renderToString(final List<Stock> items) {

		return st.render();
	}

	public static void main(final String[] args) {
		new StringTemplate().run();
	}

}
