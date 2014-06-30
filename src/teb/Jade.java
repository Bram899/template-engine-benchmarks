/*
 * $Copyright: copyright(c) 2007-2011 kuwata-lab.com all rights reserved. $
 * $License: Creative Commons Attribution (CC BY) $
 */
package teb;

import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import teb.model.Stock;
import de.neuland.jade4j.Jade4J;
import de.neuland.jade4j.JadeConfiguration;
import de.neuland.jade4j.template.FileTemplateLoader;
import de.neuland.jade4j.template.JadeTemplate;

public class Jade extends Bench {

	private JadeConfiguration jadeConfig = new JadeConfiguration();
	private String template = "stocks.jade.html";

	public Jade() {

	}

	@Override
	protected void init() {
		jadeConfig.setTemplateLoader(new FileTemplateLoader("templates/",
				"UTF-8"));
		jadeConfig.setMode(Jade4J.Mode.HTML);
		jadeConfig.setPrettyPrint(false);
	}

	@Override
	protected String renderToString(final List<Stock> items) throws Exception {
		JadeTemplate jadeTemplate = jadeConfig.getTemplate(template);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("items", items);
		return jadeConfig.renderTemplate(jadeTemplate, map);
	}

	@Override
	protected void renderToWriter(final List<Stock> items, final Writer writer)
			throws Exception {
		JadeTemplate jadeTemplate = jadeConfig.getTemplate(template);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("items", items);
		jadeConfig.renderTemplate(jadeTemplate, map, writer);

	}

	public static void main(final String[] args) {
		new Jade().run();
	}

}
