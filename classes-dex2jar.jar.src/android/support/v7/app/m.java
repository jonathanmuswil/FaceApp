package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.app.ja;
import android.support.v4.app.ka;
import android.support.v4.app.ka.a;
import android.support.v7.widget.Cb;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import ke;
import ke.a;

public class m
  extends android.support.v4.app.o
  implements n, ka.a, b
{
  private o n;
  private int o = 0;
  private Resources p;
  
  private boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 26) && (!paramKeyEvent.isCtrlPressed()) && (!KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState())) && (paramKeyEvent.getRepeatCount() == 0) && (!KeyEvent.isModifierKey(paramKeyEvent.getKeyCode())))
    {
      Window localWindow = getWindow();
      if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().dispatchKeyShortcutEvent(paramKeyEvent))) {
        return true;
      }
    }
    return false;
  }
  
  public ke a(ke.a parama)
  {
    return null;
  }
  
  public void a(Intent paramIntent)
  {
    aa.a(this, paramIntent);
  }
  
  public void a(ka paramka)
  {
    paramka.a(this);
  }
  
  public void a(ke paramke) {}
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    j().a(paramView, paramLayoutParams);
  }
  
  public Intent b()
  {
    return aa.a(this);
  }
  
  public void b(ka paramka) {}
  
  public void b(ke paramke) {}
  
  public boolean b(Intent paramIntent)
  {
    return aa.b(this, paramIntent);
  }
  
  public void closeOptionsMenu()
  {
    a locala = k();
    if ((getWindow().hasFeature(0)) && ((locala == null) || (!locala.e()))) {
      super.closeOptionsMenu();
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    a locala = k();
    if ((i == 82) && (locala != null) && (locala.a(paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public <T extends View> T findViewById(int paramInt)
  {
    return j().a(paramInt);
  }
  
  public MenuInflater getMenuInflater()
  {
    return j().c();
  }
  
  public Resources getResources()
  {
    if ((this.p == null) && (Cb.b())) {
      this.p = new Cb(this, super.getResources());
    }
    Resources localResources1 = this.p;
    Resources localResources2 = localResources1;
    if (localResources1 == null) {
      localResources2 = super.getResources();
    }
    return localResources2;
  }
  
  public void i()
  {
    j().f();
  }
  
  public void invalidateOptionsMenu()
  {
    j().f();
  }
  
  public o j()
  {
    if (this.n == null) {
      this.n = o.a(this, this);
    }
    return this.n;
  }
  
  public a k()
  {
    return j().d();
  }
  
  @Deprecated
  public void l() {}
  
  public boolean m()
  {
    Object localObject = b();
    if (localObject != null)
    {
      if (b((Intent)localObject))
      {
        localObject = ka.a(this);
        a((ka)localObject);
        b((ka)localObject);
        ((ka)localObject).m();
        try
        {
          android.support.v4.app.b.a(this);
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
        }
      }
      else
      {
        a(localIllegalStateException);
      }
      return true;
    }
    return false;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    j().a(paramConfiguration);
    if (this.p != null)
    {
      DisplayMetrics localDisplayMetrics = super.getResources().getDisplayMetrics();
      this.p.updateConfiguration(paramConfiguration, localDisplayMetrics);
    }
  }
  
  public void onContentChanged()
  {
    l();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    o localo = j();
    localo.e();
    localo.a(paramBundle);
    if (localo.a())
    {
      int i = this.o;
      if (i != 0) {
        if (Build.VERSION.SDK_INT >= 23) {
          onApplyThemeResource(getTheme(), this.o, false);
        } else {
          setTheme(i);
        }
      }
    }
    super.onCreate(paramBundle);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    j().g();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (a(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    a locala = k();
    if ((paramMenuItem.getItemId() == 16908332) && (locala != null) && ((locala.g() & 0x4) != 0)) {
      return m();
    }
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    j().b(paramBundle);
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    j().h();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    j().c(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    j().i();
  }
  
  protected void onStop()
  {
    super.onStop();
    j().j();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    j().a(paramCharSequence);
  }
  
  public void openOptionsMenu()
  {
    a locala = k();
    if ((getWindow().hasFeature(0)) && ((locala == null) || (!locala.k()))) {
      super.openOptionsMenu();
    }
  }
  
  public void setContentView(int paramInt)
  {
    j().c(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    j().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    j().b(paramView, paramLayoutParams);
  }
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    this.o = paramInt;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */