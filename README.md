## Possum

This is Possum - a stupid little test of JSR-223 in a web
application. I was able to get it working with [Groovy][1],
[Python][2] ([Jython][3]) and [Ruby][4] ([JRuby][5]).

The script engine initilizes a variable called `PEOPLE` for
you (in Ruby, this is a global variable, so it's called `$PEOPLE`).

## Examples

## Python

    for p in PEOPLE:
      println "%s %s" % (p.surname, p.givenName)

## Javascript

    for (i = 0; i < PEOPLE.size(); i++) {
      println(PEOPLE.get(i).surname);
    }

## Groovy

    PEOPLE.each { p ->
      println "${p.surname} ${p.givenName}"
    }

## Ruby
  
    $PEOPLE.each do|p|
      puts "#{p.surname}, #{p.givenName}"
    end

  [1]: http://groovy.codehaus.org/ "Groovy"
  [2]: http://python.org/ "Python"
  [3]: http://jython.org/ "Jython"
  [4]: http://ruby-lang.org/ "Ruby"
  [5]: http://jruby.org/ "JRuby"
