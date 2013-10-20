## [Freemaker - 2.3.20] (http://freemarker.org/)

[Tutorial] (http://freemarker.org/docs/dgui_quickstart_template.html)

|                     |                                                                     | 
| ------------------- |:-------------------------------------------------------------------:| 
| Last release        | 2013-06-27                                                          |
| License             | [Apache license] (https://github.com/httl/httl/blob/master/LICENSE) |


## Code
[Java: src/teb/Freemaker.java] (src/teb/Freemaker.java)

[Template: templates/stocks.ftl.html] (templates/stocks.ftl.html)

## Syntax 
```` html
    <tbody>
	<#list items as item>
		<tr class="${["odd", "even"][item_index%2]}">
			<td style="text-align: center">${item_index + 1}</td>
			<td>
				<a href="/stocks/${item.symbol}">${item.symbol}</a>
			</td>

			<td>
				<a href="${item.url}">${item.name}</a>
			</td>

			<td>
				<strong>${item.price}</strong>
			</td>

			<#if (item.change < 0.0)>
				<td class="minus">${item.change}</td>
				<td class="minus">${item.ratio}</td>
			<#else>
				<td>${item.change}</td>
				<td>${item.ratio}</td>
			</#if>
		</tr>
	</#list>
	</tbody>
````
