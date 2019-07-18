package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class h
  extends l
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  int Y = 0;
  int Z = 0;
  boolean aa = true;
  boolean ba = true;
  int ca = -1;
  Dialog da;
  boolean ea;
  boolean fa;
  boolean ga;
  
  public void A(boolean paramBoolean)
  {
    this.aa = paramBoolean;
    Dialog localDialog = this.da;
    if (localDialog != null) {
      localDialog.setCancelable(paramBoolean);
    }
  }
  
  public void B(boolean paramBoolean)
  {
    this.ba = paramBoolean;
  }
  
  public void Lb()
  {
    z(true);
  }
  
  public Dialog Mb()
  {
    return this.da;
  }
  
  public int Nb()
  {
    return this.Z;
  }
  
  public void a(Dialog paramDialog, int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 2))
    {
      if (paramInt == 3) {
        paramDialog.getWindow().addFlags(24);
      }
    }
    else {
      paramDialog.requestWindowFeature(1);
    }
  }
  
  public void a(Context paramContext)
  {
    super.a(paramContext);
    if (!this.ga) {
      this.fa = false;
    }
  }
  
  public void a(s params, String paramString)
  {
    this.fa = false;
    this.ga = true;
    params = params.a();
    params.a(this, paramString);
    params.a();
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.Y = paramInt1;
    paramInt1 = this.Y;
    if ((paramInt1 == 2) || (paramInt1 == 3)) {
      this.Z = 16973913;
    }
    if (paramInt2 != 0) {
      this.Z = paramInt2;
    }
  }
  
  public void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    if (!this.ba) {
      return;
    }
    Object localObject = eb();
    if (localObject != null) {
      if (((View)localObject).getParent() == null) {
        this.da.setContentView((View)localObject);
      } else {
        throw new IllegalStateException("DialogFragment can not be attached to a container view");
      }
    }
    localObject = Ea();
    if (localObject != null) {
      this.da.setOwnerActivity((Activity)localObject);
    }
    this.da.setCancelable(this.aa);
    this.da.setOnCancelListener(this);
    this.da.setOnDismissListener(this);
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getBundle("android:savedDialogState");
      if (paramBundle != null) {
        this.da.onRestoreInstanceState(paramBundle);
      }
    }
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    boolean bool;
    if (this.A == 0) {
      bool = true;
    } else {
      bool = false;
    }
    this.ba = bool;
    if (paramBundle != null)
    {
      this.Y = paramBundle.getInt("android:style", 0);
      this.Z = paramBundle.getInt("android:theme", 0);
      this.aa = paramBundle.getBoolean("android:cancelable", true);
      this.ba = paramBundle.getBoolean("android:showsDialog", this.ba);
      this.ca = paramBundle.getInt("android:backStackId", -1);
    }
  }
  
  public LayoutInflater d(Bundle paramBundle)
  {
    if (!this.ba) {
      return super.d(paramBundle);
    }
    this.da = n(paramBundle);
    paramBundle = this.da;
    if (paramBundle != null)
    {
      a(paramBundle, this.Y);
      return (LayoutInflater)this.da.getContext().getSystemService("layout_inflater");
    }
    return (LayoutInflater)this.u.c().getSystemService("layout_inflater");
  }
  
  public void dismiss()
  {
    z(false);
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    Object localObject = this.da;
    if (localObject != null)
    {
      localObject = ((Dialog)localObject).onSaveInstanceState();
      if (localObject != null) {
        paramBundle.putBundle("android:savedDialogState", (Bundle)localObject);
      }
    }
    int i = this.Y;
    if (i != 0) {
      paramBundle.putInt("android:style", i);
    }
    i = this.Z;
    if (i != 0) {
      paramBundle.putInt("android:theme", i);
    }
    boolean bool = this.aa;
    if (!bool) {
      paramBundle.putBoolean("android:cancelable", bool);
    }
    bool = this.ba;
    if (!bool) {
      paramBundle.putBoolean("android:showsDialog", bool);
    }
    i = this.ca;
    if (i != -1) {
      paramBundle.putInt("android:backStackId", i);
    }
  }
  
  public Dialog n(Bundle paramBundle)
  {
    throw null;
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (!this.ea) {
      z(true);
    }
  }
  
  public void sb()
  {
    super.sb();
    Dialog localDialog = this.da;
    if (localDialog != null)
    {
      this.ea = true;
      localDialog.dismiss();
      this.da = null;
    }
  }
  
  public void tb()
  {
    super.tb();
    if ((!this.ga) && (!this.fa)) {
      this.fa = true;
    }
  }
  
  public void wb()
  {
    super.wb();
    Dialog localDialog = this.da;
    if (localDialog != null)
    {
      this.ea = false;
      localDialog.show();
    }
  }
  
  public void xb()
  {
    super.xb();
    Dialog localDialog = this.da;
    if (localDialog != null) {
      localDialog.hide();
    }
  }
  
  void z(boolean paramBoolean)
  {
    if (this.fa) {
      return;
    }
    this.fa = true;
    this.ga = false;
    Object localObject = this.da;
    if (localObject != null) {
      ((Dialog)localObject).dismiss();
    }
    this.ea = true;
    if (this.ca >= 0)
    {
      Qa().a(this.ca, 1);
      this.ca = -1;
    }
    else
    {
      localObject = Qa().a();
      ((G)localObject).a(this);
      if (paramBoolean) {
        ((G)localObject).b();
      } else {
        ((G)localObject).a();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */