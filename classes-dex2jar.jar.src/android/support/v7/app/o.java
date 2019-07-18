package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.Cb;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public abstract class o
{
  private static int a = -1;
  
  public static o a(Activity paramActivity, n paramn)
  {
    return new x(paramActivity, paramActivity.getWindow(), paramn);
  }
  
  public static o a(Dialog paramDialog, n paramn)
  {
    return new x(paramDialog.getContext(), paramDialog.getWindow(), paramn);
  }
  
  public static void a(boolean paramBoolean)
  {
    Cb.a(paramBoolean);
  }
  
  public static int b()
  {
    return a;
  }
  
  public abstract <T extends View> T a(int paramInt);
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract boolean a();
  
  public abstract void b(Bundle paramBundle);
  
  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract boolean b(int paramInt);
  
  public abstract MenuInflater c();
  
  public abstract void c(int paramInt);
  
  public abstract void c(Bundle paramBundle);
  
  public abstract a d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract void h();
  
  public abstract void i();
  
  public abstract void j();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */