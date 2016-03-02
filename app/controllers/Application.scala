package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }
  def home1 = Action{
    Ok(views.html.Home())
  }
  def signup = Action{
    Ok(views.html.sign_up())
  }
  def signidea = Action{
    Ok(views.html.sign_idea())
  }

  def triggers = Action{
    Ok(views.html.Triggers())
  }
}