package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.facebook.accountkit.internal.c.a;
import jn;
import rn;

class za
  extends V
{
  private a k;
  
  za(g paramg)
  {
    super(paramg);
  }
  
  private a k()
  {
    if (this.k == null) {
      this.k = new a(null);
    }
    return this.k;
  }
  
  void a(Ja paramJa)
  {
    V.a locala = this.g;
    if (locala == null) {
      return;
    }
    ((b)locala).a(paramJa);
  }
  
  public void a(ca paramca)
  {
    if (!(paramca instanceof gb)) {
      return;
    }
    this.i = ((gb)paramca);
    this.i.a(k());
    j();
  }
  
  public void b(Eb.a parama)
  {
    if (!(parama instanceof b)) {
      return;
    }
    this.g = ((b)parama);
    this.g.a(k());
  }
  
  public void b(ca paramca)
  {
    if (!(paramca instanceof V.b)) {
      return;
    }
    this.h = ((V.b)paramca);
    this.h.b().putParcelable(Tb.c, this.a.u());
    paramca = new xa(this);
    this.h.a(paramca);
    this.h.a(k());
  }
  
  public Eb.a d()
  {
    if (this.g == null) {
      b(b.a(this.a.u(), rn.com_accountkit_confirmation_code_title, new String[0]));
    }
    return this.g;
  }
  
  private class a
    implements gb.a, V.a.a
  {
    private a() {}
    
    public void a(Context paramContext)
    {
      Intent localIntent = new Intent(Da.b).putExtra(Da.c, Da.a.i);
      za.this.a(false);
      android.support.v4.content.g.a(paramContext).a(localIntent);
    }
    
    public void a(Context paramContext, String paramString)
    {
      Object localObject = za.this;
      V.b localb = ((V)localObject).h;
      if ((localb != null) && (((V)localObject).i != null))
      {
        localObject = localb.g();
        c.a.a(paramString, za.this.h.h(), (String)localObject);
        paramString = new Intent(Da.b).putExtra(Da.c, Da.a.h).putExtra(Da.e, (String)localObject);
        android.support.v4.content.g.a(paramContext).a(paramString);
      }
    }
    
    public void b(Context paramContext)
    {
      Object localObject = za.this.g;
      if (localObject != null) {
        ((V.a)localObject).b(false);
      }
      localObject = new Intent(Da.b).putExtra(Da.c, Da.a.j);
      android.support.v4.content.g.a(paramContext).a((Intent)localObject);
    }
  }
  
  public static final class b
    extends V.a
  {
    private Ja i;
    
    public static b a(Fb paramFb, int paramInt, String... paramVarArgs)
    {
      b localb = new b();
      localb.b().putParcelable(Tb.c, paramFb);
      localb.a(paramInt, paramVarArgs);
      return localb;
    }
    
    void a(Ja paramJa)
    {
      this.i = paramJa;
      c();
    }
    
    void c()
    {
      if (!isAdded()) {
        return;
      }
      Object localObject = this.i;
      if (localObject == null) {
        return;
      }
      int j = ya.a[localObject.ordinal()];
      if (j != 1)
      {
        if (j != 2)
        {
          localObject = this.g;
          if (localObject == null) {
            return;
          }
          if (this.h)
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append(getString(rn.com_accountkit_verify_confirmation_code_title_colon));
            ((StringBuilder)localObject).append("\n");
            ((StringBuilder)localObject).append(this.g.toString());
            localObject = ((StringBuilder)localObject).toString();
          }
          else
          {
            localObject = getString(rn.com_accountkit_enter_code_sent_to, new Object[] { ((jn)localObject).toString() });
          }
          localObject = new SpannableString((CharSequence)localObject);
          Aa localAa = new Aa(this);
          j = ((SpannableString)localObject).toString().indexOf(this.g.toString());
          ((SpannableString)localObject).setSpan(localAa, j, this.g.toString().length() + j, 33);
          this.e.setText((CharSequence)localObject);
          this.e.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else if (this.h)
        {
          a(rn.com_accountkit_verify_confirmation_code_title, new String[0]);
        }
        else
        {
          a(rn.com_accountkit_voice_call_code_entry_title, new String[0]);
        }
      }
      else if (this.h) {
        a(rn.com_accountkit_verify_confirmation_code_title, new String[0]);
      } else {
        a(rn.com_accountkit_facebook_code_entry_title, new String[0]);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */