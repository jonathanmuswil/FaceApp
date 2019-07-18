package com.facebook.accountkit.ui;

import Mp;
import Rm;
import Sm;
import Vm;
import Vm.a;
import Wm;
import Xm;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.o;
import android.support.v7.app.m;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.facebook.accountkit.internal.O;
import com.facebook.accountkit.internal.c.a;
import com.facebook.accountkit.internal.va;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.f.a;
import en;
import tn;

public final class AccountKitActivity
  extends e
{
  private static final String A;
  private static final String B;
  private static final IntentFilter C = Da.a();
  private static final String y = "AccountKitActivity";
  private static final String z;
  private f D;
  private Rm E;
  private String F;
  private tn G;
  private Vm H;
  private String I;
  private boolean J;
  private Ea K;
  private en L = en.b;
  private yb M;
  private long N;
  private final Bundle O = new Bundle();
  private final BroadcastReceiver P = new a(this);
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(y);
    localStringBuilder.append(".loginFlowManager");
    z = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(y);
    localStringBuilder.append(".pendingLoginFlowState");
    A = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(y);
    localStringBuilder.append(".trackingSms");
    B = localStringBuilder.toString();
  }
  
  private void a(int paramInt, Xm paramXm)
  {
    if (getCallingActivity() == null)
    {
      startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
      finish();
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("account_kit_log_in_result", paramXm);
    setResult(paramInt, localIntent);
    finish();
  }
  
  private void a(Bundle paramBundle, boolean paramBoolean)
  {
    a((Ea)paramBundle.getParcelable(z));
    if (paramBoolean)
    {
      this.M.a(this);
    }
    else
    {
      paramBundle = this.v;
      if (paramBundle == null) {
        return;
      }
      int i = c.b[paramBundle.p().ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          this.H = new Vm(Vm.a.e, O.w);
          n();
        }
        else
        {
          a(Ga.c, null);
        }
      }
      else {
        a(Ga.b, null);
      }
    }
  }
  
  private void a(Ga paramGa1, Ga paramGa2)
  {
    this.K.f(paramGa2);
    b localb = new b(this);
    if (paramGa1 != Ga.m) {
      a(null);
    }
    a(paramGa2, localb);
  }
  
  private void c(aa paramaa)
  {
    g localg = this.v;
    if (localg == null) {
      return;
    }
    if ((paramaa instanceof Va))
    {
      c.a.d();
    }
    else if ((paramaa instanceof pb))
    {
      c.a.b(false, localg.p());
    }
    else if ((paramaa instanceof rb))
    {
      c.a.c(false, localg.p());
    }
    else if ((paramaa instanceof za))
    {
      c.a.b();
    }
    else if ((paramaa instanceof Sb))
    {
      c.a.e(false, localg.p());
    }
    else if ((paramaa instanceof Rb))
    {
      c.a.d(false, localg.p());
    }
    else if ((paramaa instanceof Ca))
    {
      c.a.a(false, localg.p());
    }
    else if ((paramaa instanceof ja))
    {
      c.a.c();
    }
    else if ((paramaa instanceof ta))
    {
      c.a.e(false);
    }
    else if ((paramaa instanceof nb))
    {
      c.a.f(false);
    }
    else if ((paramaa instanceof U))
    {
      c.a.b(false);
    }
    else
    {
      if (!(paramaa instanceof n)) {
        break label193;
      }
      c.a.a(false);
    }
    return;
    label193:
    throw new Wm(Vm.a.d, O.m, paramaa.getClass().getName());
  }
  
  private static boolean c(String paramString)
  {
    return paramString.startsWith(va.d());
  }
  
  private void s()
  {
    aa localaa = this.M.a();
    if (localaa == null) {
      return;
    }
    if ((localaa instanceof za)) {
      ((za)localaa).a(false);
    }
    b(localaa);
    Ga localGa1 = localaa.c();
    Ga localGa2 = Ga.a(localGa1);
    switch (c.c[localGa1.ordinal()])
    {
    default: 
      a(localGa1, Ga.a);
      break;
    case 14: 
      n();
      break;
    case 13: 
      a(localGa1, ((Ca)localaa).i());
      break;
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
      a(localGa1, localGa2);
      break;
    case 1: 
    case 2: 
    case 3: 
      r();
    }
  }
  
  void a(long paramLong)
  {
    this.N = paramLong;
  }
  
  void a(Rm paramRm)
  {
    this.E = paramRm;
  }
  
  void a(Vm paramVm)
  {
    String str;
    if (paramVm == null) {
      str = null;
    } else {
      str = paramVm.n();
    }
    this.H = paramVm;
    Ga localGa = Ga.a(this.K.o());
    this.K.f(Ga.n);
    yb localyb = this.M;
    localyb.a(this, this.K, localGa, paramVm, localyb.a(str));
  }
  
  void a(Ea paramEa)
  {
    Object localObject = this.K;
    if (localObject == null) {
      localObject = Ga.a;
    } else {
      localObject = ((Ea)localObject).o();
    }
    if (paramEa == null)
    {
      paramEa = this.K;
      if (paramEa != null) {
        paramEa.l();
      }
    }
    int i = c.b[this.v.p().ordinal()];
    if (i != 1)
    {
      if (i == 2)
      {
        this.K = new oa(this.v);
        this.K.f((Ga)localObject);
      }
    }
    else
    {
      this.K = new Xa(this.v);
      this.K.f((Ga)localObject);
    }
  }
  
  void a(Ga paramGa, yb.b paramb)
  {
    if (!this.J) {
      return;
    }
    this.M.a(paramGa, paramb);
  }
  
  void a(Ga paramGa, yb.c paramc)
  {
    if (this.J)
    {
      this.K.f(paramGa);
      yb.c localc = paramc;
      if (paramc == null)
      {
        int i = c.c[paramGa.ordinal()];
        if (i != 6)
        {
          if (i != 13) {
            localc = paramc;
          } else {
            a(null);
          }
        }
        else {
          localc = ((I)this.K.n()).d(this);
        }
      }
      this.M.a(this, this.K, localc);
    }
    else
    {
      this.O.putString(A, paramGa.name());
    }
    if (!paramGa.equals(Ga.n)) {
      this.H = null;
    }
  }
  
  void a(yb.b paramb)
  {
    if (!this.J) {
      return;
    }
    this.M.a(paramb);
  }
  
  void a(en paramen)
  {
    this.L = paramen;
  }
  
  void a(String paramString)
  {
    this.F = paramString;
  }
  
  void b(aa paramaa)
  {
    if (paramaa != null)
    {
      paramaa.b(this);
      c(paramaa);
    }
  }
  
  void b(String paramString)
  {
    this.I = paramString;
  }
  
  void n()
  {
    int i;
    if (this.L == en.a) {
      i = -1;
    } else {
      i = 0;
    }
    a(i, new i(this.E, this.F, this.I, this.N, this.H, false));
  }
  
  aa o()
  {
    return this.M.a();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    aa localaa = o();
    if (localaa != null) {
      localaa.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    if (this.M.a() == null) {
      super.onBackPressed();
    } else {
      s();
    }
  }
  
  public void onBackPressed(View paramView)
  {
    onBackPressed();
  }
  
  public void onCancelPressed(View paramView)
  {
    r();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject = getIntent().getDataString();
    if ((localObject != null) && (!c((String)localObject)))
    {
      n();
      return;
    }
    localObject = this.v;
    if ((localObject != null) && (((g)localObject).p() != null))
    {
      if (this.v.r() == null)
      {
        this.H = new Vm(Vm.a.e, O.v);
        n();
        return;
      }
      this.M = new yb(this, this.v);
      Sm.a(this, paramBundle);
      localObject = this.O;
      boolean bool;
      if (paramBundle != null) {
        bool = true;
      } else {
        bool = false;
      }
      a((Bundle)localObject, bool);
      android.support.v4.content.g.a(this).a(this.P, C);
      paramBundle = new f.a(this);
      paramBundle.a(Mp.f);
      this.D = paramBundle.a();
      return;
    }
    this.H = new Vm(Vm.a.e, O.u);
    n();
  }
  
  protected void onDestroy()
  {
    android.support.v4.content.g.a(this).a(this.P);
    super.onDestroy();
    Object localObject = this.G;
    if (localObject != null)
    {
      ((tn)localObject).g();
      this.G = null;
    }
    localObject = this.K;
    if ((localObject != null) && (((Ea)localObject).p() == Ia.a)) {
      ((I)this.K.n()).n();
    }
    Sm.a(this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt != 4) {
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    s();
    return true;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    paramIntent = paramIntent.getDataString();
    if (paramIntent == null) {
      return;
    }
    if (!c(paramIntent))
    {
      n();
      return;
    }
    if ((o() instanceof ta)) {
      a(Ga.k, null);
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() != 16908332) {
      return super.onOptionsItemSelected(paramMenuItem);
    }
    onBackPressed();
    return true;
  }
  
  public void onPause()
  {
    super.onPause();
    aa localaa = o();
    if (localaa != null) {
      localaa.b(this);
    }
    this.J = false;
  }
  
  protected void onResume()
  {
    super.onResume();
    Object localObject = o();
    if (localObject != null) {
      ((aa)localObject).a(this);
    }
    this.J = true;
    localObject = this.v;
    if (localObject == null) {
      return;
    }
    int i = c.b[localObject.p().ordinal()];
    if ((i == 1) || (i == 2))
    {
      this.G = this.K.n().a(this);
      this.G.f();
    }
    if ((this.K.p() == Ia.a) && ((this.K.o() == Ga.d) || (this.O.getBoolean(B, false)))) {
      ((I)this.K.n()).g(this);
    }
    localObject = this.O.getString(A);
    if (!va.e((String)localObject))
    {
      this.O.putString(A, null);
      a(Ga.valueOf((String)localObject), null);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    Sm.b(this, paramBundle);
    if (this.K.p() == Ia.a)
    {
      localObject = (I)this.K.n();
      this.O.putBoolean(B, ((I)localObject).l());
      ((I)localObject).m();
      this.O.putParcelable(z, this.K);
    }
    Object localObject = this.G;
    if (localObject != null) {
      ((tn)localObject).e();
    }
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    this.D.c();
  }
  
  protected void onStop()
  {
    super.onStop();
    this.D.d();
  }
  
  public Ga p()
  {
    Ea localEa = this.K;
    if (localEa != null) {
      return localEa.o();
    }
    return null;
  }
  
  public f q()
  {
    return this.D;
  }
  
  void r()
  {
    a(0, new i(null, null, null, 0L, null, true));
  }
  
  public static enum a
  {
    private final String d;
    
    private a(String paramString)
    {
      this.d = paramString;
    }
    
    public String a()
    {
      return this.d;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/AccountKitActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */