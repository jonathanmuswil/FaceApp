package android.support.v7.app;

import Gd;
import Id;
import Ld;
import Md;
import Od;
import Pd;
import Vd;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.view.g;
import android.support.v4.view.g.a;
import android.support.v4.view.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.v.a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.Cb;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Fb;
import android.support.v7.widget.U;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ka;
import android.support.v7.widget.pb;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.util.List;
import ke;
import ke.a;
import me;
import ne;
import oe.a;
import org.xmlpull.v1.XmlPullParser;
import pe;
import se;

class x
  extends o
  implements l.a, LayoutInflater.Factory2
{
  private static final boolean b;
  private static final int[] c;
  private static boolean d;
  private boolean A;
  boolean B;
  boolean C;
  boolean D;
  boolean E;
  boolean F;
  private boolean G;
  private f[] H;
  private f I;
  private boolean J;
  boolean K;
  private int L = -100;
  private boolean M;
  private d N;
  boolean O;
  int P;
  private final Runnable Q = new q(this);
  private boolean R;
  private Rect S;
  private Rect T;
  private AppCompatViewInflater U;
  final Context e;
  final Window f;
  final Window.Callback g;
  final Window.Callback h;
  final n i;
  a j;
  MenuInflater k;
  private CharSequence l;
  private U m;
  private a n;
  private g o;
  ke p;
  ActionBarContextView q;
  PopupWindow r;
  Runnable s;
  android.support.v4.view.J t = null;
  private boolean u = true;
  private boolean v;
  private ViewGroup w;
  private TextView x;
  private View y;
  private boolean z;
  
  static
  {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21) {
      bool = true;
    } else {
      bool = false;
    }
    b = bool;
    c = new int[] { 16842836 };
    if ((b) && (!d))
    {
      Thread.setDefaultUncaughtExceptionHandler(new p(Thread.getDefaultUncaughtExceptionHandler()));
      d = true;
    }
  }
  
  x(Context paramContext, Window paramWindow, n paramn)
  {
    this.e = paramContext;
    this.f = paramWindow;
    this.i = paramn;
    this.g = this.f.getCallback();
    paramWindow = this.g;
    if (!(paramWindow instanceof c))
    {
      this.h = new c(paramWindow);
      this.f.setCallback(this.h);
      paramContext = pb.a(paramContext, null, c);
      paramWindow = paramContext.c(0);
      if (paramWindow != null) {
        this.f.setBackgroundDrawable(paramWindow);
      }
      paramContext.a();
      return;
    }
    throw new IllegalStateException("AppCompat has already installed itself into the Window");
  }
  
  private void A()
  {
    if (!this.v) {
      return;
    }
    throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }
  
  private void a(f paramf, KeyEvent paramKeyEvent)
  {
    if ((!paramf.o) && (!this.K))
    {
      if (paramf.a == 0)
      {
        if ((this.e.getResources().getConfiguration().screenLayout & 0xF) == 4) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0) {
          return;
        }
      }
      Object localObject = o();
      if ((localObject != null) && (!((Window.Callback)localObject).onMenuOpened(paramf.a, paramf.j)))
      {
        a(paramf, true);
        return;
      }
      WindowManager localWindowManager = (WindowManager)this.e.getSystemService("window");
      if (localWindowManager == null) {
        return;
      }
      if (!b(paramf, paramKeyEvent)) {
        return;
      }
      if ((paramf.g != null) && (!paramf.q))
      {
        paramKeyEvent = paramf.i;
        if (paramKeyEvent != null)
        {
          paramKeyEvent = paramKeyEvent.getLayoutParams();
          if ((paramKeyEvent != null) && (paramKeyEvent.width == -1))
          {
            i1 = -1;
            break label343;
          }
        }
      }
      else
      {
        paramKeyEvent = paramf.g;
        if (paramKeyEvent == null)
        {
          if ((b(paramf)) && (paramf.g != null)) {}
        }
        else if ((paramf.q) && (paramKeyEvent.getChildCount() > 0)) {
          paramf.g.removeAllViews();
        }
        if ((!a(paramf)) || (!paramf.a())) {
          return;
        }
        localObject = paramf.h.getLayoutParams();
        paramKeyEvent = (KeyEvent)localObject;
        if (localObject == null) {
          paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
        }
        i1 = paramf.b;
        paramf.g.setBackgroundResource(i1);
        localObject = paramf.h.getParent();
        if ((localObject != null) && ((localObject instanceof ViewGroup))) {
          ((ViewGroup)localObject).removeView(paramf.h);
        }
        paramf.g.addView(paramf.h, paramKeyEvent);
        if (!paramf.h.hasFocus()) {
          paramf.h.requestFocus();
        }
      }
      int i1 = -2;
      label343:
      paramf.n = false;
      paramKeyEvent = new WindowManager.LayoutParams(i1, -2, paramf.d, paramf.e, 1002, 8519680, -3);
      paramKeyEvent.gravity = paramf.c;
      paramKeyEvent.windowAnimations = paramf.f;
      localWindowManager.addView(paramf.g, paramKeyEvent);
      paramf.o = true;
    }
  }
  
  private void a(l paraml, boolean paramBoolean)
  {
    paraml = this.m;
    if ((paraml != null) && (paraml.c()) && ((!ViewConfiguration.get(this.e).hasPermanentMenuKey()) || (this.m.d())))
    {
      paraml = o();
      if ((this.m.a()) && (paramBoolean))
      {
        this.m.e();
        if (!this.K) {
          paraml.onPanelClosed(108, a(0, true).j);
        }
      }
      else if ((paraml != null) && (!this.K))
      {
        if ((this.O) && ((this.P & 0x1) != 0))
        {
          this.f.getDecorView().removeCallbacks(this.Q);
          this.Q.run();
        }
        f localf = a(0, true);
        l locall = localf.j;
        if ((locall != null) && (!localf.r) && (paraml.onPreparePanel(0, localf.i, locall)))
        {
          paraml.onMenuOpened(108, localf.j);
          this.m.f();
        }
      }
      return;
    }
    paraml = a(0, true);
    paraml.q = true;
    a(paraml, false);
    a(paraml, null);
  }
  
  private boolean a(f paramf)
  {
    View localView = paramf.i;
    boolean bool = true;
    if (localView != null)
    {
      paramf.h = localView;
      return true;
    }
    if (paramf.j == null) {
      return false;
    }
    if (this.o == null) {
      this.o = new g();
    }
    paramf.h = ((View)paramf.a(this.o));
    if (paramf.h == null) {
      bool = false;
    }
    return bool;
  }
  
  private boolean a(f paramf, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool1 = paramKeyEvent.isSystem();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (!paramf.m)
    {
      bool1 = bool2;
      if (!b(paramf, paramKeyEvent)) {}
    }
    else
    {
      l locall = paramf.j;
      bool1 = bool2;
      if (locall != null) {
        bool1 = locall.performShortcut(paramInt1, paramKeyEvent, paramInt2);
      }
    }
    if ((bool1) && ((paramInt2 & 0x1) == 0) && (this.m == null)) {
      a(paramf, true);
    }
    return bool1;
  }
  
  private boolean a(ViewParent paramViewParent)
  {
    if (paramViewParent == null) {
      return false;
    }
    View localView = this.f.getDecorView();
    for (;;)
    {
      if (paramViewParent == null) {
        return true;
      }
      if ((paramViewParent == localView) || (!(paramViewParent instanceof View)) || (android.support.v4.view.y.A((View)paramViewParent))) {
        break;
      }
      paramViewParent = paramViewParent.getParent();
    }
    return false;
  }
  
  private boolean b(f paramf)
  {
    paramf.a(m());
    paramf.g = new e(paramf.l);
    paramf.c = 81;
    return true;
  }
  
  private boolean b(f paramf, KeyEvent paramKeyEvent)
  {
    if (this.K) {
      return false;
    }
    if (paramf.m) {
      return true;
    }
    Object localObject1 = this.I;
    if ((localObject1 != null) && (localObject1 != paramf)) {
      a((f)localObject1, false);
    }
    localObject1 = o();
    if (localObject1 != null) {
      paramf.i = ((Window.Callback)localObject1).onCreatePanelView(paramf.a);
    }
    int i1 = paramf.a;
    if ((i1 != 0) && (i1 != 108)) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    Object localObject2;
    if (i1 != 0)
    {
      localObject2 = this.m;
      if (localObject2 != null) {
        ((U)localObject2).b();
      }
    }
    if (paramf.i == null)
    {
      if (i1 != 0) {
        r();
      }
      if ((paramf.j == null) || (paramf.r))
      {
        if ((paramf.j == null) && ((!c(paramf)) || (paramf.j == null))) {
          return false;
        }
        if ((i1 != 0) && (this.m != null))
        {
          if (this.n == null) {
            this.n = new a();
          }
          this.m.a(paramf.j, this.n);
        }
        paramf.j.s();
        if (!((Window.Callback)localObject1).onCreatePanelMenu(paramf.a, paramf.j))
        {
          paramf.a(null);
          if (i1 != 0)
          {
            paramf = this.m;
            if (paramf != null) {
              paramf.a(null, this.n);
            }
          }
          return false;
        }
        paramf.r = false;
      }
      paramf.j.s();
      localObject2 = paramf.s;
      if (localObject2 != null)
      {
        paramf.j.a((Bundle)localObject2);
        paramf.s = null;
      }
      if (!((Window.Callback)localObject1).onPreparePanel(0, paramf.i, paramf.j))
      {
        if (i1 != 0)
        {
          paramKeyEvent = this.m;
          if (paramKeyEvent != null) {
            paramKeyEvent.a(null, this.n);
          }
        }
        paramf.j.r();
        return false;
      }
      if (paramKeyEvent != null) {
        i1 = paramKeyEvent.getDeviceId();
      } else {
        i1 = -1;
      }
      boolean bool;
      if (KeyCharacterMap.load(i1).getKeyboardType() != 1) {
        bool = true;
      } else {
        bool = false;
      }
      paramf.p = bool;
      paramf.j.setQwertyMode(paramf.p);
      paramf.j.r();
    }
    paramf.m = true;
    paramf.n = false;
    this.I = paramf;
    return true;
  }
  
  private boolean c(f paramf)
  {
    Context localContext = this.e;
    int i1 = paramf.a;
    if (i1 != 0)
    {
      localObject1 = localContext;
      if (i1 != 108) {}
    }
    else
    {
      localObject1 = localContext;
      if (this.m != null)
      {
        TypedValue localTypedValue = new TypedValue();
        Resources.Theme localTheme = localContext.getTheme();
        localTheme.resolveAttribute(Gd.actionBarTheme, localTypedValue, true);
        localObject1 = null;
        if (localTypedValue.resourceId != 0)
        {
          localObject1 = localContext.getResources().newTheme();
          ((Resources.Theme)localObject1).setTo(localTheme);
          ((Resources.Theme)localObject1).applyStyle(localTypedValue.resourceId, true);
          ((Resources.Theme)localObject1).resolveAttribute(Gd.actionBarWidgetTheme, localTypedValue, true);
        }
        else
        {
          localTheme.resolveAttribute(Gd.actionBarWidgetTheme, localTypedValue, true);
        }
        Object localObject2 = localObject1;
        if (localTypedValue.resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localContext.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(localTypedValue.resourceId, true);
        }
        localObject1 = localContext;
        if (localObject2 != null)
        {
          localObject1 = new me(localContext, 0);
          ((me)localObject1).getTheme().setTo((Resources.Theme)localObject2);
        }
      }
    }
    Object localObject1 = new l((Context)localObject1);
    ((l)localObject1).a(this);
    paramf.a((l)localObject1);
    return true;
  }
  
  private boolean d(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getRepeatCount() == 0)
    {
      f localf = a(paramInt, true);
      if (!localf.o) {
        return b(localf, paramKeyEvent);
      }
    }
    return false;
  }
  
  private boolean e(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.p != null) {
      return false;
    }
    f localf = a(paramInt, true);
    boolean bool;
    if (paramInt == 0)
    {
      U localU = this.m;
      if ((localU != null) && (localU.c()) && (!ViewConfiguration.get(this.e).hasPermanentMenuKey()))
      {
        if (!this.m.a())
        {
          if ((this.K) || (!b(localf, paramKeyEvent))) {
            break label177;
          }
          bool = this.m.f();
          break label195;
        }
        bool = this.m.e();
        break label195;
      }
    }
    if ((!localf.o) && (!localf.n))
    {
      if (localf.m)
      {
        if (localf.r)
        {
          localf.m = false;
          bool = b(localf, paramKeyEvent);
        }
        else
        {
          bool = true;
        }
        if (bool)
        {
          a(localf, paramKeyEvent);
          bool = true;
          break label195;
        }
      }
      label177:
      bool = false;
    }
    else
    {
      bool = localf.o;
      a(localf, true);
    }
    label195:
    if (bool)
    {
      paramKeyEvent = (AudioManager)this.e.getSystemService("audio");
      if (paramKeyEvent != null) {
        paramKeyEvent.playSoundEffect(0);
      } else {
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
      }
    }
    return bool;
  }
  
  private void j(int paramInt)
  {
    this.P = (1 << paramInt | this.P);
    if (!this.O)
    {
      android.support.v4.view.y.a(this.f.getDecorView(), this.Q);
      this.O = true;
    }
  }
  
  private int k(int paramInt)
  {
    if (paramInt == 8)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      return 108;
    }
    int i1 = paramInt;
    if (paramInt == 9)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
      i1 = 109;
    }
    return i1;
  }
  
  private boolean l(int paramInt)
  {
    Resources localResources = this.e.getResources();
    Configuration localConfiguration = localResources.getConfiguration();
    int i1 = localConfiguration.uiMode;
    if (paramInt == 2) {
      paramInt = 32;
    } else {
      paramInt = 16;
    }
    if ((i1 & 0x30) != paramInt)
    {
      if (z())
      {
        ((Activity)this.e).recreate();
      }
      else
      {
        localConfiguration = new Configuration(localConfiguration);
        DisplayMetrics localDisplayMetrics = localResources.getDisplayMetrics();
        localConfiguration.uiMode = (paramInt | localConfiguration.uiMode & 0xFFFFFFCF);
        localResources.updateConfiguration(localConfiguration, localDisplayMetrics);
        if (Build.VERSION.SDK_INT < 26) {
          D.a(localResources);
        }
      }
      return true;
    }
    return false;
  }
  
  private void t()
  {
    ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)this.w.findViewById(16908290);
    Object localObject = this.f.getDecorView();
    localContentFrameLayout.a(((View)localObject).getPaddingLeft(), ((View)localObject).getPaddingTop(), ((View)localObject).getPaddingRight(), ((View)localObject).getPaddingBottom());
    localObject = this.e.obtainStyledAttributes(Pd.AppCompatTheme);
    ((TypedArray)localObject).getValue(Pd.AppCompatTheme_windowMinWidthMajor, localContentFrameLayout.getMinWidthMajor());
    ((TypedArray)localObject).getValue(Pd.AppCompatTheme_windowMinWidthMinor, localContentFrameLayout.getMinWidthMinor());
    if (((TypedArray)localObject).hasValue(Pd.AppCompatTheme_windowFixedWidthMajor)) {
      ((TypedArray)localObject).getValue(Pd.AppCompatTheme_windowFixedWidthMajor, localContentFrameLayout.getFixedWidthMajor());
    }
    if (((TypedArray)localObject).hasValue(Pd.AppCompatTheme_windowFixedWidthMinor)) {
      ((TypedArray)localObject).getValue(Pd.AppCompatTheme_windowFixedWidthMinor, localContentFrameLayout.getFixedWidthMinor());
    }
    if (((TypedArray)localObject).hasValue(Pd.AppCompatTheme_windowFixedHeightMajor)) {
      ((TypedArray)localObject).getValue(Pd.AppCompatTheme_windowFixedHeightMajor, localContentFrameLayout.getFixedHeightMajor());
    }
    if (((TypedArray)localObject).hasValue(Pd.AppCompatTheme_windowFixedHeightMinor)) {
      ((TypedArray)localObject).getValue(Pd.AppCompatTheme_windowFixedHeightMinor, localContentFrameLayout.getFixedHeightMinor());
    }
    ((TypedArray)localObject).recycle();
    localContentFrameLayout.requestLayout();
  }
  
  private ViewGroup u()
  {
    Object localObject1 = this.e.obtainStyledAttributes(Pd.AppCompatTheme);
    if (((TypedArray)localObject1).hasValue(Pd.AppCompatTheme_windowActionBar))
    {
      if (((TypedArray)localObject1).getBoolean(Pd.AppCompatTheme_windowNoTitle, false)) {
        b(1);
      } else if (((TypedArray)localObject1).getBoolean(Pd.AppCompatTheme_windowActionBar, false)) {
        b(108);
      }
      if (((TypedArray)localObject1).getBoolean(Pd.AppCompatTheme_windowActionBarOverlay, false)) {
        b(109);
      }
      if (((TypedArray)localObject1).getBoolean(Pd.AppCompatTheme_windowActionModeOverlay, false)) {
        b(10);
      }
      this.E = ((TypedArray)localObject1).getBoolean(Pd.AppCompatTheme_android_windowIsFloating, false);
      ((TypedArray)localObject1).recycle();
      this.f.getDecorView();
      localObject1 = LayoutInflater.from(this.e);
      Object localObject2;
      if (!this.F)
      {
        if (this.E)
        {
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(Md.abc_dialog_title_material, null);
          this.C = false;
          this.B = false;
        }
        else if (this.B)
        {
          localObject1 = new TypedValue();
          this.e.getTheme().resolveAttribute(Gd.actionBarTheme, (TypedValue)localObject1, true);
          int i1 = ((TypedValue)localObject1).resourceId;
          if (i1 != 0) {
            localObject1 = new me(this.e, i1);
          } else {
            localObject1 = this.e;
          }
          localObject2 = (ViewGroup)LayoutInflater.from((Context)localObject1).inflate(Md.abc_screen_toolbar, null);
          this.m = ((U)((ViewGroup)localObject2).findViewById(Ld.decor_content_parent));
          this.m.setWindowCallback(o());
          if (this.C) {
            this.m.a(109);
          }
          if (this.z) {
            this.m.a(2);
          }
          localObject1 = localObject2;
          if (this.A)
          {
            this.m.a(5);
            localObject1 = localObject2;
          }
        }
        else
        {
          localObject1 = null;
        }
      }
      else
      {
        if (this.D) {
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(Md.abc_screen_simple_overlay_action_mode, null);
        } else {
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(Md.abc_screen_simple, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
          android.support.v4.view.y.a((View)localObject1, new r(this));
        } else {
          ((ka)localObject1).setOnFitSystemWindowsListener(new s(this));
        }
      }
      if (localObject1 != null)
      {
        if (this.m == null) {
          this.x = ((TextView)((ViewGroup)localObject1).findViewById(Ld.title));
        }
        Fb.b((View)localObject1);
        ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)((ViewGroup)localObject1).findViewById(Ld.action_bar_activity_content);
        ViewGroup localViewGroup = (ViewGroup)this.f.findViewById(16908290);
        if (localViewGroup != null)
        {
          while (localViewGroup.getChildCount() > 0)
          {
            localObject2 = localViewGroup.getChildAt(0);
            localViewGroup.removeViewAt(0);
            localContentFrameLayout.addView((View)localObject2);
          }
          localViewGroup.setId(-1);
          localContentFrameLayout.setId(16908290);
          if ((localViewGroup instanceof FrameLayout)) {
            ((FrameLayout)localViewGroup).setForeground(null);
          }
        }
        this.f.setContentView((View)localObject1);
        localContentFrameLayout.setAttachListener(new t(this));
        return (ViewGroup)localObject1;
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("AppCompat does not support the current theme features: { windowActionBar: ");
      ((StringBuilder)localObject1).append(this.B);
      ((StringBuilder)localObject1).append(", windowActionBarOverlay: ");
      ((StringBuilder)localObject1).append(this.C);
      ((StringBuilder)localObject1).append(", android:windowIsFloating: ");
      ((StringBuilder)localObject1).append(this.E);
      ((StringBuilder)localObject1).append(", windowActionModeOverlay: ");
      ((StringBuilder)localObject1).append(this.D);
      ((StringBuilder)localObject1).append(", windowNoTitle: ");
      ((StringBuilder)localObject1).append(this.F);
      ((StringBuilder)localObject1).append(" }");
      throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
    }
    ((TypedArray)localObject1).recycle();
    throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
  }
  
  private void v()
  {
    if (this.N == null) {
      this.N = new d(F.a(this.e));
    }
  }
  
  private void w()
  {
    if (!this.v)
    {
      this.w = u();
      Object localObject1 = n();
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        Object localObject2 = this.m;
        if (localObject2 != null)
        {
          ((U)localObject2).setWindowTitle((CharSequence)localObject1);
        }
        else if (r() != null)
        {
          r().a((CharSequence)localObject1);
        }
        else
        {
          localObject2 = this.x;
          if (localObject2 != null) {
            ((TextView)localObject2).setText((CharSequence)localObject1);
          }
        }
      }
      t();
      a(this.w);
      this.v = true;
      localObject1 = a(0, false);
      if ((!this.K) && ((localObject1 == null) || (((f)localObject1).j == null))) {
        j(108);
      }
    }
  }
  
  private int x()
  {
    int i1 = this.L;
    if (i1 == -100) {
      i1 = o.b();
    }
    return i1;
  }
  
  private void y()
  {
    w();
    if ((this.B) && (this.j == null))
    {
      Object localObject = this.g;
      if ((localObject instanceof Activity)) {
        this.j = new J((Activity)localObject, this.C);
      } else if ((localObject instanceof Dialog)) {
        this.j = new J((Dialog)localObject);
      }
      localObject = this.j;
      if (localObject != null) {
        ((a)localObject).c(this.R);
      }
    }
  }
  
  private boolean z()
  {
    boolean bool1 = this.M;
    boolean bool2 = false;
    if (bool1)
    {
      Object localObject = this.e;
      if ((localObject instanceof Activity))
      {
        PackageManager localPackageManager = ((Context)localObject).getPackageManager();
        try
        {
          localObject = new android/content/ComponentName;
          ((ComponentName)localObject).<init>(this.e, this.e.getClass());
          int i1 = localPackageManager.getActivityInfo((ComponentName)localObject, 0).configChanges;
          if ((i1 & 0x200) == 0) {
            bool2 = true;
          }
          return bool2;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", localNameNotFoundException);
          return true;
        }
      }
    }
    return false;
  }
  
  protected f a(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = this.H;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (localObject1.length > paramInt) {}
    }
    else
    {
      localObject2 = new f[paramInt + 1];
      if (localObject1 != null) {
        System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
      }
      this.H = ((f[])localObject2);
    }
    Object localObject3 = localObject2[paramInt];
    localObject1 = localObject3;
    if (localObject3 == null)
    {
      localObject1 = new f(paramInt);
      localObject2[paramInt] = localObject1;
    }
    return (f)localObject1;
  }
  
  f a(Menu paramMenu)
  {
    f[] arrayOff = this.H;
    int i1 = 0;
    int i2;
    if (arrayOff != null) {
      i2 = arrayOff.length;
    } else {
      i2 = 0;
    }
    while (i1 < i2)
    {
      f localf = arrayOff[i1];
      if ((localf != null) && (localf.j == paramMenu)) {
        return localf;
      }
      i1++;
    }
    return null;
  }
  
  public <T extends View> T a(int paramInt)
  {
    w();
    return this.f.findViewById(paramInt);
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatViewInflater localAppCompatViewInflater = this.U;
    boolean bool = false;
    if (localAppCompatViewInflater == null)
    {
      String str = this.e.obtainStyledAttributes(Pd.AppCompatTheme).getString(Pd.AppCompatTheme_viewInflaterClass);
      if ((str != null) && (!AppCompatViewInflater.class.getName().equals(str))) {
        try
        {
          this.U = ((AppCompatViewInflater)Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        catch (Throwable localThrowable)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed to instantiate custom view inflater ");
          localStringBuilder.append(str);
          localStringBuilder.append(". Falling back to default.");
          Log.i("AppCompatDelegate", localStringBuilder.toString(), localThrowable);
          this.U = new AppCompatViewInflater();
        }
      } else {
        this.U = new AppCompatViewInflater();
      }
    }
    if (b)
    {
      if ((paramAttributeSet instanceof XmlPullParser))
      {
        if (((XmlPullParser)paramAttributeSet).getDepth() > 1) {
          bool = true;
        }
      }
      else {
        bool = a((ViewParent)paramView);
      }
    }
    else {
      bool = false;
    }
    return this.U.createView(paramView, paramString, paramContext, paramAttributeSet, bool, b, true, Cb.b());
  }
  
  public ke a(ke.a parama)
  {
    if (parama != null)
    {
      Object localObject = this.p;
      if (localObject != null) {
        ((ke)localObject).a();
      }
      parama = new b(parama);
      localObject = d();
      if (localObject != null)
      {
        this.p = ((a)localObject).a(parama);
        localObject = this.p;
        if (localObject != null)
        {
          n localn = this.i;
          if (localn != null) {
            localn.b((ke)localObject);
          }
        }
      }
      if (this.p == null) {
        this.p = b(parama);
      }
      return this.p;
    }
    throw new IllegalArgumentException("ActionMode callback can not be null.");
  }
  
  void a(int paramInt, f paramf, Menu paramMenu)
  {
    Object localObject1 = paramf;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      f localf = paramf;
      if (paramf == null)
      {
        localf = paramf;
        if (paramInt >= 0)
        {
          localObject2 = this.H;
          localf = paramf;
          if (paramInt < localObject2.length) {
            localf = localObject2[paramInt];
          }
        }
      }
      localObject1 = localf;
      localObject2 = paramMenu;
      if (localf != null)
      {
        localObject2 = localf.j;
        localObject1 = localf;
      }
    }
    if ((localObject1 != null) && (!((f)localObject1).o)) {
      return;
    }
    if (!this.K) {
      this.g.onPanelClosed(paramInt, (Menu)localObject2);
    }
  }
  
  public void a(Configuration paramConfiguration)
  {
    if ((this.B) && (this.v))
    {
      a locala = d();
      if (locala != null) {
        locala.a(paramConfiguration);
      }
    }
    android.support.v7.widget.p.a().a(this.e);
    a();
  }
  
  public void a(Bundle paramBundle)
  {
    Object localObject1 = this.g;
    Object localObject2;
    if ((localObject1 instanceof Activity)) {
      localObject2 = null;
    }
    try
    {
      localObject1 = aa.b((Activity)localObject1);
      localObject2 = localObject1;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    if (localObject2 != null)
    {
      localObject2 = r();
      if (localObject2 == null) {
        this.R = true;
      } else {
        ((a)localObject2).c(true);
      }
    }
    if ((paramBundle != null) && (this.L == -100)) {
      this.L = paramBundle.getInt("appcompat:local_night_mode", -100);
    }
  }
  
  void a(f paramf, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramf.a == 0))
    {
      localObject = this.m;
      if ((localObject != null) && (((U)localObject).a()))
      {
        b(paramf.j);
        return;
      }
    }
    Object localObject = (WindowManager)this.e.getSystemService("window");
    if ((localObject != null) && (paramf.o))
    {
      ViewGroup localViewGroup = paramf.g;
      if (localViewGroup != null)
      {
        ((WindowManager)localObject).removeView(localViewGroup);
        if (paramBoolean) {
          a(paramf.a, paramf, null);
        }
      }
    }
    paramf.m = false;
    paramf.n = false;
    paramf.o = false;
    paramf.h = null;
    paramf.q = true;
    if (this.I == paramf) {
      this.I = null;
    }
  }
  
  public void a(l paraml)
  {
    a(paraml, true);
  }
  
  public void a(View paramView)
  {
    w();
    ViewGroup localViewGroup = (ViewGroup)this.w.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.g.onContentChanged();
  }
  
  public void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    w();
    ((ViewGroup)this.w.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.g.onContentChanged();
  }
  
  void a(ViewGroup paramViewGroup) {}
  
  public final void a(CharSequence paramCharSequence)
  {
    this.l = paramCharSequence;
    Object localObject = this.m;
    if (localObject != null)
    {
      ((U)localObject).setWindowTitle(paramCharSequence);
    }
    else if (r() != null)
    {
      r().a(paramCharSequence);
    }
    else
    {
      localObject = this.x;
      if (localObject != null) {
        ((TextView)localObject).setText(paramCharSequence);
      }
    }
  }
  
  public boolean a()
  {
    int i1 = x();
    int i2 = f(i1);
    boolean bool;
    if (i2 != -1) {
      bool = l(i2);
    } else {
      bool = false;
    }
    if (i1 == 0)
    {
      v();
      this.N.d();
    }
    this.M = true;
    return bool;
  }
  
  boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if (paramInt != 4)
    {
      if (paramInt == 82)
      {
        d(0, paramKeyEvent);
        return true;
      }
    }
    else
    {
      if ((paramKeyEvent.getFlags() & 0x80) == 0) {
        bool = false;
      }
      this.J = bool;
    }
    return false;
  }
  
  public boolean a(l paraml, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = o();
    if ((localCallback != null) && (!this.K))
    {
      paraml = a(paraml.m());
      if (paraml != null) {
        return localCallback.onMenuItemSelected(paraml.a, paramMenuItem);
      }
    }
    return false;
  }
  
  boolean a(KeyEvent paramKeyEvent)
  {
    Object localObject = this.g;
    boolean bool = localObject instanceof g.a;
    int i1 = 1;
    if ((bool) || ((localObject instanceof B)))
    {
      localObject = this.f.getDecorView();
      if ((localObject != null) && (g.a((View)localObject, paramKeyEvent))) {
        return true;
      }
    }
    if ((paramKeyEvent.getKeyCode() == 82) && (this.g.dispatchKeyEvent(paramKeyEvent))) {
      return true;
    }
    int i2 = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() != 0) {
      i1 = 0;
    }
    if (i1 != 0) {
      bool = a(i2, paramKeyEvent);
    } else {
      bool = c(i2, paramKeyEvent);
    }
    return bool;
  }
  
  ke b(ke.a parama)
  {
    l();
    Object localObject1 = this.p;
    if (localObject1 != null) {
      ((ke)localObject1).a();
    }
    localObject1 = parama;
    if (!(parama instanceof b)) {
      localObject1 = new b(parama);
    }
    parama = this.i;
    if ((parama != null) && (!this.K)) {}
    try
    {
      parama = parama.a((ke.a)localObject1);
    }
    catch (AbstractMethodError parama)
    {
      boolean bool;
      Object localObject2;
      Resources.Theme localTheme;
      int i1;
      for (;;) {}
    }
    parama = null;
    if (parama != null)
    {
      this.p = parama;
    }
    else
    {
      parama = this.q;
      bool = true;
      if (parama == null) {
        if (this.E)
        {
          localObject2 = new TypedValue();
          parama = this.e.getTheme();
          parama.resolveAttribute(Gd.actionBarTheme, (TypedValue)localObject2, true);
          if (((TypedValue)localObject2).resourceId != 0)
          {
            localTheme = this.e.getResources().newTheme();
            localTheme.setTo(parama);
            localTheme.applyStyle(((TypedValue)localObject2).resourceId, true);
            parama = new me(this.e, 0);
            parama.getTheme().setTo(localTheme);
          }
          else
          {
            parama = this.e;
          }
          this.q = new ActionBarContextView(parama);
          this.r = new PopupWindow(parama, null, Gd.actionModePopupWindowStyle);
          android.support.v4.widget.s.a(this.r, 2);
          this.r.setContentView(this.q);
          this.r.setWidth(-1);
          parama.getTheme().resolveAttribute(Gd.actionBarSize, (TypedValue)localObject2, true);
          i1 = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject2).data, parama.getResources().getDisplayMetrics());
          this.q.setContentHeight(i1);
          this.r.setHeight(-2);
          this.s = new v(this);
        }
        else
        {
          parama = (ViewStubCompat)this.w.findViewById(Ld.action_mode_bar_stub);
          if (parama != null)
          {
            parama.setLayoutInflater(LayoutInflater.from(m()));
            this.q = ((ActionBarContextView)parama.a());
          }
        }
      }
      if (this.q != null)
      {
        l();
        this.q.c();
        parama = this.q.getContext();
        localObject2 = this.q;
        if (this.r != null) {
          bool = false;
        }
        parama = new ne(parama, (ActionBarContextView)localObject2, (ke.a)localObject1, bool);
        if (((ke.a)localObject1).a(parama, parama.c()))
        {
          parama.i();
          this.q.a(parama);
          this.p = parama;
          if (s())
          {
            this.q.setAlpha(0.0F);
            parama = android.support.v4.view.y.a(this.q);
            parama.a(1.0F);
            this.t = parama;
            this.t.a(new w(this));
          }
          else
          {
            this.q.setAlpha(1.0F);
            this.q.setVisibility(0);
            this.q.sendAccessibilityEvent(32);
            if ((this.q.getParent() instanceof View)) {
              android.support.v4.view.y.F((View)this.q.getParent());
            }
          }
          if (this.r != null) {
            this.f.getDecorView().post(this.s);
          }
        }
        else
        {
          this.p = null;
        }
      }
    }
    parama = this.p;
    if (parama != null)
    {
      localObject1 = this.i;
      if (localObject1 != null) {
        ((n)localObject1).b(parama);
      }
    }
    return this.p;
  }
  
  public void b(Bundle paramBundle)
  {
    w();
  }
  
  void b(l paraml)
  {
    if (this.G) {
      return;
    }
    this.G = true;
    this.m.g();
    Window.Callback localCallback = o();
    if ((localCallback != null) && (!this.K)) {
      localCallback.onPanelClosed(108, paraml);
    }
    this.G = false;
  }
  
  public void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    w();
    ViewGroup localViewGroup = (ViewGroup)this.w.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.g.onContentChanged();
  }
  
  public boolean b(int paramInt)
  {
    paramInt = k(paramInt);
    if ((this.F) && (paramInt == 108)) {
      return false;
    }
    if ((this.B) && (paramInt == 1)) {
      this.B = false;
    }
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 5)
        {
          if (paramInt != 10)
          {
            if (paramInt != 108)
            {
              if (paramInt != 109) {
                return this.f.requestFeature(paramInt);
              }
              A();
              this.C = true;
              return true;
            }
            A();
            this.B = true;
            return true;
          }
          A();
          this.D = true;
          return true;
        }
        A();
        this.A = true;
        return true;
      }
      A();
      this.z = true;
      return true;
    }
    A();
    this.F = true;
    return true;
  }
  
  boolean b(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = d();
    if ((localObject != null) && (((a)localObject).a(paramInt, paramKeyEvent))) {
      return true;
    }
    localObject = this.I;
    if ((localObject != null) && (a((f)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent, 1)))
    {
      paramKeyEvent = this.I;
      if (paramKeyEvent != null) {
        paramKeyEvent.n = true;
      }
      return true;
    }
    if (this.I == null)
    {
      localObject = a(0, true);
      b((f)localObject, paramKeyEvent);
      boolean bool = a((f)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
      ((f)localObject).m = false;
      if (bool) {
        return true;
      }
    }
    return false;
  }
  
  public MenuInflater c()
  {
    if (this.k == null)
    {
      y();
      Object localObject = this.j;
      if (localObject != null) {
        localObject = ((a)localObject).h();
      } else {
        localObject = this.e;
      }
      this.k = new pe((Context)localObject);
    }
    return this.k;
  }
  
  public void c(int paramInt)
  {
    w();
    ViewGroup localViewGroup = (ViewGroup)this.w.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.e).inflate(paramInt, localViewGroup);
    this.g.onContentChanged();
  }
  
  public void c(Bundle paramBundle)
  {
    int i1 = this.L;
    if (i1 != -100) {
      paramBundle.putInt("appcompat:local_night_mode", i1);
    }
  }
  
  boolean c(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt != 4)
    {
      if (paramInt == 82)
      {
        e(0, paramKeyEvent);
        return true;
      }
    }
    else
    {
      boolean bool = this.J;
      this.J = false;
      paramKeyEvent = a(0, false);
      if ((paramKeyEvent != null) && (paramKeyEvent.o))
      {
        if (!bool) {
          a(paramKeyEvent, true);
        }
        return true;
      }
      if (q()) {
        return true;
      }
    }
    return false;
  }
  
  public a d()
  {
    y();
    return this.j;
  }
  
  void d(int paramInt)
  {
    a(a(paramInt, true), true);
  }
  
  public void e()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.e);
    if (localLayoutInflater.getFactory() == null) {
      h.a(localLayoutInflater, this);
    } else if (!(localLayoutInflater.getFactory2() instanceof x)) {
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
    }
  }
  
  void e(int paramInt)
  {
    f localf = a(paramInt, true);
    Object localObject;
    if (localf.j != null)
    {
      localObject = new Bundle();
      localf.j.b((Bundle)localObject);
      if (((Bundle)localObject).size() > 0) {
        localf.s = ((Bundle)localObject);
      }
      localf.j.s();
      localf.j.clear();
    }
    localf.r = true;
    localf.q = true;
    if (((paramInt == 108) || (paramInt == 0)) && (this.m != null))
    {
      localObject = a(0, false);
      if (localObject != null)
      {
        ((f)localObject).m = false;
        b((f)localObject, null);
      }
    }
  }
  
  int f(int paramInt)
  {
    if (paramInt != -100)
    {
      if (paramInt != 0) {
        return paramInt;
      }
      if ((Build.VERSION.SDK_INT >= 23) && (((UiModeManager)this.e.getSystemService(UiModeManager.class)).getNightMode() == 0)) {
        return -1;
      }
      v();
      return this.N.c();
    }
    return -1;
  }
  
  public void f()
  {
    a locala = d();
    if ((locala != null) && (locala.i())) {
      return;
    }
    j(0);
  }
  
  public void g()
  {
    if (this.O) {
      this.f.getDecorView().removeCallbacks(this.Q);
    }
    this.K = true;
    Object localObject = this.j;
    if (localObject != null) {
      ((a)localObject).j();
    }
    localObject = this.N;
    if (localObject != null) {
      ((d)localObject).a();
    }
  }
  
  void g(int paramInt)
  {
    if (paramInt == 108)
    {
      a locala = d();
      if (locala != null) {
        locala.b(true);
      }
    }
  }
  
  public void h()
  {
    a locala = d();
    if (locala != null) {
      locala.d(true);
    }
  }
  
  void h(int paramInt)
  {
    Object localObject;
    if (paramInt == 108)
    {
      localObject = d();
      if (localObject != null) {
        ((a)localObject).b(false);
      }
    }
    else if (paramInt == 0)
    {
      localObject = a(paramInt, true);
      if (((f)localObject).o) {
        a((f)localObject, false);
      }
    }
  }
  
  int i(int paramInt)
  {
    Object localObject1 = this.q;
    int i1 = 0;
    int i3;
    int i4;
    if ((localObject1 != null) && ((((ViewGroup)localObject1).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject1 = (ViewGroup.MarginLayoutParams)this.q.getLayoutParams();
      boolean bool = this.q.isShown();
      int i2 = 1;
      int i5;
      int i6;
      if (bool)
      {
        if (this.S == null)
        {
          this.S = new Rect();
          this.T = new Rect();
        }
        Rect localRect = this.S;
        Object localObject2 = this.T;
        localRect.set(0, paramInt, 0, 0);
        Fb.a(this.w, localRect, (Rect)localObject2);
        if (((Rect)localObject2).top == 0) {
          i3 = paramInt;
        } else {
          i3 = 0;
        }
        if (((ViewGroup.MarginLayoutParams)localObject1).topMargin != i3)
        {
          ((ViewGroup.MarginLayoutParams)localObject1).topMargin = paramInt;
          localObject2 = this.y;
          if (localObject2 == null)
          {
            this.y = new View(this.e);
            this.y.setBackgroundColor(this.e.getResources().getColor(Id.abc_input_method_navigation_guard));
            this.w.addView(this.y, -1, new ViewGroup.LayoutParams(-1, paramInt));
          }
          else
          {
            localObject2 = ((View)localObject2).getLayoutParams();
            if (((ViewGroup.LayoutParams)localObject2).height != paramInt)
            {
              ((ViewGroup.LayoutParams)localObject2).height = paramInt;
              this.y.setLayoutParams((ViewGroup.LayoutParams)localObject2);
            }
          }
          i4 = 1;
        }
        else
        {
          i4 = 0;
        }
        if (this.y == null) {
          i2 = 0;
        }
        i5 = i4;
        i3 = i2;
        i6 = paramInt;
        if (!this.D)
        {
          i5 = i4;
          i3 = i2;
          i6 = paramInt;
          if (i2 != 0)
          {
            i6 = 0;
            i5 = i4;
            i3 = i2;
          }
        }
      }
      else
      {
        if (((ViewGroup.MarginLayoutParams)localObject1).topMargin != 0)
        {
          ((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;
          i4 = 1;
        }
        else
        {
          i4 = 0;
        }
        i3 = 0;
        i6 = paramInt;
        i5 = i4;
      }
      i4 = i3;
      paramInt = i6;
      if (i5 != 0)
      {
        this.q.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        i4 = i3;
        paramInt = i6;
      }
    }
    else
    {
      i4 = 0;
    }
    localObject1 = this.y;
    if (localObject1 != null)
    {
      if (i4 != 0) {
        i3 = i1;
      } else {
        i3 = 8;
      }
      ((View)localObject1).setVisibility(i3);
    }
    return paramInt;
  }
  
  public void i()
  {
    a();
  }
  
  public void j()
  {
    Object localObject = d();
    if (localObject != null) {
      ((a)localObject).d(false);
    }
    localObject = this.N;
    if (localObject != null) {
      ((d)localObject).a();
    }
  }
  
  void k()
  {
    Object localObject = this.m;
    if (localObject != null) {
      ((U)localObject).g();
    }
    if (this.r != null)
    {
      this.f.getDecorView().removeCallbacks(this.s);
      if (!this.r.isShowing()) {}
    }
    try
    {
      this.r.dismiss();
      this.r = null;
      l();
      localObject = a(0, false);
      if (localObject != null)
      {
        localObject = ((f)localObject).j;
        if (localObject != null) {
          ((l)localObject).close();
        }
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  void l()
  {
    android.support.v4.view.J localJ = this.t;
    if (localJ != null) {
      localJ.a();
    }
  }
  
  final Context m()
  {
    Object localObject1 = d();
    if (localObject1 != null) {
      localObject1 = ((a)localObject1).h();
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = this.e;
    }
    return (Context)localObject2;
  }
  
  final CharSequence n()
  {
    Window.Callback localCallback = this.g;
    if ((localCallback instanceof Activity)) {
      return ((Activity)localCallback).getTitle();
    }
    return this.l;
  }
  
  final Window.Callback o()
  {
    return this.f.getCallback();
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public boolean p()
  {
    return this.u;
  }
  
  boolean q()
  {
    Object localObject = this.p;
    if (localObject != null)
    {
      ((ke)localObject).a();
      return true;
    }
    localObject = d();
    return (localObject != null) && (((a)localObject).f());
  }
  
  final a r()
  {
    return this.j;
  }
  
  final boolean s()
  {
    if (this.v)
    {
      ViewGroup localViewGroup = this.w;
      if ((localViewGroup != null) && (android.support.v4.view.y.B(localViewGroup))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  private final class a
    implements v.a
  {
    a() {}
    
    public void a(l paraml, boolean paramBoolean)
    {
      x.this.b(paraml);
    }
    
    public boolean a(l paraml)
    {
      Window.Callback localCallback = x.this.o();
      if (localCallback != null) {
        localCallback.onMenuOpened(108, paraml);
      }
      return true;
    }
  }
  
  class b
    implements ke.a
  {
    private ke.a a;
    
    public b(ke.a parama)
    {
      this.a = parama;
    }
    
    public void a(ke paramke)
    {
      this.a.a(paramke);
      paramke = x.this;
      if (paramke.r != null) {
        paramke.f.getDecorView().removeCallbacks(x.this.s);
      }
      paramke = x.this;
      if (paramke.q != null)
      {
        paramke.l();
        localx = x.this;
        paramke = android.support.v4.view.y.a(localx.q);
        paramke.a(0.0F);
        localx.t = paramke;
        x.this.t.a(new y(this));
      }
      x localx = x.this;
      paramke = localx.i;
      if (paramke != null) {
        paramke.a(localx.p);
      }
      x.this.p = null;
    }
    
    public boolean a(ke paramke, Menu paramMenu)
    {
      return this.a.a(paramke, paramMenu);
    }
    
    public boolean a(ke paramke, MenuItem paramMenuItem)
    {
      return this.a.a(paramke, paramMenuItem);
    }
    
    public boolean b(ke paramke, Menu paramMenu)
    {
      return this.a.b(paramke, paramMenu);
    }
  }
  
  class c
    extends se
  {
    c(Window.Callback paramCallback)
    {
      super();
    }
    
    final ActionMode a(ActionMode.Callback paramCallback)
    {
      oe.a locala = new oe.a(x.this.e, paramCallback);
      paramCallback = x.this.a(locala);
      if (paramCallback != null) {
        return locala.b(paramCallback);
      }
      return null;
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      boolean bool;
      if ((!x.this.a(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
    {
      boolean bool;
      if ((!super.dispatchKeyShortcutEvent(paramKeyEvent)) && (!x.this.b(paramKeyEvent.getKeyCode(), paramKeyEvent))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void onContentChanged() {}
    
    public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
    {
      if ((paramInt == 0) && (!(paramMenu instanceof l))) {
        return false;
      }
      return super.onCreatePanelMenu(paramInt, paramMenu);
    }
    
    public boolean onMenuOpened(int paramInt, Menu paramMenu)
    {
      super.onMenuOpened(paramInt, paramMenu);
      x.this.g(paramInt);
      return true;
    }
    
    public void onPanelClosed(int paramInt, Menu paramMenu)
    {
      super.onPanelClosed(paramInt, paramMenu);
      x.this.h(paramInt);
    }
    
    public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      l locall;
      if ((paramMenu instanceof l)) {
        locall = (l)paramMenu;
      } else {
        locall = null;
      }
      if ((paramInt == 0) && (locall == null)) {
        return false;
      }
      if (locall != null) {
        locall.c(true);
      }
      boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
      if (locall != null) {
        locall.c(false);
      }
      return bool;
    }
    
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
    {
      Object localObject = x.this.a(0, true);
      if (localObject != null)
      {
        localObject = ((x.f)localObject).j;
        if (localObject != null)
        {
          super.onProvideKeyboardShortcuts(paramList, (Menu)localObject, paramInt);
          return;
        }
      }
      super.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      if (Build.VERSION.SDK_INT >= 23) {
        return null;
      }
      if (x.this.p()) {
        return a(paramCallback);
      }
      return super.onWindowStartingActionMode(paramCallback);
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
    {
      if ((x.this.p()) && (paramInt == 0)) {
        return a(paramCallback);
      }
      return super.onWindowStartingActionMode(paramCallback, paramInt);
    }
  }
  
  final class d
  {
    private F a;
    private boolean b;
    private BroadcastReceiver c;
    private IntentFilter d;
    
    d(F paramF)
    {
      this.a = paramF;
      this.b = paramF.a();
    }
    
    void a()
    {
      BroadcastReceiver localBroadcastReceiver = this.c;
      if (localBroadcastReceiver != null)
      {
        x.this.e.unregisterReceiver(localBroadcastReceiver);
        this.c = null;
      }
    }
    
    void b()
    {
      boolean bool = this.a.a();
      if (bool != this.b)
      {
        this.b = bool;
        x.this.a();
      }
    }
    
    int c()
    {
      this.b = this.a.a();
      int i;
      if (this.b) {
        i = 2;
      } else {
        i = 1;
      }
      return i;
    }
    
    void d()
    {
      a();
      if (this.c == null) {
        this.c = new z(this);
      }
      if (this.d == null)
      {
        this.d = new IntentFilter();
        this.d.addAction("android.intent.action.TIME_SET");
        this.d.addAction("android.intent.action.TIMEZONE_CHANGED");
        this.d.addAction("android.intent.action.TIME_TICK");
      }
      x.this.e.registerReceiver(this.c, this.d);
    }
  }
  
  private class e
    extends ContentFrameLayout
  {
    public e(Context paramContext)
    {
      super();
    }
    
    private boolean a(int paramInt1, int paramInt2)
    {
      boolean bool;
      if ((paramInt1 >= -5) && (paramInt2 >= -5) && (paramInt1 <= getWidth() + 5) && (paramInt2 <= getHeight() + 5)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      boolean bool;
      if ((!x.this.a(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if ((paramMotionEvent.getAction() == 0) && (a((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())))
      {
        x.this.d(0);
        return true;
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    public void setBackgroundResource(int paramInt)
    {
      setBackgroundDrawable(Vd.b(getContext(), paramInt));
    }
  }
  
  protected static final class f
  {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ViewGroup g;
    View h;
    View i;
    l j;
    j k;
    Context l;
    boolean m;
    boolean n;
    boolean o;
    public boolean p;
    boolean q;
    boolean r;
    Bundle s;
    
    f(int paramInt)
    {
      this.a = paramInt;
      this.q = false;
    }
    
    android.support.v7.view.menu.w a(v.a parama)
    {
      if (this.j == null) {
        return null;
      }
      if (this.k == null)
      {
        this.k = new j(this.l, Md.abc_list_menu_item_layout);
        this.k.a(parama);
        this.j.a(this.k);
      }
      return this.k.a(this.g);
    }
    
    void a(Context paramContext)
    {
      TypedValue localTypedValue = new TypedValue();
      Resources.Theme localTheme = paramContext.getResources().newTheme();
      localTheme.setTo(paramContext.getTheme());
      localTheme.resolveAttribute(Gd.actionBarPopupTheme, localTypedValue, true);
      int i1 = localTypedValue.resourceId;
      if (i1 != 0) {
        localTheme.applyStyle(i1, true);
      }
      localTheme.resolveAttribute(Gd.panelMenuListTheme, localTypedValue, true);
      i1 = localTypedValue.resourceId;
      if (i1 != 0) {
        localTheme.applyStyle(i1, true);
      } else {
        localTheme.applyStyle(Od.Theme_AppCompat_CompactMenu, true);
      }
      paramContext = new me(paramContext, 0);
      paramContext.getTheme().setTo(localTheme);
      this.l = paramContext;
      paramContext = paramContext.obtainStyledAttributes(Pd.AppCompatTheme);
      this.b = paramContext.getResourceId(Pd.AppCompatTheme_panelBackground, 0);
      this.f = paramContext.getResourceId(Pd.AppCompatTheme_android_windowAnimationStyle, 0);
      paramContext.recycle();
    }
    
    void a(l paraml)
    {
      Object localObject = this.j;
      if (paraml == localObject) {
        return;
      }
      if (localObject != null) {
        ((l)localObject).b(this.k);
      }
      this.j = paraml;
      if (paraml != null)
      {
        localObject = this.k;
        if (localObject != null) {
          paraml.a((android.support.v7.view.menu.v)localObject);
        }
      }
    }
    
    public boolean a()
    {
      View localView = this.h;
      boolean bool = false;
      if (localView == null) {
        return false;
      }
      if (this.i != null) {
        return true;
      }
      if (this.k.b().getCount() > 0) {
        bool = true;
      }
      return bool;
    }
  }
  
  private final class g
    implements v.a
  {
    g() {}
    
    public void a(l paraml, boolean paramBoolean)
    {
      l locall = paraml.m();
      int i;
      if (locall != paraml) {
        i = 1;
      } else {
        i = 0;
      }
      x localx = x.this;
      if (i != 0) {
        paraml = locall;
      }
      paraml = localx.a(paraml);
      if (paraml != null) {
        if (i != 0)
        {
          x.this.a(paraml.a, paraml, locall);
          x.this.a(paraml, true);
        }
        else
        {
          x.this.a(paraml, paramBoolean);
        }
      }
    }
    
    public boolean a(l paraml)
    {
      if (paraml == null)
      {
        Object localObject = x.this;
        if (((x)localObject).B)
        {
          localObject = ((x)localObject).o();
          if ((localObject != null) && (!x.this.K)) {
            ((Window.Callback)localObject).onMenuOpened(108, paraml);
          }
        }
      }
      return true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */