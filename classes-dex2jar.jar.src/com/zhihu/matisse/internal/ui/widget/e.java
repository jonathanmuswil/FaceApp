package com.zhihu.matisse.internal.ui.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v7.app.l.a;
import android.text.TextUtils;
import nY;

public class e
  extends h
{
  public static e a(String paramString1, String paramString2)
  {
    e locale = new e();
    Bundle localBundle = new Bundle();
    localBundle.putString("extra_title", paramString1);
    localBundle.putString("extra_message", paramString2);
    locale.m(localBundle);
    return locale;
  }
  
  public Dialog n(Bundle paramBundle)
  {
    paramBundle = Ja().getString("extra_title");
    String str = Ja().getString("extra_message");
    l.a locala = new l.a(Ea());
    if (!TextUtils.isEmpty(paramBundle)) {
      locala.b(paramBundle);
    }
    if (!TextUtils.isEmpty(str)) {
      locala.a(str);
    }
    locala.b(nY.button_ok, new d(this));
    return locala.a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/internal/ui/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */