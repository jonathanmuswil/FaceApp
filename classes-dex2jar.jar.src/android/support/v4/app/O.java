package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.d.b;
import android.arch.lifecycle.h;
import android.arch.lifecycle.t;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import vd;

public class o
  extends ja
  implements t, b.a, b.c
{
  final Handler c = new n(this);
  final q d = q.a(new a());
  private android.arch.lifecycle.s e;
  boolean f;
  boolean g;
  boolean h = true;
  boolean i;
  boolean j;
  boolean k;
  int l;
  vd<String> m;
  
  private static boolean a(s params, d.b paramb)
  {
    params = params.c().iterator();
    boolean bool1 = false;
    while (params.hasNext())
    {
      Object localObject = (l)params.next();
      if (localObject != null)
      {
        boolean bool2 = bool1;
        if (((l)localObject).ka().a().a(d.b.d))
        {
          ((l)localObject).U.a(paramb);
          bool2 = true;
        }
        localObject = ((l)localObject).yb();
        bool1 = bool2;
        if (localObject != null) {
          bool1 = bool2 | a((s)localObject, paramb);
        }
      }
    }
    return bool1;
  }
  
  private int b(l paraml)
  {
    if (this.m.b() < 65534)
    {
      while (this.m.c(this.l) >= 0) {
        this.l = ((this.l + 1) % 65534);
      }
      int n = this.l;
      this.m.c(n, paraml.h);
      this.l = ((this.l + 1) % 65534);
      return n;
    }
    throw new IllegalStateException("Too many pending Fragment activity results.");
  }
  
  static void b(int paramInt)
  {
    if ((paramInt & 0xFFFF0000) == 0) {
      return;
    }
    throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
  }
  
  private void j()
  {
    while (a(e(), d.b.c)) {}
  }
  
  final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.d.a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public final void a(int paramInt)
  {
    if ((!this.i) && (paramInt != -1)) {
      b(paramInt);
    }
  }
  
  public void a(l paraml) {}
  
  public void a(l paraml, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    this.k = true;
    if (paramInt == -1) {}
    try
    {
      b.a(this, paramIntent, -1, paramBundle);
      return;
    }
    finally
    {
      this.k = false;
    }
    b(paramInt);
    b.a(this, paramIntent, (b(paraml) + 1 << 16) + (paramInt & 0xFFFF), paramBundle);
    this.k = false;
  }
  
  protected boolean a(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("  ");
    localObject = ((StringBuilder)localObject).toString();
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.h);
    if (getApplication() != null) {
      Y.a(this).a((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.d.j().a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public s e()
  {
    return this.d.j();
  }
  
  @Deprecated
  public Y f()
  {
    return Y.a(this);
  }
  
  protected void g()
  {
    this.d.f();
  }
  
  public Object h()
  {
    return null;
  }
  
  @Deprecated
  public void i()
  {
    invalidateOptionsMenu();
  }
  
  public d ka()
  {
    return super.ka();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.d.k();
    int n = paramInt1 >> 16;
    if (n != 0)
    {
      n--;
      localObject = (String)this.m.b(n);
      this.m.e(n);
      if (localObject == null)
      {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        return;
      }
      l locall = this.d.a((String)localObject);
      if (locall == null)
      {
        paramIntent = new StringBuilder();
        paramIntent.append("Activity result no fragment exists for who: ");
        paramIntent.append((String)localObject);
        Log.w("FragmentActivity", paramIntent.toString());
      }
      else
      {
        locall.a(paramInt1 & 0xFFFF, paramInt2, paramIntent);
      }
      return;
    }
    Object localObject = b.a();
    if ((localObject != null) && (((b.b)localObject).a(this, paramInt1, paramInt2, paramIntent))) {
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    s locals = this.d.j();
    boolean bool = locals.d();
    if ((bool) && (Build.VERSION.SDK_INT <= 25)) {
      return;
    }
    if ((bool) || (!locals.f())) {
      super.onBackPressed();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.d.k();
    this.d.a(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    Object localObject1 = this.d;
    Object localObject2 = null;
    ((q)localObject1).a(null);
    super.onCreate(paramBundle);
    b localb = (b)getLastNonConfigurationInstance();
    if (localb != null)
    {
      localObject1 = localb.b;
      if ((localObject1 != null) && (this.e == null)) {
        this.e = ((android.arch.lifecycle.s)localObject1);
      }
    }
    if (paramBundle != null)
    {
      Parcelable localParcelable = paramBundle.getParcelable("android:support:fragments");
      localObject1 = this.d;
      if (localb != null) {
        localObject2 = localb.c;
      }
      ((q)localObject1).a(localParcelable, (A)localObject2);
      if (paramBundle.containsKey("android:support:next_request_index"))
      {
        this.l = paramBundle.getInt("android:support:next_request_index");
        localObject2 = paramBundle.getIntArray("android:support:request_indicies");
        paramBundle = paramBundle.getStringArray("android:support:request_fragment_who");
        int n;
        if ((localObject2 != null) && (paramBundle != null) && (localObject2.length == paramBundle.length))
        {
          this.m = new vd(localObject2.length);
          n = 0;
        }
        while (n < localObject2.length)
        {
          this.m.c(localObject2[n], paramBundle[n]);
          n++;
          continue;
          Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
        }
      }
    }
    if (this.m == null)
    {
      this.m = new vd();
      this.l = 0;
    }
    this.d.b();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0) {
      return super.onCreatePanelMenu(paramInt, paramMenu) | this.d.a(paramMenu, getMenuInflater());
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = a(paramView, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = a(null, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.e != null) && (!isChangingConfigurations())) {
      this.e.a();
    }
    this.d.c();
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.d.d();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    if (paramInt != 0)
    {
      if (paramInt != 6) {
        return false;
      }
      return this.d.a(paramMenuItem);
    }
    return this.d.b(paramMenuItem);
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    this.d.a(paramBoolean);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.d.k();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0) {
      this.d.a(paramMenu);
    }
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPause()
  {
    super.onPause();
    this.g = false;
    if (this.c.hasMessages(2))
    {
      this.c.removeMessages(2);
      g();
    }
    this.d.e();
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
    this.d.b(paramBoolean);
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    this.c.removeMessages(2);
    g();
    this.d.i();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null)) {
      return a(paramView, paramMenu) | this.d.b(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.d.k();
    int n = paramInt >> 16 & 0xFFFF;
    if (n != 0)
    {
      n--;
      String str = (String)this.m.b(n);
      this.m.e(n);
      if (str == null)
      {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        return;
      }
      l locall = this.d.a(str);
      if (locall == null)
      {
        paramArrayOfString = new StringBuilder();
        paramArrayOfString.append("Activity result no fragment exists for who: ");
        paramArrayOfString.append(str);
        Log.w("FragmentActivity", paramArrayOfString.toString());
      }
      else
      {
        locall.a(paramInt & 0xFFFF, paramArrayOfString, paramArrayOfInt);
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    this.c.sendEmptyMessage(2);
    this.g = true;
    this.d.i();
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    Object localObject = h();
    A localA = this.d.l();
    if ((localA == null) && (this.e == null) && (localObject == null)) {
      return null;
    }
    b localb = new b();
    localb.a = localObject;
    localb.b = this.e;
    localb.c = localA;
    return localb;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    j();
    Object localObject = this.d.m();
    if (localObject != null) {
      paramBundle.putParcelable("android:support:fragments", (Parcelable)localObject);
    }
    if (this.m.b() > 0)
    {
      paramBundle.putInt("android:support:next_request_index", this.l);
      localObject = new int[this.m.b()];
      String[] arrayOfString = new String[this.m.b()];
      for (int n = 0; n < this.m.b(); n++)
      {
        localObject[n] = this.m.d(n);
        arrayOfString[n] = ((String)this.m.f(n));
      }
      paramBundle.putIntArray("android:support:request_indicies", (int[])localObject);
      paramBundle.putStringArray("android:support:request_fragment_who", arrayOfString);
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    this.h = false;
    if (!this.f)
    {
      this.f = true;
      this.d.a();
    }
    this.d.k();
    this.d.i();
    this.d.g();
  }
  
  public void onStateNotSaved()
  {
    this.d.k();
  }
  
  protected void onStop()
  {
    super.onStop();
    this.h = true;
    j();
    this.d.h();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((!this.k) && (paramInt != -1)) {
      b(paramInt);
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if ((!this.k) && (paramInt != -1)) {
      b(paramInt);
    }
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4)
    throws IntentSender.SendIntentException
  {
    if ((!this.j) && (paramInt1 != -1)) {
      b(paramInt1);
    }
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
    throws IntentSender.SendIntentException
  {
    if ((!this.j) && (paramInt1 != -1)) {
      b(paramInt1);
    }
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public android.arch.lifecycle.s wa()
  {
    if (getApplication() != null)
    {
      if (this.e == null)
      {
        b localb = (b)getLastNonConfigurationInstance();
        if (localb != null) {
          this.e = localb.b;
        }
        if (this.e == null) {
          this.e = new android.arch.lifecycle.s();
        }
      }
      return this.e;
    }
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  class a
    extends r<o>
  {
    public a()
    {
      super();
    }
    
    public View a(int paramInt)
    {
      return o.this.findViewById(paramInt);
    }
    
    public void a(l paraml)
    {
      o.this.a(paraml);
    }
    
    public void a(l paraml, Intent paramIntent, int paramInt, Bundle paramBundle)
    {
      o.this.a(paraml, paramIntent, paramInt, paramBundle);
    }
    
    public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      o.this.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    
    public boolean a()
    {
      Window localWindow = o.this.getWindow();
      boolean bool;
      if ((localWindow != null) && (localWindow.peekDecorView() != null)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean b(l paraml)
    {
      boolean bool;
      if (!o.this.isFinishing()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public LayoutInflater f()
    {
      return o.this.getLayoutInflater().cloneInContext(o.this);
    }
    
    public int g()
    {
      Window localWindow = o.this.getWindow();
      int i;
      if (localWindow == null) {
        i = 0;
      } else {
        i = localWindow.getAttributes().windowAnimations;
      }
      return i;
    }
    
    public boolean h()
    {
      boolean bool;
      if (o.this.getWindow() != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void i()
    {
      o.this.i();
    }
  }
  
  static final class b
  {
    Object a;
    android.arch.lifecycle.s b;
    A c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */