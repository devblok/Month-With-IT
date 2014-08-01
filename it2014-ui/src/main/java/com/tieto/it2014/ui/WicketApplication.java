package com.tieto.it2014.ui;

import com.tieto.it2014.ui.user.EditUserPage;
import com.tieto.it2014.ui.user.NewUserPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {
  @Override
  public Class<? extends WebPage> getHomePage() {
    return HomePage.class;
  }

  @Override
  public void init() {
    super.init();
    getRequestCycleSettings().setResponseRequestEncoding("UTF-8");
    getMarkupSettings().setDefaultMarkupEncoding("UTF-8");
    mountPage("user/new", NewUserPage.class);
    mountPage("user/edit/${userId}", EditUserPage.class);
  }
}
