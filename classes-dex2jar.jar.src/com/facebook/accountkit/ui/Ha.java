package com.facebook.accountkit.ui;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.ba;
import android.support.v4.content.g;
import android.util.Patterns;
import com.facebook.accountkit.internal.c.a;
import com.facebook.accountkit.internal.va;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rn;

class ha
  implements ja.d
{
  ha(ja paramja) {}
  
  public void a(Context paramContext, String paramString)
  {
    if (ja.e(this.a) == null) {
      return;
    }
    String str = ja.e(this.a).h();
    if (str == null) {
      return;
    }
    str = str.trim();
    if (!Patterns.EMAIL_ADDRESS.matcher(str).matches())
    {
      if (ja.a(this.a) != null) {
        ja.a(this.a).a(rn.com_accountkit_email_invalid, new String[0]);
      }
      if (ja.f.a(ja.e(this.a)) != null) {
        ja.f.a(ja.e(this.a)).setError(paramContext.getText(rn.com_accountkit_email_invalid));
      }
      return;
    }
    if (ja.f.a(ja.e(this.a)) != null) {
      ja.f.a(ja.e(this.a)).setError(null);
    }
    c.a.a(paramString, ja.a(ja.e(this.a).g(), str).name(), ja.a(ja.e(this.a).i(), str, va.b(ja.e(this.a).getActivity().getApplicationContext())).name(), str);
    paramString = new Intent(Da.b).putExtra(Da.c, Da.a.d).putExtra(Da.d, str);
    g.a(paramContext).a(paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */