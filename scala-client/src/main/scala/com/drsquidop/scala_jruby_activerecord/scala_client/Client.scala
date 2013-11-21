package com.drsquidop.scala_jruby_activerecord_scala_client

import javax.script.ScriptEngine
import javax.script.ScriptEngineManager

import scala.util.Try

object Client {
  // https://github.com/jruby/jruby/wiki/RedBridge
  private val engine = {
    System.setProperty("org.jruby.embed.compilemode",    "jit")
    System.setProperty("org.jruby.embed.compat.version", "JRuby1.9")

    val manager = new ScriptEngineManager
    manager.getEngineByName("jruby")
  }

  engine.eval("require 'model_gem'")
  engine.eval("puts ModelGem")

  def create(myModel: MyModel): Try[MyModel] = ???

  def get(id: Int): Try[MyModel] = ???

  def all(): Try[Seq[MyModel]] = ???
}
