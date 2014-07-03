# Java template engine benchmark
This is a benchmark for java template engines based on [greenlaw110's original work] (https://github.com/greenlaw110/template-engine-benchmarks).

## Results 



| Engine                                                 | Version     | Perf (1) | Incl (4)                                                  | Custom tags | Last updated | Licence | Notes           | 
| -------------------------------------------------------|:-----------:|:--------:|:---------------------------------------------------------:|:-----------:|:------------:|:-------:|:---------------:|
| [StringBuilder](stringbuilder.md)                      |    _        |   1.0x   |                                                           |             |              |         |                 | 
| [Httl](httl.md)                                        |  1.0.7      |   0.9x   |                                                           |             |              |         |Latest 1.0.11    |
| [Japid](japid.md)                                      |  0.9.32     |   1.3x   |                                                           |             |              |         |                 |
| [Rythm](rythm.md)                                      |  1.0.1      |   1.6x   | Yes                                                       | Yes         |              |         |Razor like syntax|
| [Jamon](jamon.md)                                      |  2.4.0      |   1.8x   |                                                           |             |              |         |                 |
| [Velocity](http://velocity.apache.org)                 |  1.7        |   2.1x   |                                                           |             |              |         |                 |
| [FreeMarker](freemarker.md)                            |  2.3.19     |   3.0x   |                                                           |             |              |         |                 |
| [Jmte](https://code.google.com/p/jmte/)                |  2.2        |   3.1x   |                                                           |Yes          |              |         |Latest  3.1      |
| [StringTemplate](http://www.stringtemplate.org/)       |  4.0.7      |   4.7x   |                                                           |             |              |         |                 |       
| [Jangod](jangod.md)                                    |             |  18.0x   |                                                           |             |              |         |                 |       
| [ThymeLeaf](thymeleaf.md)                              |  2.0.15     |  26.7x   |                                                           |             |              |         |                 |       
| [Handlebars](http://jknack.github.io/handlebars.java/) |             |          | [Yes](http://jknack.github.io/handlebars.java/reuse.html) |             |              |         |                 |             
| [Mustache](https://github.com/spullara/mustache.java/) |             |          |                                                           |             |              |         |                 |
| [Jade](https://github.com/neuland/jade4j)              |    0.40     |    5 x   | Yes                                                       |             |              |         |                 |


(1) The smaller, the better

(2)

(3) 

(4) Support include in templates

## Supported platforms

| Engine                                                 |                                                          GAE                                | Play1                                                                        |                      Play2                           |                                       Spring                                                                         |                    Ninja                             |                                                 C#                                                   |                             Javascript                | 
| -------------------------------------------------------|:-------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------:|:----------------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------:|:----------------------------------------------------------------------------------------------------:|:-----------------------------------------------------:|
| [StringBuilder](stringbuilder.md)                      |                                                                                             |                                                                              |                                                      |                                                                                                                      |                                                      |                                                                                                      |                                                       |
| [Httl](httl.md)  (3)                                   |                                                                                             |                                                                              |                                                      |                                                                                                                      |                                                      |                                                                                                      |                                                       |
| [Japid](japid.md)                                      |[Yes](https://github.com/branaway/Japid/issues/61)                                           |[Yes](http://www.playframework.com/modules/japid)                             | [Yes](https://github.com/branaway/japid42)           |                                                                                                                      |                                                      |                                                                                                      |                                                       |
| [Rythm](rythm.md)                                      | Yes                                                                                         |[Yes](https://github.com/greenlaw110/play-rythm)                              | [?](https://github.com/greenlaw110/Rythm/issues/204) | [Yes](https://github.com/greenlaw110/spring-rythm)                                                                   | [Yes](https://github.com/ninjaframework/ninja-rythm) |[Yes](http://haacked.com/archive/2011/01/06/razor-syntax-quick-reference.aspx/)                       | [Yes](https://github.com/kirbysayshi/vash)            |
| [Jamon](jamon.md)                                      |                                                                                             | [No](https://groups.google.com/forum/#!topic/play-framework/YITlfU2mkac)     |                                                      |[Yes](http://www.bloglovin.com/viewer?post=1180506903&group=0&frame_type=b&blog=8581863&frame=1&click=0&user=0)       |                                                      |                                                                                                      |                                                       |
| [Velocity](http://velocity.apache.org)                 |[Yes](http://stackoverflow.com/questions/2014099/velocity-framework-on-google-app-engine)    |                                                                              | [Yes](https://github.com/Furyu/play-velocity-plugin) | [Yes](http://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch17s04.html)                                        |                                                      |                                                                                                      |                                                       |
| [FreeMarker](freemarker.md)                            |[Yes](http://freemarker.org/freemarkerdownload.html)                                         |                                                                              |                                                      |[Yes](http://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch17s04.html)                                         |                                                      |                                                                                                      |                                                       |
| [Jmte](https://code.google.com/p/jmte/)                | Yes                                                                                         |                                                                              |                                                      |                                                                                                                      |                                                      |                                                                                                      |                                                       | 
| [StringTemplate](http://www.stringtemplate.org/)       |                                                                                             |                                                                              |                                                      |                                                                                                                      |                                                      |                                                                                                      |                                                       |
| [Jangod](jangod.md)                                    |                                                                                             |                                                                              |                                                      |                                                                                                                      |                                                      |                                                                                                      |                                                       |
| [ThymeLeaf](thymeleaf.md)                              |                                                                                             |                                                                              |                                                      |                                                                                                                      |                                                      |                                                                                                      |                                                       |
| [Handlebars](http://jknack.github.io/handlebars.java/) |                                                                                             |                                                                              |                                                      |   [Yes](https://github.com/jknack/handlebars.java/tree/master/handlebars-springmvc)                                  |                                                      | [Yes](http://stackoverflow.com/questions/15814781/render-handlebar-templates-server-side-in-net-c)   | [Yes](http://handlebarsjs.com/)                       |
| [Mustache](https://github.com/spullara/mustache.java/) |                                                                                             | [Yes](http://www.playframework.com/modules/mustache)                         |[Yes](https://github.com/julienba/play2-mustache)     |                                                                                                                      |[Yes](https://github.com/kpacha/ninja-mustache)       |                                                                                                      | [Yes](http://mustache.github.com/mustache.5.html/)    |
| [Jade](https://github.com/neuland/jade4j)              |                                                                                             |                                                                              | [Almost](http://stackoverflow.com/a/16917876/740464) | [Yes](https://github.com/neuland/spring-jade4j)|[Yes](https://github.com/mysu/jade4ninja)                            | [Yes](http://stackoverflow.com/a/10569528/740464)    | [Yes](http://jade-lang.com/)                                                                         |                                                       |


## Tests

The benchmark renders a list of the 20 stock ticker into [an HTML page](https://rawgithub.com/PerfectCarl/template-engine-benchmarks/master/output/stringbuilder.html).

The rendering is executed `1000 times` and its execution time is compared with [a baseline implementation](stringbuilder.md) using java's `StringBuilder`.

## More information 

The benchmark is compiled and executed with `JDK 1.7.0_40-b43`

The test have been executed on **Windows 7 sp1 64 bits** 

[Ant](http://ant.apache.org/) is used to run and compile the tests.

Execute: 
```
ant
```

