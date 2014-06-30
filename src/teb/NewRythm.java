/*
 * $Copyright: copyright(c) 2007-2011 kuwata-lab.com all rights reserved. $
 * $License: Creative Commons Attribution (CC BY) $
 */
package teb;

import java.io.OutputStream;
import java.io.Writer;
import java.util.List;
import java.util.Properties;

import org.rythmengine.RythmEngine;

import teb.model.Stock;

public class NewRythm extends Bench {

	RythmEngine engine;
	private String template = "templates/stocks.newrythm.html";

	public NewRythm() {

	}

	@Override
	protected void init() {
		Properties p = new Properties();
		p.put("log.enabled", false);
		p.put("feature.smart_escape.enabled", false);
		p.put("feature.transform.enabled", false);
		engine = new RythmEngine(p);
	}

	@Override
	protected void shutdown() {
		engine.shutdown();
	}

	@Override
	protected void renderToStream(final List<Stock> items,
			final OutputStream output) throws Exception {
		engine.render(output, template, items);
	}

	@Override
	protected void renderToWriter(final List<Stock> items, final Writer writer)
			throws Exception {
		engine.render(writer, template, items);
	}

	@Override
	protected String renderToString(final List<Stock> items) {
		String output = engine.render(template, items);
		return output;
	}

	public static void main(final String[] args) {
		new NewRythm().run();
	}

}
