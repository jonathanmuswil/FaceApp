package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.d.a;
import android.arch.lifecycle.f;
import android.arch.lifecycle.t;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kd;
import ud;

public class l
  implements ComponentCallbacks, View.OnCreateContextMenuListener, f, t
{
  private static final ud<String, Class<?>> a = new ud();
  static final Object b = new Object();
  int A;
  String B;
  boolean C;
  boolean D;
  boolean E;
  boolean F;
  boolean G;
  boolean H = true;
  boolean I;
  ViewGroup J;
  View K;
  View L;
  boolean M;
  boolean N = true;
  a O;
  boolean P;
  boolean Q;
  float R;
  LayoutInflater S;
  boolean T;
  android.arch.lifecycle.h U = new android.arch.lifecycle.h(this);
  android.arch.lifecycle.h V;
  f W;
  android.arch.lifecycle.m<f> X = new android.arch.lifecycle.m();
  int c = 0;
  Bundle d;
  SparseArray<Parcelable> e;
  Boolean f;
  int g = -1;
  String h;
  Bundle i;
  l j;
  int k = -1;
  int l;
  boolean m;
  boolean n;
  boolean o;
  boolean p;
  boolean q;
  boolean r;
  int s;
  z t;
  r u;
  z v;
  A w;
  android.arch.lifecycle.s x;
  l y;
  int z;
  
  private a Lb()
  {
    if (this.O == null) {
      this.O = new a();
    }
    return this.O;
  }
  
  public static l a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass1 = (Class)a.get(paramString);
      Class localClass2 = localClass1;
      if (localClass1 == null)
      {
        localClass2 = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass2);
      }
      paramContext = (l)localClass2.getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(paramContext.getClass().getClassLoader());
        paramContext.m(paramBundle);
      }
      return paramContext;
    }
    catch (InvocationTargetException paramContext)
    {
      paramBundle = new StringBuilder();
      paramBundle.append("Unable to instantiate fragment ");
      paramBundle.append(paramString);
      paramBundle.append(": calling Fragment constructor caused an exception");
      throw new b(paramBundle.toString(), paramContext);
    }
    catch (NoSuchMethodException paramBundle)
    {
      paramContext = new StringBuilder();
      paramContext.append("Unable to instantiate fragment ");
      paramContext.append(paramString);
      paramContext.append(": could not find Fragment constructor");
      throw new b(paramContext.toString(), paramBundle);
    }
    catch (IllegalAccessException paramBundle)
    {
      paramContext = new StringBuilder();
      paramContext.append("Unable to instantiate fragment ");
      paramContext.append(paramString);
      paramContext.append(": make sure class name exists, is public, and has an");
      paramContext.append(" empty constructor that is public");
      throw new b(paramContext.toString(), paramBundle);
    }
    catch (InstantiationException paramBundle)
    {
      paramContext = new StringBuilder();
      paramContext.append("Unable to instantiate fragment ");
      paramContext.append(paramString);
      paramContext.append(": make sure class name exists, is public, and has an");
      paramContext.append(" empty constructor that is public");
      throw new b(paramContext.toString(), paramBundle);
    }
    catch (ClassNotFoundException paramBundle)
    {
      paramContext = new StringBuilder();
      paramContext.append("Unable to instantiate fragment ");
      paramContext.append(paramString);
      paramContext.append(": make sure class name exists, is public, and has an");
      paramContext.append(" empty constructor that is public");
      throw new b(paramContext.toString(), paramBundle);
    }
  }
  
  static boolean a(Context paramContext, String paramString)
  {
    try
    {
      Class localClass1 = (Class)a.get(paramString);
      Class localClass2 = localClass1;
      if (localClass1 == null)
      {
        localClass2 = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass2);
      }
      boolean bool = l.class.isAssignableFrom(localClass2);
      return bool;
    }
    catch (ClassNotFoundException paramContext) {}
    return false;
  }
  
  void Ab()
  {
    if (this.K != null) {
      this.V.b(d.a.ON_DESTROY);
    }
    Object localObject = this.v;
    if (localObject != null) {
      ((z)localObject).j();
    }
    this.c = 1;
    this.I = false;
    sb();
    if (this.I)
    {
      Y.a(this).a();
      this.r = false;
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onDestroyView()");
    throw new ia(((StringBuilder)localObject).toString());
  }
  
  void Bb()
  {
    this.I = false;
    tb();
    this.S = null;
    if (this.I)
    {
      localObject = this.v;
      if (localObject != null) {
        if (this.F)
        {
          ((z)localObject).i();
          this.v = null;
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Child FragmentManager of ");
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(" was not ");
          ((StringBuilder)localObject).append(" destroyed and this fragment is not retaining instance");
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
      }
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onDetach()");
    throw new ia(((StringBuilder)localObject).toString());
  }
  
  void Cb()
  {
    onLowMemory();
    z localz = this.v;
    if (localz != null) {
      localz.k();
    }
  }
  
  void Da()
  {
    a locala = this.O;
    c localc = null;
    if (locala != null)
    {
      locala.q = false;
      localc = locala.r;
      locala.r = null;
    }
    if (localc != null) {
      localc.b();
    }
  }
  
  void Db()
  {
    if (this.K != null) {
      this.V.b(d.a.ON_PAUSE);
    }
    this.U.b(d.a.ON_PAUSE);
    Object localObject = this.v;
    if (localObject != null) {
      ((z)localObject).l();
    }
    this.c = 3;
    this.I = false;
    ub();
    if (this.I) {
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onPause()");
    throw new ia(((StringBuilder)localObject).toString());
  }
  
  public final o Ea()
  {
    Object localObject = this.u;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = (o)((r)localObject).b();
    }
    return (o)localObject;
  }
  
  void Eb()
  {
    Object localObject = this.v;
    if (localObject != null)
    {
      ((z)localObject).t();
      this.v.q();
    }
    this.c = 4;
    this.I = false;
    vb();
    if (this.I)
    {
      localObject = this.v;
      if (localObject != null)
      {
        ((z)localObject).m();
        this.v.q();
      }
      this.U.b(d.a.ON_RESUME);
      if (this.K != null) {
        this.V.b(d.a.ON_RESUME);
      }
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onResume()");
    throw new ia(((StringBuilder)localObject).toString());
  }
  
  public boolean Fa()
  {
    Object localObject = this.O;
    if (localObject != null)
    {
      localObject = ((a)localObject).n;
      if (localObject != null) {
        return ((Boolean)localObject).booleanValue();
      }
    }
    boolean bool = true;
    return bool;
  }
  
  void Fb()
  {
    Object localObject = this.v;
    if (localObject != null)
    {
      ((z)localObject).t();
      this.v.q();
    }
    this.c = 3;
    this.I = false;
    wb();
    if (this.I)
    {
      localObject = this.v;
      if (localObject != null) {
        ((z)localObject).n();
      }
      this.U.b(d.a.ON_START);
      if (this.K != null) {
        this.V.b(d.a.ON_START);
      }
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onStart()");
    throw new ia(((StringBuilder)localObject).toString());
  }
  
  public boolean Ga()
  {
    Object localObject = this.O;
    if (localObject != null)
    {
      localObject = ((a)localObject).m;
      if (localObject != null) {
        return ((Boolean)localObject).booleanValue();
      }
    }
    boolean bool = true;
    return bool;
  }
  
  void Gb()
  {
    if (this.K != null) {
      this.V.b(d.a.ON_STOP);
    }
    this.U.b(d.a.ON_STOP);
    Object localObject = this.v;
    if (localObject != null) {
      ((z)localObject).o();
    }
    this.c = 2;
    this.I = false;
    xb();
    if (this.I) {
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onStop()");
    throw new ia(((StringBuilder)localObject).toString());
  }
  
  View Ha()
  {
    a locala = this.O;
    if (locala == null) {
      return null;
    }
    return locala.a;
  }
  
  public void Hb()
  {
    Lb().q = true;
  }
  
  Animator Ia()
  {
    a locala = this.O;
    if (locala == null) {
      return null;
    }
    return locala.b;
  }
  
  public final o Ib()
  {
    Object localObject = Ea();
    if (localObject != null) {
      return (o)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" not attached to an activity.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final Bundle Ja()
  {
    return this.i;
  }
  
  public final Context Jb()
  {
    Object localObject = La();
    if (localObject != null) {
      return (Context)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" not attached to a context.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final s Ka()
  {
    if (this.v == null)
    {
      gb();
      int i1 = this.c;
      if (i1 >= 4) {
        this.v.m();
      } else if (i1 >= 3) {
        this.v.n();
      } else if (i1 >= 2) {
        this.v.g();
      } else if (i1 >= 1) {
        this.v.h();
      }
    }
    return this.v;
  }
  
  public void Kb()
  {
    z localz = this.t;
    if ((localz != null) && (localz.s != null))
    {
      if (Looper.myLooper() != this.t.s.e().getLooper()) {
        this.t.s.e().postAtFrontOfQueue(new i(this));
      } else {
        Da();
      }
    }
    else {
      Lb().q = false;
    }
  }
  
  public Context La()
  {
    Object localObject = this.u;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((r)localObject).c();
    }
    return (Context)localObject;
  }
  
  public Object Ma()
  {
    a locala = this.O;
    if (locala == null) {
      return null;
    }
    return locala.g;
  }
  
  ha Na()
  {
    a locala = this.O;
    if (locala == null) {
      return null;
    }
    return locala.o;
  }
  
  public Object Oa()
  {
    a locala = this.O;
    if (locala == null) {
      return null;
    }
    return locala.i;
  }
  
  ha Pa()
  {
    a locala = this.O;
    if (locala == null) {
      return null;
    }
    return locala.p;
  }
  
  public final s Qa()
  {
    return this.t;
  }
  
  int Ra()
  {
    a locala = this.O;
    if (locala == null) {
      return 0;
    }
    return locala.d;
  }
  
  int Sa()
  {
    a locala = this.O;
    if (locala == null) {
      return 0;
    }
    return locala.e;
  }
  
  int Ta()
  {
    a locala = this.O;
    if (locala == null) {
      return 0;
    }
    return locala.f;
  }
  
  public final l Ua()
  {
    return this.y;
  }
  
  public Object Va()
  {
    Object localObject1 = this.O;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = ((a)localObject1).j;
    localObject1 = localObject2;
    if (localObject2 == b) {
      localObject1 = Oa();
    }
    return localObject1;
  }
  
  public final Resources Wa()
  {
    return Jb().getResources();
  }
  
  public final boolean Xa()
  {
    return this.E;
  }
  
  public Object Ya()
  {
    Object localObject1 = this.O;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = ((a)localObject1).h;
    localObject1 = localObject2;
    if (localObject2 == b) {
      localObject1 = Ma();
    }
    return localObject1;
  }
  
  public Object Za()
  {
    a locala = this.O;
    if (locala == null) {
      return null;
    }
    return locala.k;
  }
  
  public Object _a()
  {
    Object localObject1 = this.O;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = ((a)localObject1).l;
    localObject1 = localObject2;
    if (localObject2 == b) {
      localObject1 = Za();
    }
    return localObject1;
  }
  
  @Deprecated
  public LayoutInflater a(Bundle paramBundle)
  {
    paramBundle = this.u;
    if (paramBundle != null)
    {
      paramBundle = paramBundle.f();
      Ka();
      z localz = this.v;
      localz.r();
      android.support.v4.view.h.a(paramBundle, localz);
      return paramBundle;
    }
    throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }
  
  public Animation a(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if ((this.O == null) && (paramInt1 == 0) && (paramInt2 == 0)) {
      return;
    }
    Lb();
    a locala = this.O;
    locala.e = paramInt1;
    locala.f = paramInt2;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  final void a(int paramInt, l paraml)
  {
    this.g = paramInt;
    if (paraml != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paraml.h);
      localStringBuilder.append(":");
      localStringBuilder.append(this.g);
      this.h = localStringBuilder.toString();
    }
    else
    {
      paraml = new StringBuilder();
      paraml.append("android:fragment:");
      paraml.append(this.g);
      this.h = paraml.toString();
    }
  }
  
  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {}
  
  void a(Animator paramAnimator)
  {
    Lb().b = paramAnimator;
  }
  
  @Deprecated
  public void a(Activity paramActivity)
  {
    this.I = true;
  }
  
  @Deprecated
  public void a(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.I = true;
  }
  
  public void a(Context paramContext)
  {
    this.I = true;
    paramContext = this.u;
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = paramContext.b();
    }
    if (paramContext != null)
    {
      this.I = false;
      a(paramContext);
    }
  }
  
  public void a(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.I = true;
    paramContext = this.u;
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = paramContext.b();
    }
    if (paramContext != null)
    {
      this.I = false;
      a(paramContext, paramAttributeSet, paramBundle);
    }
  }
  
  public void a(Intent paramIntent, int paramInt)
  {
    a(paramIntent, paramInt, null);
  }
  
  public void a(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    r localr = this.u;
    if (localr != null)
    {
      localr.a(this, paramIntent, paramInt, paramBundle);
      return;
    }
    paramIntent = new StringBuilder();
    paramIntent.append("Fragment ");
    paramIntent.append(this);
    paramIntent.append(" not attached to Activity");
    throw new IllegalStateException(paramIntent.toString());
  }
  
  void a(Configuration paramConfiguration)
  {
    onConfigurationChanged(paramConfiguration);
    z localz = this.v;
    if (localz != null) {
      localz.a(paramConfiguration);
    }
  }
  
  void a(c paramc)
  {
    Lb();
    Object localObject = this.O.r;
    if (paramc == localObject) {
      return;
    }
    if ((paramc != null) && (localObject != null))
    {
      paramc = new StringBuilder();
      paramc.append("Trying to set a replacement startPostponedEnterTransition on ");
      paramc.append(this);
      throw new IllegalStateException(paramc.toString());
    }
    localObject = this.O;
    if (((a)localObject).q) {
      ((a)localObject).r = paramc;
    }
    if (paramc != null) {
      paramc.a();
    }
  }
  
  public void a(d paramd)
  {
    if (this.g < 0)
    {
      if (paramd != null)
      {
        paramd = paramd.a;
        if (paramd != null) {}
      }
      else
      {
        paramd = null;
      }
      this.d = paramd;
      return;
    }
    throw new IllegalStateException("Fragment already active");
  }
  
  public void a(l paraml) {}
  
  public void a(l paraml, int paramInt)
  {
    s locals = Qa();
    if (paraml != null) {
      localObject = paraml.Qa();
    } else {
      localObject = null;
    }
    if ((locals != null) && (localObject != null) && (locals != localObject))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Fragment ");
      ((StringBuilder)localObject).append(paraml);
      ((StringBuilder)localObject).append(" must share the same FragmentManager to be set as a target fragment");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    Object localObject = paraml;
    while (localObject != null) {
      if (localObject != this)
      {
        localObject = ((l)localObject).cb();
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Setting ");
        ((StringBuilder)localObject).append(paraml);
        ((StringBuilder)localObject).append(" as the target of ");
        ((StringBuilder)localObject).append(this);
        ((StringBuilder)localObject).append(" would create a target cycle");
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
    }
    this.j = paraml;
    this.l = paramInt;
  }
  
  public void a(Menu paramMenu) {}
  
  public void a(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  void a(View paramView)
  {
    Lb().a = paramView;
  }
  
  public void a(View paramView, Bundle paramBundle) {}
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.z));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.A));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.B);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.h);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.s);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.m);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.o);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.p);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.C);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.D);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.H);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(this.G);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.E);
    paramPrintWriter.print(" mRetaining=");
    paramPrintWriter.print(this.F);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.N);
    if (this.t != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.t);
    }
    if (this.u != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(this.u);
    }
    if (this.y != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.y);
    }
    if (this.i != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.i);
    }
    if (this.d != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.d);
    }
    if (this.e != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.e);
    }
    if (this.j != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(this.j);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.l);
    }
    if (Ra() != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(Ra());
    }
    if (this.J != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.J);
    }
    if (this.K != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.K);
    }
    if (this.L != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      paramPrintWriter.println(this.K);
    }
    if (Ha() != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(Ha());
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStateAfterAnimating=");
      paramPrintWriter.println(ab());
    }
    if (La() != null) {
      Y.a(this).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if (this.v != null)
    {
      paramPrintWriter.print(paramString);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Child ");
      ((StringBuilder)localObject).append(this.v);
      ((StringBuilder)localObject).append(":");
      paramPrintWriter.println(((StringBuilder)localObject).toString());
      localObject = this.v;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("  ");
      ((z)localObject).a(localStringBuilder.toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  int ab()
  {
    a locala = this.O;
    if (locala == null) {
      return 0;
    }
    return locala.c;
  }
  
  public Animator b(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  public final String b(int paramInt)
  {
    return Wa().getString(paramInt);
  }
  
  public void b(Bundle paramBundle)
  {
    this.I = true;
  }
  
  void b(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    z localz = this.v;
    if (localz != null) {
      localz.t();
    }
    this.r = true;
    this.W = new k(this);
    this.V = null;
    this.K = a(paramLayoutInflater, paramViewGroup, paramBundle);
    if (this.K != null)
    {
      this.W.ka();
      this.X.b(this.W);
    }
    else
    {
      if (this.V != null) {
        break label93;
      }
      this.W = null;
    }
    return;
    label93:
    throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
  }
  
  public void b(Menu paramMenu) {}
  
  boolean b(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    boolean bool1 = this.C;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1)
    {
      bool1 = bool3;
      if (this.G)
      {
        bool1 = bool3;
        if (this.H)
        {
          a(paramMenu, paramMenuInflater);
          bool1 = true;
        }
      }
      z localz = this.v;
      bool2 = bool1;
      if (localz != null) {
        bool2 = bool1 | localz.a(paramMenu, paramMenuInflater);
      }
    }
    return bool2;
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final String bb()
  {
    return this.B;
  }
  
  void c(int paramInt)
  {
    if ((this.O == null) && (paramInt == 0)) {
      return;
    }
    Lb().d = paramInt;
  }
  
  public void c(Bundle paramBundle)
  {
    this.I = true;
    k(paramBundle);
    paramBundle = this.v;
    if ((paramBundle != null) && (!paramBundle.d(1))) {
      this.v.h();
    }
  }
  
  void c(Menu paramMenu)
  {
    if (!this.C)
    {
      if ((this.G) && (this.H)) {
        a(paramMenu);
      }
      z localz = this.v;
      if (localz != null) {
        localz.a(paramMenu);
      }
    }
  }
  
  boolean c(MenuItem paramMenuItem)
  {
    if (!this.C)
    {
      if (a(paramMenuItem)) {
        return true;
      }
      z localz = this.v;
      if ((localz != null) && (localz.a(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public final l cb()
  {
    return this.j;
  }
  
  public LayoutInflater d(Bundle paramBundle)
  {
    return a(paramBundle);
  }
  
  void d(int paramInt)
  {
    Lb().c = paramInt;
  }
  
  boolean d(Menu paramMenu)
  {
    boolean bool1 = this.C;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1)
    {
      bool1 = bool3;
      if (this.G)
      {
        bool1 = bool3;
        if (this.H)
        {
          b(paramMenu);
          bool1 = true;
        }
      }
      z localz = this.v;
      bool2 = bool1;
      if (localz != null) {
        bool2 = bool1 | localz.b(paramMenu);
      }
    }
    return bool2;
  }
  
  boolean d(MenuItem paramMenuItem)
  {
    if (!this.C)
    {
      if ((this.G) && (this.H) && (b(paramMenuItem))) {
        return true;
      }
      z localz = this.v;
      if ((localz != null) && (localz.b(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public final int db()
  {
    return this.l;
  }
  
  public void e(Bundle paramBundle) {}
  
  public View eb()
  {
    return this.K;
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public void f(Bundle paramBundle)
  {
    this.I = true;
  }
  
  void fb()
  {
    this.g = -1;
    this.h = null;
    this.m = false;
    this.n = false;
    this.o = false;
    this.p = false;
    this.q = false;
    this.s = 0;
    this.t = null;
    this.v = null;
    this.u = null;
    this.z = 0;
    this.A = 0;
    this.B = null;
    this.C = false;
    this.D = false;
    this.F = false;
  }
  
  void g(Bundle paramBundle)
  {
    z localz = this.v;
    if (localz != null) {
      localz.t();
    }
    this.c = 2;
    this.I = false;
    b(paramBundle);
    if (this.I)
    {
      paramBundle = this.v;
      if (paramBundle != null) {
        paramBundle.g();
      }
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Fragment ");
    paramBundle.append(this);
    paramBundle.append(" did not call through to super.onActivityCreated()");
    throw new ia(paramBundle.toString());
  }
  
  void gb()
  {
    if (this.u != null)
    {
      this.v = new z();
      this.v.a(this.u, new j(this), this);
      return;
    }
    throw new IllegalStateException("Fragment has not been attached yet.");
  }
  
  void h(Bundle paramBundle)
  {
    z localz = this.v;
    if (localz != null) {
      localz.t();
    }
    this.c = 1;
    this.I = false;
    c(paramBundle);
    this.T = true;
    if (this.I)
    {
      this.U.b(d.a.ON_CREATE);
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Fragment ");
    paramBundle.append(this);
    paramBundle.append(" did not call through to super.onCreate()");
    throw new ia(paramBundle.toString());
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public final boolean hb()
  {
    boolean bool;
    if ((this.u != null) && (this.m)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  LayoutInflater i(Bundle paramBundle)
  {
    this.S = d(paramBundle);
    return this.S;
  }
  
  public final boolean ib()
  {
    return this.C;
  }
  
  void j(Bundle paramBundle)
  {
    e(paramBundle);
    Object localObject = this.v;
    if (localObject != null)
    {
      localObject = ((z)localObject).w();
      if (localObject != null) {
        paramBundle.putParcelable("android:support:fragments", (Parcelable)localObject);
      }
    }
  }
  
  boolean jb()
  {
    a locala = this.O;
    if (locala == null) {
      return false;
    }
    return locala.s;
  }
  
  void k(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getParcelable("android:support:fragments");
      if (paramBundle != null)
      {
        if (this.v == null) {
          gb();
        }
        this.v.a(paramBundle, this.w);
        this.w = null;
        this.v.h();
      }
    }
  }
  
  public d ka()
  {
    return this.U;
  }
  
  final boolean kb()
  {
    boolean bool;
    if (this.s > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  final void l(Bundle paramBundle)
  {
    SparseArray localSparseArray = this.e;
    if (localSparseArray != null)
    {
      this.L.restoreHierarchyState(localSparseArray);
      this.e = null;
    }
    this.I = false;
    f(paramBundle);
    if (this.I)
    {
      if (this.K != null) {
        this.V.b(d.a.ON_CREATE);
      }
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Fragment ");
    paramBundle.append(this);
    paramBundle.append(" did not call through to super.onViewStateRestored()");
    throw new ia(paramBundle.toString());
  }
  
  boolean lb()
  {
    a locala = this.O;
    if (locala == null) {
      return false;
    }
    return locala.q;
  }
  
  l m(String paramString)
  {
    if (paramString.equals(this.h)) {
      return this;
    }
    z localz = this.v;
    if (localz != null) {
      return localz.b(paramString);
    }
    return null;
  }
  
  public void m(Bundle paramBundle)
  {
    if ((this.g >= 0) && (ob())) {
      throw new IllegalStateException("Fragment already active and state has been saved");
    }
    this.i = paramBundle;
  }
  
  public final boolean mb()
  {
    return this.n;
  }
  
  public final boolean nb()
  {
    boolean bool;
    if (this.c >= 4) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean ob()
  {
    z localz = this.t;
    if (localz == null) {
      return false;
    }
    return localz.d();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.I = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    Ea().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory()
  {
    this.I = true;
  }
  
  void pb()
  {
    z localz = this.v;
    if (localz != null) {
      localz.t();
    }
  }
  
  public void q(boolean paramBoolean) {}
  
  public void qb()
  {
    int i1 = 1;
    this.I = true;
    Object localObject = Ea();
    if ((localObject == null) || (!((Activity)localObject).isChangingConfigurations())) {
      i1 = 0;
    }
    localObject = this.x;
    if ((localObject != null) && (i1 == 0)) {
      ((android.arch.lifecycle.s)localObject).a();
    }
  }
  
  public void r(boolean paramBoolean) {}
  
  public void rb() {}
  
  public void s(boolean paramBoolean) {}
  
  public void sb()
  {
    this.I = true;
  }
  
  void t(boolean paramBoolean)
  {
    r(paramBoolean);
    z localz = this.v;
    if (localz != null) {
      localz.a(paramBoolean);
    }
  }
  
  public void tb()
  {
    this.I = true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    kd.a(this, localStringBuilder);
    if (this.g >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.g);
    }
    if (this.z != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(this.z));
    }
    if (this.B != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.B);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  void u(boolean paramBoolean)
  {
    s(paramBoolean);
    z localz = this.v;
    if (localz != null) {
      localz.b(paramBoolean);
    }
  }
  
  public void ub()
  {
    this.I = true;
  }
  
  void v(boolean paramBoolean)
  {
    Lb().s = paramBoolean;
  }
  
  public void vb()
  {
    this.I = true;
  }
  
  public void w(boolean paramBoolean)
  {
    if (this.H != paramBoolean)
    {
      this.H = paramBoolean;
      if ((this.G) && (hb()) && (!ib())) {
        this.u.i();
      }
    }
  }
  
  public android.arch.lifecycle.s wa()
  {
    if (La() != null)
    {
      if (this.x == null) {
        this.x = new android.arch.lifecycle.s();
      }
      return this.x;
    }
    throw new IllegalStateException("Can't access ViewModels from detached fragment");
  }
  
  public void wb()
  {
    this.I = true;
  }
  
  public void x(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }
  
  public void xb()
  {
    this.I = true;
  }
  
  public void y(boolean paramBoolean)
  {
    if ((!this.N) && (paramBoolean) && (this.c < 3) && (this.t != null) && (hb()) && (this.T)) {
      this.t.k(this);
    }
    this.N = paramBoolean;
    boolean bool;
    if ((this.c < 3) && (!paramBoolean)) {
      bool = true;
    } else {
      bool = false;
    }
    this.M = bool;
    if (this.d != null) {
      this.f = Boolean.valueOf(paramBoolean);
    }
  }
  
  s yb()
  {
    return this.v;
  }
  
  void zb()
  {
    this.U.b(d.a.ON_DESTROY);
    Object localObject = this.v;
    if (localObject != null) {
      ((z)localObject).i();
    }
    this.c = 0;
    this.I = false;
    this.T = false;
    qb();
    if (this.I)
    {
      this.v = null;
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onDestroy()");
    throw new ia(((StringBuilder)localObject).toString());
  }
  
  static class a
  {
    View a;
    Animator b;
    int c;
    int d;
    int e;
    int f;
    Object g = null;
    Object h;
    Object i;
    Object j;
    Object k;
    Object l;
    Boolean m;
    Boolean n;
    ha o;
    ha p;
    boolean q;
    l.c r;
    boolean s;
    
    a()
    {
      Object localObject = l.b;
      this.h = localObject;
      this.i = null;
      this.j = localObject;
      this.k = null;
      this.l = localObject;
      this.o = null;
      this.p = null;
    }
  }
  
  public static class b
    extends RuntimeException
  {
    public b(String paramString, Exception paramException)
    {
      super(paramException);
    }
  }
  
  static abstract interface c
  {
    public abstract void a();
    
    public abstract void b();
  }
  
  public static class d
    implements Parcelable
  {
    public static final Parcelable.Creator<d> CREATOR = new m();
    final Bundle a;
    
    d(Bundle paramBundle)
    {
      this.a = paramBundle;
    }
    
    d(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      this.a = paramParcel.readBundle();
      if (paramClassLoader != null)
      {
        paramParcel = this.a;
        if (paramParcel != null) {
          paramParcel.setClassLoader(paramClassLoader);
        }
      }
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeBundle(this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */