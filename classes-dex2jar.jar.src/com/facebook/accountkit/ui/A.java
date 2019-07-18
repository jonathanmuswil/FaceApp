package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import jn;

class a
  extends Da
{
  a(AccountKitActivity paramAccountKitActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if (!Da.b.contentEquals(paramContext)) {
      return;
    }
    Da.a locala = (Da.a)paramIntent.getSerializableExtra(Da.c);
    paramContext = AccountKitActivity.a(this.h).a();
    switch (c.a[locala.ordinal()])
    {
    default: 
      break;
    case 12: 
      if ((paramContext instanceof nb))
      {
        paramContext = (Xa)AccountKitActivity.b(this.h);
        ((I)paramContext.n()).b(this.h, paramContext);
      }
      break;
    case 11: 
      if ((paramContext instanceof nb))
      {
        paramContext = (Xa)AccountKitActivity.b(this.h);
        ((I)paramContext.n()).a(this.h, paramContext);
      }
      break;
    case 10: 
      if (((paramContext instanceof nb)) || ((paramContext instanceof za))) {
        ((I)AccountKitActivity.b(this.h).n()).f(this.h);
      }
      break;
    case 9: 
      if ((paramContext instanceof za)) {
        ((I)AccountKitActivity.b(this.h).n()).e(this.h);
      }
      break;
    case 8: 
      if ((paramContext instanceof za))
      {
        paramContext = paramIntent.getStringExtra(Da.e);
        paramIntent = (Xa)AccountKitActivity.b(this.h);
        ((I)paramIntent.n()).a(this.h, paramIntent, paramContext);
      }
      break;
    case 7: 
      if ((paramContext instanceof Va))
      {
        paramIntent = (jn)paramIntent.getParcelableExtra(Da.f);
        paramContext = (Xa)AccountKitActivity.b(this.h);
        ((I)paramContext.n()).a(this.h, paramContext, paramIntent);
      }
      break;
    case 6: 
      if ((paramContext instanceof Ca))
      {
        paramContext = Ga.values()[paramIntent.getIntExtra(Da.g, 0)];
        t.a(this.h, paramContext);
      }
      break;
    case 5: 
      if ((paramContext instanceof ta)) {
        ((s)AccountKitActivity.b(this.h).n()).d(this.h);
      }
      break;
    case 4: 
      if ((paramContext instanceof ja))
      {
        paramIntent = paramIntent.getStringExtra(Da.d);
        paramContext = (oa)AccountKitActivity.b(this.h);
        ((s)paramContext.n()).a(this.h, paramContext, paramIntent);
      }
      break;
    case 3: 
      paramIntent = AccountKitActivity.b(this.h).n();
      paramContext = this.h;
      paramIntent.a(paramContext, AccountKitActivity.b(paramContext));
      break;
    case 2: 
      AccountKitActivity.b(this.h).n().b(this.h);
      break;
    case 1: 
      AccountKitActivity.b(this.h).n().c(this.h);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */