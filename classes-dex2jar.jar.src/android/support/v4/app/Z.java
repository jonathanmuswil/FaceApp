package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.m;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import id;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kd;
import ld;

final class z
  extends s
  implements LayoutInflater.Factory2
{
  static boolean a = false;
  static Field b;
  static final Interpolator c = new DecelerateInterpolator(2.5F);
  static final Interpolator d = new DecelerateInterpolator(1.5F);
  static final Interpolator e = new AccelerateInterpolator(2.5F);
  static final Interpolator f = new AccelerateInterpolator(1.5F);
  String A;
  boolean B;
  ArrayList<d> C;
  ArrayList<Boolean> D;
  ArrayList<l> E;
  Bundle F = null;
  SparseArray<Parcelable> G = null;
  ArrayList<j> H;
  A I;
  Runnable J = new t(this);
  ArrayList<h> g;
  boolean h;
  int i = 0;
  final ArrayList<l> j = new ArrayList();
  SparseArray<l> k;
  ArrayList<d> l;
  ArrayList<l> m;
  ArrayList<d> n;
  ArrayList<Integer> o;
  ArrayList<s.c> p;
  private final CopyOnWriteArrayList<f> q = new CopyOnWriteArrayList();
  int r = 0;
  r s;
  p t;
  l u;
  l v;
  boolean w;
  boolean x;
  boolean y;
  boolean z;
  
  private void A()
  {
    SparseArray localSparseArray = this.k;
    if (localSparseArray != null) {
      for (int i1 = localSparseArray.size() - 1; i1 >= 0; i1--) {
        if (this.k.valueAt(i1) == null)
        {
          localSparseArray = this.k;
          localSparseArray.delete(localSparseArray.keyAt(i1));
        }
      }
    }
  }
  
  private void B()
  {
    if (!d())
    {
      if (this.A == null) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Can not perform this action inside of ");
      localStringBuilder.append(this.A);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
  }
  
  private void C()
  {
    this.h = false;
    this.D.clear();
    this.C.clear();
  }
  
  private void D()
  {
    Object localObject = this.k;
    int i1 = 0;
    int i2;
    if (localObject == null) {
      i2 = 0;
    } else {
      i2 = ((SparseArray)localObject).size();
    }
    while (i1 < i2)
    {
      localObject = (l)this.k.valueAt(i1);
      if (localObject != null) {
        if (((l)localObject).Ha() != null)
        {
          int i3 = ((l)localObject).ab();
          View localView = ((l)localObject).Ha();
          Animation localAnimation = localView.getAnimation();
          if (localAnimation != null)
          {
            localAnimation.cancel();
            localView.clearAnimation();
          }
          ((l)localObject).a(null);
          a((l)localObject, i3, 0, 0, false);
        }
        else if (((l)localObject).Ia() != null)
        {
          ((l)localObject).Ia().end();
        }
      }
      i1++;
    }
  }
  
  private void E()
  {
    if (this.H != null) {
      while (!this.H.isEmpty()) {
        ((j)this.H.remove(0)).d();
      }
    }
  }
  
  private int a(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, id<l> paramid)
  {
    int i1 = paramInt2 - 1;
    int i4;
    for (int i2 = paramInt2; i1 >= paramInt1; i2 = i4)
    {
      d locald = (d)paramArrayList.get(i1);
      boolean bool = ((Boolean)paramArrayList1.get(i1)).booleanValue();
      int i3;
      if ((locald.g()) && (!locald.a(paramArrayList, i1 + 1, paramInt2))) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      i4 = i2;
      if (i3 != 0)
      {
        if (this.H == null) {
          this.H = new ArrayList();
        }
        j localj = new j(locald, bool);
        this.H.add(localj);
        locald.a(localj);
        if (bool) {
          locald.f();
        } else {
          locald.c(false);
        }
        i4 = i2 - 1;
        if (i1 != i4)
        {
          paramArrayList.remove(i1);
          paramArrayList.add(i4, locald);
        }
        a(paramid);
      }
      i1--;
    }
    return i2;
  }
  
  static c a(Context paramContext, float paramFloat1, float paramFloat2)
  {
    paramContext = new AlphaAnimation(paramFloat1, paramFloat2);
    paramContext.setInterpolator(d);
    paramContext.setDuration(220L);
    return new c(paramContext);
  }
  
  static c a(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramContext = new AnimationSet(false);
    Object localObject = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setInterpolator(c);
    ((ScaleAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(paramFloat3, paramFloat4);
    ((AlphaAnimation)localObject).setInterpolator(d);
    ((AlphaAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    return new c(paramContext);
  }
  
  private static Animation.AnimationListener a(Animation paramAnimation)
  {
    try
    {
      if (b == null)
      {
        b = Animation.class.getDeclaredField("mListener");
        b.setAccessible(true);
      }
      paramAnimation = (Animation.AnimationListener)b.get(paramAnimation);
    }
    catch (IllegalAccessException paramAnimation)
    {
      Log.e("FragmentManager", "Cannot access Animation's mListener field", paramAnimation);
    }
    catch (NoSuchFieldException paramAnimation)
    {
      Log.e("FragmentManager", "No field with the name mListener is found in Animation class", paramAnimation);
    }
    paramAnimation = null;
    return paramAnimation;
  }
  
  private static void a(A paramA)
  {
    if (paramA == null) {
      return;
    }
    Object localObject = paramA.b();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((l)((Iterator)localObject).next()).F = true;
      }
    }
    paramA = paramA.a();
    if (paramA != null)
    {
      paramA = paramA.iterator();
      while (paramA.hasNext()) {
        a((A)paramA.next());
      }
    }
  }
  
  private void a(l paraml, c paramc, int paramInt)
  {
    View localView = paraml.K;
    ViewGroup localViewGroup = paraml.J;
    localViewGroup.startViewTransition(localView);
    paraml.d(paramInt);
    Object localObject = paramc.a;
    if (localObject != null)
    {
      localObject = new e((Animation)localObject, localViewGroup, localView);
      paraml.a(paraml.K);
      ((Animation)localObject).setAnimationListener(new v(this, a((Animation)localObject), localViewGroup, paraml));
      b(localView, paramc);
      paraml.K.startAnimation((Animation)localObject);
    }
    else
    {
      localObject = paramc.b;
      paraml.a((Animator)localObject);
      ((Animator)localObject).addListener(new w(this, localViewGroup, localView, paraml));
      ((Animator)localObject).setTarget(paraml.K);
      b(paraml.K, paramc);
      ((Animator)localObject).start();
    }
  }
  
  private void a(id<l> paramid)
  {
    int i1 = this.r;
    if (i1 < 1) {
      return;
    }
    int i2 = Math.min(i1, 3);
    int i3 = this.j.size();
    for (i1 = 0; i1 < i3; i1++)
    {
      l locall = (l)this.j.get(i1);
      if (locall.c < i2)
      {
        a(locall, i2, locall.Ra(), locall.Sa(), false);
        if ((locall.K != null) && (!locall.C) && (locall.P)) {
          paramid.add(locall);
        }
      }
    }
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new ld("FragmentManager"));
    r localr = this.s;
    if (localr != null) {
      try
      {
        localr.a("  ", null, localPrintWriter, new String[0]);
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
      }
    } else {
      try
      {
        a("  ", null, localPrintWriter, new String[0]);
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
      }
    }
    throw paramRuntimeException;
  }
  
  private void a(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    Object localObject = this.H;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((ArrayList)localObject).size();
    }
    int i2 = 0;
    int i3 = i1;
    int i1 = i2;
    while (i1 < i3)
    {
      localObject = (j)this.H.get(i1);
      int i4;
      if ((paramArrayList != null) && (!((j)localObject).a))
      {
        i2 = paramArrayList.indexOf(((j)localObject).b);
        if ((i2 != -1) && (((Boolean)paramArrayList1.get(i2)).booleanValue()))
        {
          ((j)localObject).c();
          i4 = i1;
          i2 = i3;
          break label227;
        }
      }
      if (!((j)localObject).e())
      {
        i4 = i1;
        i2 = i3;
        if (paramArrayList != null)
        {
          i4 = i1;
          i2 = i3;
          if (!((j)localObject).b.a(paramArrayList, 0, paramArrayList.size())) {}
        }
      }
      else
      {
        this.H.remove(i1);
        i4 = i1 - 1;
        i2 = i3 - 1;
        if ((paramArrayList != null) && (!((j)localObject).a))
        {
          i1 = paramArrayList.indexOf(((j)localObject).b);
          if ((i1 != -1) && (((Boolean)paramArrayList1.get(i1)).booleanValue()))
          {
            ((j)localObject).c();
            break label227;
          }
        }
        ((j)localObject).d();
      }
      label227:
      i1 = i4 + 1;
      i3 = i2;
    }
  }
  
  private static void a(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      d locald = (d)paramArrayList.get(paramInt1);
      boolean bool1 = ((Boolean)paramArrayList1.get(paramInt1)).booleanValue();
      boolean bool2 = true;
      if (bool1)
      {
        locald.a(-1);
        if (paramInt1 != paramInt2 - 1) {
          bool2 = false;
        }
        locald.c(bool2);
      }
      else
      {
        locald.a(1);
        locald.f();
      }
      paramInt1++;
    }
  }
  
  static boolean a(Animator paramAnimator)
  {
    if (paramAnimator == null) {
      return false;
    }
    int i1;
    if ((paramAnimator instanceof ValueAnimator))
    {
      paramAnimator = ((ValueAnimator)paramAnimator).getValues();
      for (i1 = 0; i1 < paramAnimator.length; i1++) {
        if ("alpha".equals(paramAnimator[i1].getPropertyName())) {
          return true;
        }
      }
    }
    if ((paramAnimator instanceof AnimatorSet))
    {
      paramAnimator = ((AnimatorSet)paramAnimator).getChildAnimations();
      for (i1 = 0; i1 < paramAnimator.size(); i1++) {
        if (a((Animator)paramAnimator.get(i1))) {
          return true;
        }
      }
    }
    return false;
  }
  
  static boolean a(c paramc)
  {
    Animation localAnimation = paramc.a;
    if ((localAnimation instanceof AlphaAnimation)) {
      return true;
    }
    if ((localAnimation instanceof AnimationSet))
    {
      paramc = ((AnimationSet)localAnimation).getAnimations();
      for (int i1 = 0; i1 < paramc.size(); i1++) {
        if ((paramc.get(i1) instanceof AlphaAnimation)) {
          return true;
        }
      }
      return false;
    }
    return a(paramc.b);
  }
  
  static boolean a(View paramView, c paramc)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramView != null) {
      if (paramc == null)
      {
        bool2 = bool1;
      }
      else
      {
        bool2 = bool1;
        if (Build.VERSION.SDK_INT >= 19)
        {
          bool2 = bool1;
          if (paramView.getLayerType() == 0)
          {
            bool2 = bool1;
            if (android.support.v4.view.y.y(paramView))
            {
              bool2 = bool1;
              if (a(paramc)) {
                bool2 = true;
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  private boolean a(String paramString, int paramInt1, int paramInt2)
  {
    q();
    c(true);
    Object localObject = this.v;
    if ((localObject != null) && (paramInt1 < 0) && (paramString == null))
    {
      localObject = ((l)localObject).yb();
      if ((localObject != null) && (((s)localObject).f())) {
        return true;
      }
    }
    boolean bool = a(this.C, this.D, paramString, paramInt1, paramInt2);
    if (bool) {
      this.h = true;
    }
    try
    {
      c(this.C, this.D);
      C();
    }
    finally
    {
      C();
    }
    A();
    return bool;
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    if (paramInt != 4097)
    {
      if (paramInt != 4099)
      {
        if (paramInt != 8194) {
          paramInt = -1;
        } else if (paramBoolean) {
          paramInt = 3;
        } else {
          paramInt = 4;
        }
      }
      else if (paramBoolean) {
        paramInt = 5;
      } else {
        paramInt = 6;
      }
    }
    else if (paramBoolean) {
      paramInt = 1;
    } else {
      paramInt = 2;
    }
    return paramInt;
  }
  
  private static void b(View paramView, c paramc)
  {
    if ((paramView != null) && (paramc != null) && (a(paramView, paramc)))
    {
      Object localObject = paramc.b;
      if (localObject != null)
      {
        ((Animator)localObject).addListener(new d(paramView));
      }
      else
      {
        localObject = a(paramc.a);
        paramView.setLayerType(2, null);
        paramc.a.setAnimationListener(new a(paramView, (Animation.AnimationListener)localObject));
      }
    }
  }
  
  private void b(id<l> paramid)
  {
    int i1 = paramid.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      l locall = (l)paramid.r(i2);
      if (!locall.m)
      {
        View localView = locall.eb();
        locall.R = localView.getAlpha();
        localView.setAlpha(0.0F);
      }
    }
  }
  
  private void b(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    int i1 = paramInt1;
    boolean bool = ((d)paramArrayList.get(i1)).t;
    Object localObject = this.E;
    if (localObject == null) {
      this.E = new ArrayList();
    } else {
      ((ArrayList)localObject).clear();
    }
    this.E.addAll(this.j);
    localObject = s();
    int i2 = i1;
    int i3 = 0;
    while (i2 < paramInt2)
    {
      d locald = (d)paramArrayList.get(i2);
      if (!((Boolean)paramArrayList1.get(i2)).booleanValue()) {
        localObject = locald.a(this.E, (l)localObject);
      } else {
        localObject = locald.b(this.E, (l)localObject);
      }
      if ((i3 == 0) && (!locald.i)) {
        i3 = 0;
      } else {
        i3 = 1;
      }
      i2++;
    }
    this.E.clear();
    if (!bool) {
      L.a(this, paramArrayList, paramArrayList1, paramInt1, paramInt2, false);
    }
    a(paramArrayList, paramArrayList1, paramInt1, paramInt2);
    int i4;
    if (bool)
    {
      localObject = new id();
      a((id)localObject);
      i4 = a(paramArrayList, paramArrayList1, paramInt1, paramInt2, (id)localObject);
      b((id)localObject);
    }
    else
    {
      i4 = paramInt2;
    }
    i2 = i1;
    if (i4 != i1)
    {
      i2 = i1;
      if (bool)
      {
        L.a(this, paramArrayList, paramArrayList1, paramInt1, i4, true);
        a(this.r, true);
      }
    }
    for (i2 = i1; i2 < paramInt2; i2++)
    {
      localObject = (d)paramArrayList.get(i2);
      if (((Boolean)paramArrayList1.get(i2)).booleanValue())
      {
        paramInt1 = ((d)localObject).m;
        if (paramInt1 >= 0)
        {
          c(paramInt1);
          ((d)localObject).m = -1;
        }
      }
      ((d)localObject).h();
    }
    if (i3 != 0) {
      u();
    }
  }
  
  private boolean b(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    try
    {
      ArrayList localArrayList = this.g;
      int i1 = 0;
      if ((localArrayList != null) && (this.g.size() != 0))
      {
        int i2 = this.g.size();
        boolean bool = false;
        while (i1 < i2)
        {
          bool |= ((h)this.g.get(i1)).a(paramArrayList, paramArrayList1);
          i1++;
        }
        this.g.clear();
        this.s.e().removeCallbacks(this.J);
        return bool;
      }
      return false;
    }
    finally {}
  }
  
  private void c(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    if ((paramArrayList != null) && (!paramArrayList.isEmpty()))
    {
      if ((paramArrayList1 != null) && (paramArrayList.size() == paramArrayList1.size()))
      {
        a(paramArrayList, paramArrayList1);
        int i1 = paramArrayList.size();
        int i2 = 0;
        int i5;
        for (int i3 = 0; i2 < i1; i3 = i5)
        {
          int i4 = i2;
          i5 = i3;
          if (!((d)paramArrayList.get(i2)).t)
          {
            if (i3 != i2) {
              b(paramArrayList, paramArrayList1, i3, i2);
            }
            i3 = i2 + 1;
            i5 = i3;
            if (((Boolean)paramArrayList1.get(i2)).booleanValue()) {
              for (;;)
              {
                i5 = i3;
                if (i3 >= i1) {
                  break;
                }
                i5 = i3;
                if (!((Boolean)paramArrayList1.get(i3)).booleanValue()) {
                  break;
                }
                i5 = i3;
                if (((d)paramArrayList.get(i3)).t) {
                  break;
                }
                i3++;
              }
            }
            b(paramArrayList, paramArrayList1, i2, i5);
            i4 = i5 - 1;
          }
          i2 = i4 + 1;
        }
        if (i3 != i1) {
          b(paramArrayList, paramArrayList1, i3, i1);
        }
        return;
      }
      throw new IllegalStateException("Internal error with the back stack records");
    }
  }
  
  private void c(boolean paramBoolean)
  {
    if (!this.h)
    {
      if (this.s != null)
      {
        if (Looper.myLooper() == this.s.e().getLooper())
        {
          if (!paramBoolean) {
            B();
          }
          if (this.C == null)
          {
            this.C = new ArrayList();
            this.D = new ArrayList();
          }
          this.h = true;
          try
          {
            a(null, null);
            return;
          }
          finally
          {
            this.h = false;
          }
        }
        throw new IllegalStateException("Must be called from main thread of fragment host");
      }
      throw new IllegalStateException("Fragment host has been destroyed");
    }
    throw new IllegalStateException("FragmentManager is already executing transactions");
  }
  
  public static int e(int paramInt)
  {
    int i1 = 8194;
    if (paramInt != 4097) {
      if (paramInt != 4099)
      {
        if (paramInt != 8194) {
          i1 = 0;
        } else {
          i1 = 4097;
        }
      }
      else {
        i1 = 4099;
      }
    }
    return i1;
  }
  
  private void f(int paramInt)
  {
    try
    {
      this.h = true;
      a(paramInt, false);
      this.h = false;
      q();
      return;
    }
    finally
    {
      this.h = false;
    }
  }
  
  private l q(l paraml)
  {
    ViewGroup localViewGroup = paraml.J;
    View localView = paraml.K;
    if ((localViewGroup != null) && (localView != null)) {
      for (int i1 = this.j.indexOf(paraml) - 1; i1 >= 0; i1--)
      {
        paraml = (l)this.j.get(i1);
        if ((paraml.J == localViewGroup) && (paraml.K != null)) {
          return paraml;
        }
      }
    }
    return null;
  }
  
  public G a()
  {
    return new d(this);
  }
  
  public l.d a(l paraml)
  {
    int i1 = paraml.g;
    Object localObject1 = null;
    if (i1 >= 0)
    {
      localObject2 = localObject1;
      if (paraml.c > 0)
      {
        paraml = m(paraml);
        localObject2 = localObject1;
        if (paraml != null) {
          localObject2 = new l.d(paraml);
        }
      }
      return (l.d)localObject2;
    }
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Fragment ");
    ((StringBuilder)localObject2).append(paraml);
    ((StringBuilder)localObject2).append(" is not currently in the FragmentManager");
    a(new IllegalStateException(((StringBuilder)localObject2).toString()));
    throw null;
  }
  
  public l a(int paramInt)
  {
    for (int i1 = this.j.size() - 1; i1 >= 0; i1--)
    {
      localObject = (l)this.j.get(i1);
      if ((localObject != null) && (((l)localObject).z == paramInt)) {
        return (l)localObject;
      }
    }
    Object localObject = this.k;
    if (localObject != null) {
      for (i1 = ((SparseArray)localObject).size() - 1; i1 >= 0; i1--)
      {
        localObject = (l)this.k.valueAt(i1);
        if ((localObject != null) && (((l)localObject).z == paramInt)) {
          return (l)localObject;
        }
      }
    }
    return null;
  }
  
  public l a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    if (i1 == -1) {
      return null;
    }
    paramBundle = (l)this.k.get(i1);
    if (paramBundle != null) {
      return paramBundle;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Fragment no longer exists for key ");
    paramBundle.append(paramString);
    paramBundle.append(": index ");
    paramBundle.append(i1);
    a(new IllegalStateException(paramBundle.toString()));
    throw null;
  }
  
  public l a(String paramString)
  {
    int i1;
    if (paramString != null) {
      for (i1 = this.j.size() - 1; i1 >= 0; i1--)
      {
        localObject = (l)this.j.get(i1);
        if ((localObject != null) && (paramString.equals(((l)localObject).B))) {
          return (l)localObject;
        }
      }
    }
    Object localObject = this.k;
    if ((localObject != null) && (paramString != null)) {
      for (i1 = ((SparseArray)localObject).size() - 1; i1 >= 0; i1--)
      {
        localObject = (l)this.k.valueAt(i1);
        if ((localObject != null) && (paramString.equals(((l)localObject).B))) {
          return (l)localObject;
        }
      }
    }
    return null;
  }
  
  c a(l paraml, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i1 = paraml.Ra();
    Animation localAnimation = paraml.a(paramInt1, paramBoolean, i1);
    if (localAnimation != null) {
      return new c(localAnimation);
    }
    paraml = paraml.b(paramInt1, paramBoolean, i1);
    if (paraml != null) {
      return new c(paraml);
    }
    boolean bool;
    if (i1 != 0)
    {
      bool = "anim".equals(this.s.c().getResources().getResourceTypeName(i1));
      i2 = 0;
      i3 = i2;
      if (!bool) {}
    }
    try
    {
      try
      {
        paraml = AnimationUtils.loadAnimation(this.s.c(), i1);
        if (paraml != null)
        {
          paraml = new c(paraml);
          return paraml;
        }
        i3 = 1;
      }
      catch (Resources.NotFoundException paraml)
      {
        throw paraml;
      }
    }
    catch (RuntimeException paraml)
    {
      for (;;)
      {
        i3 = i2;
      }
    }
    if (i3 == 0) {
      try
      {
        paraml = AnimatorInflater.loadAnimator(this.s.c(), i1);
        if (paraml != null)
        {
          paraml = new c(paraml);
          return paraml;
        }
      }
      catch (RuntimeException paraml)
      {
        if (!bool)
        {
          paraml = AnimationUtils.loadAnimation(this.s.c(), i1);
          if (paraml != null) {
            return new c(paraml);
          }
        }
        else
        {
          throw paraml;
        }
      }
    }
    if (paramInt1 == 0) {
      return null;
    }
    paramInt1 = b(paramInt1, paramBoolean);
    if (paramInt1 < 0) {
      return null;
    }
    switch (paramInt1)
    {
    default: 
      paramInt1 = paramInt2;
      if (paramInt2 == 0)
      {
        paramInt1 = paramInt2;
        if (this.s.h()) {
          paramInt1 = this.s.g();
        }
      }
      break;
    case 6: 
      return a(this.s.c(), 1.0F, 0.0F);
    case 5: 
      return a(this.s.c(), 0.0F, 1.0F);
    case 4: 
      return a(this.s.c(), 1.0F, 1.075F, 1.0F, 0.0F);
    case 3: 
      return a(this.s.c(), 0.975F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return a(this.s.c(), 1.0F, 0.975F, 1.0F, 0.0F);
    case 1: 
      return a(this.s.c(), 1.125F, 1.0F, 0.0F, 1.0F);
    }
    if (paramInt1 == 0) {}
    return null;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      a(new i(null, paramInt1, paramInt2), false);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Bad id: ");
    localStringBuilder.append(paramInt1);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void a(int paramInt, d paramd)
  {
    try
    {
      Object localObject;
      if (this.n == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.n = ((ArrayList)localObject);
      }
      int i1 = this.n.size();
      int i2 = i1;
      if (paramInt < i1)
      {
        if (a)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Setting back stack index ");
          ((StringBuilder)localObject).append(paramInt);
          ((StringBuilder)localObject).append(" to ");
          ((StringBuilder)localObject).append(paramd);
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
        this.n.set(paramInt, paramd);
      }
      else
      {
        while (i2 < paramInt)
        {
          this.n.add(null);
          if (this.o == null)
          {
            localObject = new java/util/ArrayList;
            ((ArrayList)localObject).<init>();
            this.o = ((ArrayList)localObject);
          }
          if (a)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            ((StringBuilder)localObject).append("Adding available back stack index ");
            ((StringBuilder)localObject).append(i2);
            Log.v("FragmentManager", ((StringBuilder)localObject).toString());
          }
          this.o.add(Integer.valueOf(i2));
          i2++;
        }
        if (a)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Adding back stack index ");
          ((StringBuilder)localObject).append(paramInt);
          ((StringBuilder)localObject).append(" with ");
          ((StringBuilder)localObject).append(paramd);
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
        this.n.add(paramd);
      }
      return;
    }
    finally {}
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    if ((this.s == null) && (paramInt != 0)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (paramInt == this.r)) {
      return;
    }
    this.r = paramInt;
    if (this.k != null)
    {
      int i1 = this.j.size();
      for (paramInt = 0; paramInt < i1; paramInt++) {
        i((l)this.j.get(paramInt));
      }
      i1 = this.k.size();
      Object localObject;
      for (paramInt = 0; paramInt < i1; paramInt++)
      {
        localObject = (l)this.k.valueAt(paramInt);
        if ((localObject != null) && ((((l)localObject).n) || (((l)localObject).D)) && (!((l)localObject).P)) {
          i((l)localObject);
        }
      }
      z();
      if (this.w)
      {
        localObject = this.s;
        if ((localObject != null) && (this.r == 4))
        {
          ((r)localObject).i();
          this.w = false;
        }
      }
    }
  }
  
  public void a(Configuration paramConfiguration)
  {
    for (int i1 = 0; i1 < this.j.size(); i1++)
    {
      l locall = (l)this.j.get(i1);
      if (locall != null) {
        locall.a(paramConfiguration);
      }
    }
  }
  
  public void a(Bundle paramBundle, String paramString, l paraml)
  {
    int i1 = paraml.g;
    if (i1 >= 0)
    {
      paramBundle.putInt(paramString, i1);
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Fragment ");
    paramBundle.append(paraml);
    paramBundle.append(" is not currently in the FragmentManager");
    a(new IllegalStateException(paramBundle.toString()));
    throw null;
  }
  
  void a(Parcelable paramParcelable, A arg2)
  {
    if (paramParcelable == null) {
      return;
    }
    C localC = (C)paramParcelable;
    if (localC.a == null) {
      return;
    }
    List localList;
    Object localObject1;
    Object localObject2;
    int i2;
    int i3;
    if (??? != null)
    {
      localList = ???.b();
      localObject1 = ???.a();
      localObject2 = ???.c();
      if (localList != null) {
        i1 = localList.size();
      } else {
        i1 = 0;
      }
      for (i2 = 0;; i2++)
      {
        localObject3 = localObject1;
        paramParcelable = (Parcelable)localObject2;
        if (i2 >= i1) {
          break label328;
        }
        paramParcelable = (l)localList.get(i2);
        if (a)
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("restoreAllState: re-attaching retained ");
          ((StringBuilder)localObject3).append(paramParcelable);
          Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
        }
        for (i3 = 0;; i3++)
        {
          localObject3 = localC.a;
          if ((i3 >= localObject3.length) || (localObject3[i3].b == paramParcelable.g)) {
            break;
          }
        }
        localObject3 = localC.a;
        if (i3 == localObject3.length) {
          break;
        }
        Object localObject4 = localObject3[i3];
        ((E)localObject4).l = paramParcelable;
        paramParcelable.e = null;
        paramParcelable.s = 0;
        paramParcelable.p = false;
        paramParcelable.m = false;
        paramParcelable.j = null;
        localObject3 = ((E)localObject4).k;
        if (localObject3 != null)
        {
          ((Bundle)localObject3).setClassLoader(this.s.c().getClassLoader());
          paramParcelable.e = ((E)localObject4).k.getSparseParcelableArray("android:view_state");
          paramParcelable.d = ((E)localObject4).k;
        }
      }
      ??? = new StringBuilder();
      ???.append("Could not find active fragment with index ");
      ???.append(paramParcelable.g);
      a(new IllegalStateException(???.toString()));
      throw null;
    }
    Object localObject3 = null;
    paramParcelable = (Parcelable)localObject3;
    label328:
    this.k = new SparseArray(localC.a.length);
    for (int i1 = 0;; i1++)
    {
      localObject2 = localC.a;
      if (i1 >= localObject2.length) {
        break;
      }
      localList = localObject2[i1];
      if (localList != null)
      {
        if ((localObject3 != null) && (i1 < ((List)localObject3).size())) {
          localObject2 = (A)((List)localObject3).get(i1);
        } else {
          localObject2 = null;
        }
        if ((paramParcelable != null) && (i1 < paramParcelable.size())) {
          localObject1 = (android.arch.lifecycle.s)paramParcelable.get(i1);
        } else {
          localObject1 = null;
        }
        localObject2 = localList.a(this.s, this.t, this.u, (A)localObject2, (android.arch.lifecycle.s)localObject1);
        if (a)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("restoreAllState: active #");
          ((StringBuilder)localObject1).append(i1);
          ((StringBuilder)localObject1).append(": ");
          ((StringBuilder)localObject1).append(localObject2);
          Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
        }
        this.k.put(((l)localObject2).g, localObject2);
        localList.l = null;
      }
    }
    if (??? != null)
    {
      paramParcelable = ???.b();
      if (paramParcelable != null) {
        i1 = paramParcelable.size();
      } else {
        i1 = 0;
      }
      for (i2 = 0; i2 < i1; i2++)
      {
        ??? = (l)paramParcelable.get(i2);
        i3 = ???.k;
        if (i3 >= 0)
        {
          ???.j = ((l)this.k.get(i3));
          if (???.j == null)
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("Re-attaching retained fragment ");
            ((StringBuilder)localObject3).append(???);
            ((StringBuilder)localObject3).append(" target no longer exists: ");
            ((StringBuilder)localObject3).append(???.k);
            Log.w("FragmentManager", ((StringBuilder)localObject3).toString());
          }
        }
      }
    }
    this.j.clear();
    if (localC.b != null)
    {
      i1 = 0;
      for (;;)
      {
        paramParcelable = localC.b;
        if (i1 >= paramParcelable.length) {
          break label902;
        }
        paramParcelable = (l)this.k.get(paramParcelable[i1]);
        if (paramParcelable == null) {
          break label857;
        }
        paramParcelable.m = true;
        if (a)
        {
          ??? = new StringBuilder();
          ???.append("restoreAllState: added #");
          ???.append(i1);
          ???.append(": ");
          ???.append(paramParcelable);
          Log.v("FragmentManager", ???.toString());
        }
        if (!this.j.contains(paramParcelable)) {
          synchronized (this.j)
          {
            this.j.add(paramParcelable);
            i1++;
          }
        }
      }
      throw new IllegalStateException("Already added!");
      label857:
      paramParcelable = new StringBuilder();
      paramParcelable.append("No instantiated fragment for index #");
      paramParcelable.append(localC.b[i1]);
      a(new IllegalStateException(paramParcelable.toString()));
      throw null;
    }
    label902:
    paramParcelable = localC.c;
    if (paramParcelable != null)
    {
      this.l = new ArrayList(paramParcelable.length);
      for (i1 = 0;; i1++)
      {
        paramParcelable = localC.c;
        if (i1 >= paramParcelable.length) {
          break;
        }
        paramParcelable = paramParcelable[i1].a(this);
        if (a)
        {
          ??? = new StringBuilder();
          ???.append("restoreAllState: back stack #");
          ???.append(i1);
          ???.append(" (index ");
          ???.append(paramParcelable.m);
          ???.append("): ");
          ???.append(paramParcelable);
          Log.v("FragmentManager", ???.toString());
          ??? = new PrintWriter(new ld("FragmentManager"));
          paramParcelable.a("  ", ???, false);
          ???.close();
        }
        this.l.add(paramParcelable);
        i2 = paramParcelable.m;
        if (i2 >= 0) {
          a(i2, paramParcelable);
        }
      }
    }
    this.l = null;
    i1 = localC.d;
    if (i1 >= 0) {
      this.v = ((l)this.k.get(i1));
    }
    this.i = localC.e;
  }
  
  void a(d paramd)
  {
    if (this.l == null) {
      this.l = new ArrayList();
    }
    this.l.add(paramd);
  }
  
  void a(d paramd, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean1) {
      paramd.c(paramBoolean3);
    } else {
      paramd.f();
    }
    Object localObject = new ArrayList(1);
    ArrayList localArrayList = new ArrayList(1);
    ((ArrayList)localObject).add(paramd);
    localArrayList.add(Boolean.valueOf(paramBoolean1));
    if (paramBoolean2) {
      L.a(this, (ArrayList)localObject, localArrayList, 0, 1, true);
    }
    if (paramBoolean3) {
      a(this.r, true);
    }
    localObject = this.k;
    if (localObject != null)
    {
      int i1 = ((SparseArray)localObject).size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        localObject = (l)this.k.valueAt(i2);
        if ((localObject != null) && (((l)localObject).K != null) && (((l)localObject).P) && (paramd.b(((l)localObject).A)))
        {
          float f1 = ((l)localObject).R;
          if (f1 > 0.0F) {
            ((l)localObject).K.setAlpha(f1);
          }
          if (paramBoolean3)
          {
            ((l)localObject).R = 0.0F;
          }
          else
          {
            ((l)localObject).R = -1.0F;
            ((l)localObject).P = false;
          }
        }
      }
    }
  }
  
  void a(l paraml, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    boolean bool1 = paraml.m;
    int i1 = 1;
    boolean bool2 = true;
    if ((bool1) && (!paraml.D)) {
      break label44;
    }
    int i2 = paramInt1;
    paramInt1 = i2;
    if (i2 > 1) {
      paramInt1 = 1;
    }
    label44:
    i2 = paramInt1;
    if (paraml.n)
    {
      i3 = paraml.c;
      i2 = paramInt1;
      if (paramInt1 > i3) {
        if ((i3 == 0) && (paraml.kb())) {
          i2 = 1;
        } else {
          i2 = paraml.c;
        }
      }
    }
    if ((paraml.M) && (paraml.c < 3) && (i2 > 2)) {
      paramInt1 = 2;
    } else {
      paramInt1 = i2;
    }
    int i3 = paraml.c;
    Object localObject3;
    Object localObject2;
    if (i3 <= paramInt1)
    {
      if ((paraml.o) && (!paraml.p)) {
        return;
      }
      if ((paraml.Ha() != null) || (paraml.Ia() != null))
      {
        paraml.a(null);
        paraml.a(null);
        a(paraml, paraml.ab(), 0, 0, true);
      }
      i2 = paraml.c;
      Object localObject1;
      if (i2 != 0)
      {
        paramInt2 = paramInt1;
        if (i2 != 1)
        {
          paramInt3 = paramInt1;
          if (i2 == 2) {
            break label1240;
          }
          paramInt2 = paramInt1;
          if (i2 == 3) {
            break label1305;
          }
          i2 = paramInt1;
          break label1990;
        }
      }
      else
      {
        paramInt2 = paramInt1;
        if (paramInt1 > 0)
        {
          if (a)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("moveto CREATED: ");
            ((StringBuilder)localObject1).append(paraml);
            Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
          }
          localObject1 = paraml.d;
          paramInt2 = paramInt1;
          if (localObject1 != null)
          {
            ((Bundle)localObject1).setClassLoader(this.s.c().getClassLoader());
            paraml.e = paraml.d.getSparseParcelableArray("android:view_state");
            paraml.j = a(paraml.d, "android:target_state");
            if (paraml.j != null) {
              paraml.l = paraml.d.getInt("android:target_req_state", 0);
            }
            localObject1 = paraml.f;
            if (localObject1 != null)
            {
              paraml.N = ((Boolean)localObject1).booleanValue();
              paraml.f = null;
            }
            else
            {
              paraml.N = paraml.d.getBoolean("android:user_visible_hint", true);
            }
            paramInt2 = paramInt1;
            if (!paraml.N)
            {
              paraml.M = true;
              paramInt2 = paramInt1;
              if (paramInt1 > 2) {
                paramInt2 = 2;
              }
            }
          }
          localObject1 = this.s;
          paraml.u = ((r)localObject1);
          localObject3 = this.u;
          paraml.y = ((l)localObject3);
          if (localObject3 != null) {
            localObject1 = ((l)localObject3).v;
          } else {
            localObject1 = ((r)localObject1).d();
          }
          paraml.t = ((z)localObject1);
          localObject1 = paraml.j;
          if (localObject1 != null)
          {
            localObject1 = this.k.get(((l)localObject1).g);
            localObject3 = paraml.j;
            if (localObject1 == localObject3)
            {
              if (((l)localObject3).c < 1) {
                a((l)localObject3, 1, 0, 0, true);
              }
            }
            else
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Fragment ");
              ((StringBuilder)localObject1).append(paraml);
              ((StringBuilder)localObject1).append(" declared target fragment ");
              ((StringBuilder)localObject1).append(paraml.j);
              ((StringBuilder)localObject1).append(" that does not belong to this FragmentManager!");
              throw new IllegalStateException(((StringBuilder)localObject1).toString());
            }
          }
          b(paraml, this.s.c(), false);
          paraml.I = false;
          paraml.a(this.s.c());
          if (paraml.I)
          {
            localObject1 = paraml.y;
            if (localObject1 == null) {
              this.s.a(paraml);
            } else {
              ((l)localObject1).a(paraml);
            }
            a(paraml, this.s.c(), false);
            if (!paraml.T)
            {
              c(paraml, paraml.d, false);
              paraml.h(paraml.d);
              b(paraml, paraml.d, false);
            }
            else
            {
              paraml.k(paraml.d);
              paraml.c = 1;
            }
            paraml.F = false;
          }
          else
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Fragment ");
            ((StringBuilder)localObject1).append(paraml);
            ((StringBuilder)localObject1).append(" did not call through to super.onAttach()");
            throw new ia(((StringBuilder)localObject1).toString());
          }
        }
      }
      e(paraml);
      paramInt3 = paramInt2;
      if (paramInt2 > 1)
      {
        if (a)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("moveto ACTIVITY_CREATED: ");
          ((StringBuilder)localObject1).append(paraml);
          Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
        }
        if (!paraml.o)
        {
          paramInt1 = paraml.A;
          if (paramInt1 != 0)
          {
            if (paramInt1 != -1)
            {
              localObject3 = (ViewGroup)this.t.a(paramInt1);
              localObject1 = localObject3;
              if (localObject3 == null) {
                if (paraml.q)
                {
                  localObject1 = localObject3;
                }
                else
                {
                  try
                  {
                    localObject1 = paraml.Wa().getResourceName(paraml.A);
                  }
                  catch (Resources.NotFoundException localNotFoundException)
                  {
                    localObject2 = "unknown";
                  }
                  localObject3 = new StringBuilder();
                  ((StringBuilder)localObject3).append("No view found for id 0x");
                  ((StringBuilder)localObject3).append(Integer.toHexString(paraml.A));
                  ((StringBuilder)localObject3).append(" (");
                  ((StringBuilder)localObject3).append((String)localObject2);
                  ((StringBuilder)localObject3).append(") for fragment ");
                  ((StringBuilder)localObject3).append(paraml);
                  a(new IllegalArgumentException(((StringBuilder)localObject3).toString()));
                  throw null;
                }
              }
            }
            else
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("Cannot create fragment ");
              ((StringBuilder)localObject2).append(paraml);
              ((StringBuilder)localObject2).append(" for a container view with no id");
              a(new IllegalArgumentException(((StringBuilder)localObject2).toString()));
              throw null;
            }
          }
          else {
            localObject2 = null;
          }
          paraml.J = ((ViewGroup)localObject2);
          paraml.b(paraml.i(paraml.d), (ViewGroup)localObject2, paraml.d);
          localObject3 = paraml.K;
          if (localObject3 != null)
          {
            paraml.L = ((View)localObject3);
            ((View)localObject3).setSaveFromParentEnabled(false);
            if (localObject2 != null) {
              ((ViewGroup)localObject2).addView(paraml.K);
            }
            if (paraml.C) {
              paraml.K.setVisibility(8);
            }
            paraml.a(paraml.K, paraml.d);
            a(paraml, paraml.K, paraml.d, false);
            if ((paraml.K.getVisibility() == 0) && (paraml.J != null)) {
              paramBoolean = bool2;
            } else {
              paramBoolean = false;
            }
            paraml.P = paramBoolean;
          }
          else
          {
            paraml.L = null;
          }
        }
        paraml.g(paraml.d);
        a(paraml, paraml.d, false);
        if (paraml.K != null) {
          paraml.l(paraml.d);
        }
        paraml.d = null;
        paramInt3 = paramInt2;
      }
      label1240:
      paramInt2 = paramInt3;
      if (paramInt3 > 2)
      {
        if (a)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("moveto STARTED: ");
          ((StringBuilder)localObject2).append(paraml);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        paraml.Fb();
        f(paraml, false);
        paramInt2 = paramInt3;
      }
      label1305:
      i2 = paramInt2;
      if (paramInt2 > 3)
      {
        if (a)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("moveto RESUMED: ");
          ((StringBuilder)localObject2).append(paraml);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        paraml.Eb();
        e(paraml, false);
        paraml.d = null;
        paraml.e = null;
        i2 = paramInt2;
      }
    }
    else
    {
      i2 = paramInt1;
      if (i3 > paramInt1)
      {
        if (i3 != 1)
        {
          if (i3 != 2)
          {
            if (i3 != 3)
            {
              if (i3 != 4)
              {
                i2 = paramInt1;
                break label1990;
              }
              if (paramInt1 < 4)
              {
                if (a)
                {
                  localObject2 = new StringBuilder();
                  ((StringBuilder)localObject2).append("movefrom RESUMED: ");
                  ((StringBuilder)localObject2).append(paraml);
                  Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
                }
                paraml.Db();
                d(paraml, false);
              }
            }
            if (paramInt1 < 3)
            {
              if (a)
              {
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append("movefrom STARTED: ");
                ((StringBuilder)localObject2).append(paraml);
                Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
              }
              paraml.Gb();
              g(paraml, false);
            }
          }
          if (paramInt1 < 2)
          {
            if (a)
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("movefrom ACTIVITY_CREATED: ");
              ((StringBuilder)localObject2).append(paraml);
              Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
            }
            if ((paraml.K != null) && (this.s.b(paraml)) && (paraml.e == null)) {
              n(paraml);
            }
            paraml.Ab();
            h(paraml, false);
            localObject3 = paraml.K;
            if (localObject3 != null)
            {
              localObject2 = paraml.J;
              if (localObject2 != null)
              {
                ((ViewGroup)localObject2).endViewTransition((View)localObject3);
                paraml.K.clearAnimation();
                if ((this.r > 0) && (!this.z) && (paraml.K.getVisibility() == 0) && (paraml.R >= 0.0F)) {
                  localObject2 = a(paraml, paramInt2, false, paramInt3);
                } else {
                  localObject2 = null;
                }
                paraml.R = 0.0F;
                if (localObject2 != null) {
                  a(paraml, (c)localObject2, paramInt1);
                }
                paraml.J.removeView(paraml.K);
              }
            }
            paraml.J = null;
            paraml.K = null;
            paraml.W = null;
            paraml.X.b(null);
            paraml.L = null;
            paraml.p = false;
          }
        }
        i2 = paramInt1;
        if (paramInt1 < 1)
        {
          if (this.z) {
            if (paraml.Ha() != null)
            {
              localObject2 = paraml.Ha();
              paraml.a(null);
              ((View)localObject2).clearAnimation();
            }
            else if (paraml.Ia() != null)
            {
              localObject2 = paraml.Ia();
              paraml.a(null);
              ((Animator)localObject2).cancel();
            }
          }
          if ((paraml.Ha() == null) && (paraml.Ia() == null))
          {
            if (a)
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("movefrom CREATED: ");
              ((StringBuilder)localObject2).append(paraml);
              Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
            }
            if (!paraml.F)
            {
              paraml.zb();
              b(paraml, false);
            }
            else
            {
              paraml.c = 0;
            }
            paraml.Bb();
            c(paraml, false);
            i2 = paramInt1;
            if (!paramBoolean) {
              if (!paraml.F)
              {
                h(paraml);
                i2 = paramInt1;
              }
              else
              {
                paraml.u = null;
                paraml.y = null;
                paraml.t = null;
                i2 = paramInt1;
              }
            }
          }
          else
          {
            paraml.d(paramInt1);
            paramInt1 = i1;
            break label1993;
          }
        }
      }
    }
    label1990:
    paramInt1 = i2;
    label1993:
    if (paraml.c != paramInt1)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("moveToState: Fragment state for ");
      ((StringBuilder)localObject2).append(paraml);
      ((StringBuilder)localObject2).append(" not updated inline; ");
      ((StringBuilder)localObject2).append("expected state ");
      ((StringBuilder)localObject2).append(paramInt1);
      ((StringBuilder)localObject2).append(" found ");
      ((StringBuilder)localObject2).append(paraml.c);
      Log.w("FragmentManager", ((StringBuilder)localObject2).toString());
      paraml.c = paramInt1;
    }
  }
  
  void a(l paraml, Context paramContext, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).a(paraml, paramContext, true);
      }
    }
    localObject = this.q.iterator();
    while (((Iterator)localObject).hasNext())
    {
      f localf = (f)((Iterator)localObject).next();
      if ((!paramBoolean) || (localf.b)) {
        localf.a.a(this, paraml, paramContext);
      }
    }
  }
  
  void a(l paraml, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).a(paraml, paramBundle, true);
      }
    }
    Iterator localIterator = this.q.iterator();
    while (localIterator.hasNext())
    {
      localObject = (f)localIterator.next();
      if ((!paramBoolean) || (((f)localObject).b)) {
        ((f)localObject).a.a(this, paraml, paramBundle);
      }
    }
  }
  
  void a(l paraml, View paramView, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).a(paraml, paramView, paramBundle, true);
      }
    }
    Iterator localIterator = this.q.iterator();
    while (localIterator.hasNext())
    {
      localObject = (f)localIterator.next();
      if ((!paramBoolean) || (((f)localObject).b)) {
        ((f)localObject).a.a(this, paraml, paramView, paramBundle);
      }
    }
  }
  
  public void a(l paraml, boolean paramBoolean)
  {
    if (a)
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("add: ");
      ((StringBuilder)???).append(paraml);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    g(paraml);
    if (!paraml.D)
    {
      if (!this.j.contains(paraml)) {
        synchronized (this.j)
        {
          this.j.add(paraml);
          paraml.m = true;
          paraml.n = false;
          if (paraml.K == null) {
            paraml.Q = false;
          }
          if ((paraml.G) && (paraml.H)) {
            this.w = true;
          }
          if (!paramBoolean) {
            return;
          }
          j(paraml);
        }
      }
      ??? = new StringBuilder();
      ((StringBuilder)???).append("Fragment already added: ");
      ((StringBuilder)???).append(paraml);
      throw new IllegalStateException(((StringBuilder)???).toString());
    }
  }
  
  public void a(r paramr, p paramp, l paraml)
  {
    if (this.s == null)
    {
      this.s = paramr;
      this.t = paramp;
      this.u = paraml;
      return;
    }
    throw new IllegalStateException("Already attached");
  }
  
  public void a(h paramh, boolean paramBoolean)
  {
    if (!paramBoolean) {
      B();
    }
    try
    {
      if ((!this.z) && (this.s != null))
      {
        if (this.g == null)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          this.g = localArrayList;
        }
        this.g.add(paramh);
        y();
        return;
      }
      if (paramBoolean) {
        return;
      }
      paramh = new java/lang/IllegalStateException;
      paramh.<init>("Activity has been destroyed");
      throw paramh;
    }
    finally {}
  }
  
  public void a(Menu paramMenu)
  {
    if (this.r < 1) {
      return;
    }
    for (int i1 = 0; i1 < this.j.size(); i1++)
    {
      l locall = (l)this.j.get(i1);
      if (locall != null) {
        locall.c(paramMenu);
      }
    }
  }
  
  public void a(String paramString, int paramInt)
  {
    a(new i(paramString, -1, paramInt), false);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("    ");
    localObject1 = ((StringBuilder)localObject1).toString();
    Object localObject2 = this.k;
    int i1 = 0;
    int i3;
    if (localObject2 != null)
    {
      i2 = ((SparseArray)localObject2).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (i3 = 0; i3 < i2; i3++)
        {
          localObject2 = (l)this.k.valueAt(i3);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i3);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localObject2);
          if (localObject2 != null) {
            ((l)localObject2).a((String)localObject1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
        }
      }
    }
    int i2 = this.j.size();
    if (i2 > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      for (i3 = 0; i3 < i2; i3++)
      {
        localObject2 = (l)this.j.get(i3);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(i3);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(((l)localObject2).toString());
      }
    }
    localObject2 = this.m;
    if (localObject2 != null)
    {
      i2 = ((ArrayList)localObject2).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (i3 = 0; i3 < i2; i3++)
        {
          localObject2 = (l)this.m.get(i3);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i3);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((l)localObject2).toString());
        }
      }
    }
    localObject2 = this.l;
    if (localObject2 != null)
    {
      i2 = ((ArrayList)localObject2).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (i3 = 0; i3 < i2; i3++)
        {
          localObject2 = (d)this.l.get(i3);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i3);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((d)localObject2).toString());
          ((d)localObject2).a((String)localObject1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    try
    {
      if (this.n != null)
      {
        i2 = this.n.size();
        if (i2 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (i3 = 0; i3 < i2; i3++)
          {
            paramFileDescriptor = (d)this.n.get(i3);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i3);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
          }
        }
      }
      if ((this.o != null) && (this.o.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.o.toArray()));
      }
      paramFileDescriptor = this.g;
      if (paramFileDescriptor != null)
      {
        i2 = paramFileDescriptor.size();
        if (i2 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          for (i3 = i1; i3 < i2; i3++)
          {
            paramFileDescriptor = (h)this.g.get(i3);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i3);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
          }
        }
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("FragmentManager misc state:");
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mHost=");
      paramPrintWriter.println(this.s);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mContainer=");
      paramPrintWriter.println(this.t);
      if (this.u != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mParent=");
        paramPrintWriter.println(this.u);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mCurState=");
      paramPrintWriter.print(this.r);
      paramPrintWriter.print(" mStateSaved=");
      paramPrintWriter.print(this.x);
      paramPrintWriter.print(" mStopped=");
      paramPrintWriter.print(this.y);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.z);
      if (this.w)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mNeedMenuInvalidate=");
        paramPrintWriter.println(this.w);
      }
      if (this.A != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mNoTransactionsBecause=");
        paramPrintWriter.println(this.A);
      }
      return;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    for (int i1 = this.j.size() - 1; i1 >= 0; i1--)
    {
      l locall = (l)this.j.get(i1);
      if (locall != null) {
        locall.t(paramBoolean);
      }
    }
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i1 = this.r;
    int i2 = 0;
    if (i1 < 1) {
      return false;
    }
    Object localObject1 = null;
    i1 = 0;
    boolean bool2;
    for (boolean bool1 = false; i1 < this.j.size(); bool1 = bool2)
    {
      l locall = (l)this.j.get(i1);
      Object localObject2 = localObject1;
      bool2 = bool1;
      if (locall != null)
      {
        localObject2 = localObject1;
        bool2 = bool1;
        if (locall.b(paramMenu, paramMenuInflater))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new ArrayList();
          }
          ((ArrayList)localObject2).add(locall);
          bool2 = true;
        }
      }
      i1++;
      localObject1 = localObject2;
    }
    if (this.m != null) {
      for (i1 = i2; i1 < this.m.size(); i1++)
      {
        paramMenu = (l)this.m.get(i1);
        if ((localObject1 == null) || (!((ArrayList)localObject1).contains(paramMenu))) {
          paramMenu.rb();
        }
      }
    }
    this.m = ((ArrayList)localObject1);
    return bool1;
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    if (this.r < 1) {
      return false;
    }
    for (int i1 = 0; i1 < this.j.size(); i1++)
    {
      l locall = (l)this.j.get(i1);
      if ((locall != null) && (locall.c(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  boolean a(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1, String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = this.l;
    if (localObject == null) {
      return false;
    }
    if ((paramString == null) && (paramInt1 < 0) && ((paramInt2 & 0x1) == 0))
    {
      paramInt1 = ((ArrayList)localObject).size() - 1;
      if (paramInt1 < 0) {
        return false;
      }
      paramArrayList.add(this.l.remove(paramInt1));
      paramArrayList1.add(Boolean.valueOf(true));
    }
    else
    {
      int i1;
      if ((paramString == null) && (paramInt1 < 0))
      {
        i1 = -1;
      }
      else
      {
        for (int i2 = this.l.size() - 1; i2 >= 0; i2--)
        {
          localObject = (d)this.l.get(i2);
          if (((paramString != null) && (paramString.equals(((d)localObject).getName()))) || ((paramInt1 >= 0) && (paramInt1 == ((d)localObject).m))) {
            break;
          }
        }
        if (i2 < 0) {
          return false;
        }
        i1 = i2;
        if ((paramInt2 & 0x1) != 0) {
          for (;;)
          {
            paramInt2 = i2 - 1;
            i1 = paramInt2;
            if (paramInt2 < 0) {
              break;
            }
            localObject = (d)this.l.get(paramInt2);
            if (paramString != null)
            {
              i2 = paramInt2;
              if (paramString.equals(((d)localObject).getName())) {}
            }
            else
            {
              i1 = paramInt2;
              if (paramInt1 < 0) {
                break;
              }
              i1 = paramInt2;
              if (paramInt1 != ((d)localObject).m) {
                break;
              }
              i2 = paramInt2;
            }
          }
        }
      }
      if (i1 == this.l.size() - 1) {
        return false;
      }
      for (paramInt1 = this.l.size() - 1; paramInt1 > i1; paramInt1--)
      {
        paramArrayList.add(this.l.remove(paramInt1));
        paramArrayList1.add(Boolean.valueOf(true));
      }
    }
    return true;
  }
  
  public int b()
  {
    ArrayList localArrayList = this.l;
    int i1;
    if (localArrayList != null) {
      i1 = localArrayList.size();
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  public int b(d paramd)
  {
    try
    {
      Object localObject;
      if ((this.o != null) && (this.o.size() > 0))
      {
        i1 = ((Integer)this.o.remove(this.o.size() - 1)).intValue();
        if (a)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Adding back stack index ");
          ((StringBuilder)localObject).append(i1);
          ((StringBuilder)localObject).append(" with ");
          ((StringBuilder)localObject).append(paramd);
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
        this.n.set(i1, paramd);
        return i1;
      }
      if (this.n == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.n = ((ArrayList)localObject);
      }
      int i1 = this.n.size();
      if (a)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Setting back stack index ");
        ((StringBuilder)localObject).append(i1);
        ((StringBuilder)localObject).append(" to ");
        ((StringBuilder)localObject).append(paramd);
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
      }
      this.n.add(paramd);
      return i1;
    }
    finally {}
  }
  
  public l b(String paramString)
  {
    Object localObject = this.k;
    if ((localObject != null) && (paramString != null)) {
      for (int i1 = ((SparseArray)localObject).size() - 1; i1 >= 0; i1--)
      {
        localObject = (l)this.k.valueAt(i1);
        if (localObject != null)
        {
          localObject = ((l)localObject).m(paramString);
          if (localObject != null) {
            return (l)localObject;
          }
        }
      }
    }
    return null;
  }
  
  public s.a b(int paramInt)
  {
    return (s.a)this.l.get(paramInt);
  }
  
  public void b(l paraml)
  {
    if (a)
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("attach: ");
      ((StringBuilder)???).append(paraml);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    if (paraml.D)
    {
      paraml.D = false;
      if (!paraml.m)
      {
        if (!this.j.contains(paraml))
        {
          if (a)
          {
            ??? = new StringBuilder();
            ((StringBuilder)???).append("add from attach: ");
            ((StringBuilder)???).append(paraml);
            Log.v("FragmentManager", ((StringBuilder)???).toString());
          }
          synchronized (this.j)
          {
            this.j.add(paraml);
            paraml.m = true;
            if ((!paraml.G) || (!paraml.H)) {
              return;
            }
            this.w = true;
          }
        }
        ??? = new StringBuilder();
        ((StringBuilder)???).append("Fragment already added: ");
        ((StringBuilder)???).append(paraml);
        throw new IllegalStateException(((StringBuilder)???).toString());
      }
    }
  }
  
  void b(l paraml, Context paramContext, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).b(paraml, paramContext, true);
      }
    }
    localObject = this.q.iterator();
    while (((Iterator)localObject).hasNext())
    {
      f localf = (f)((Iterator)localObject).next();
      if ((!paramBoolean) || (localf.b)) {
        localf.a.b(this, paraml, paramContext);
      }
    }
  }
  
  void b(l paraml, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).b(paraml, paramBundle, true);
      }
    }
    localObject = this.q.iterator();
    while (((Iterator)localObject).hasNext())
    {
      f localf = (f)((Iterator)localObject).next();
      if ((!paramBoolean) || (localf.b)) {
        localf.a.b(this, paraml, paramBundle);
      }
    }
  }
  
  void b(l paraml, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).b(paraml, true);
      }
    }
    localObject = this.q.iterator();
    while (((Iterator)localObject).hasNext())
    {
      f localf = (f)((Iterator)localObject).next();
      if ((!paramBoolean) || (localf.b)) {
        localf.a.a(this, paraml);
      }
    }
  }
  
  public void b(h paramh, boolean paramBoolean)
  {
    if ((paramBoolean) && ((this.s == null) || (this.z))) {
      return;
    }
    c(paramBoolean);
    if (paramh.a(this.C, this.D)) {
      this.h = true;
    }
    try
    {
      c(this.C, this.D);
      C();
    }
    finally
    {
      C();
    }
    A();
  }
  
  public void b(boolean paramBoolean)
  {
    for (int i1 = this.j.size() - 1; i1 >= 0; i1--)
    {
      l locall = (l)this.j.get(i1);
      if (locall != null) {
        locall.u(paramBoolean);
      }
    }
  }
  
  public boolean b(Menu paramMenu)
  {
    int i1 = this.r;
    int i2 = 0;
    if (i1 < 1) {
      return false;
    }
    boolean bool2;
    for (boolean bool1 = false; i2 < this.j.size(); bool1 = bool2)
    {
      l locall = (l)this.j.get(i2);
      bool2 = bool1;
      if (locall != null)
      {
        bool2 = bool1;
        if (locall.d(paramMenu)) {
          bool2 = true;
        }
      }
      i2++;
    }
    return bool1;
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    if (this.r < 1) {
      return false;
    }
    for (int i1 = 0; i1 < this.j.size(); i1++)
    {
      l locall = (l)this.j.get(i1);
      if ((locall != null) && (locall.d(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean b(String paramString, int paramInt)
  {
    B();
    return a(paramString, -1, paramInt);
  }
  
  public List<l> c()
  {
    if (this.j.isEmpty()) {
      return Collections.emptyList();
    }
    synchronized (this.j)
    {
      List localList = (List)this.j.clone();
      return localList;
    }
  }
  
  public void c(int paramInt)
  {
    try
    {
      this.n.set(paramInt, null);
      Object localObject1;
      if (this.o == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.o = ((ArrayList)localObject1);
      }
      if (a)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Freeing back stack index ");
        ((StringBuilder)localObject1).append(paramInt);
        Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
      }
      this.o.add(Integer.valueOf(paramInt));
      return;
    }
    finally {}
  }
  
  void c(l paraml)
  {
    if (paraml.K != null)
    {
      c localc = a(paraml, paraml.Sa(), paraml.C ^ true, paraml.Ta());
      if (localc != null)
      {
        Object localObject = localc.b;
        if (localObject != null)
        {
          ((Animator)localObject).setTarget(paraml.K);
          if (paraml.C)
          {
            if (paraml.jb())
            {
              paraml.v(false);
            }
            else
            {
              ViewGroup localViewGroup = paraml.J;
              localObject = paraml.K;
              localViewGroup.startViewTransition((View)localObject);
              localc.b.addListener(new x(this, localViewGroup, (View)localObject, paraml));
            }
          }
          else {
            paraml.K.setVisibility(0);
          }
          b(paraml.K, localc);
          localc.b.start();
          break label210;
        }
      }
      if (localc != null)
      {
        b(paraml.K, localc);
        paraml.K.startAnimation(localc.a);
        localc.a.start();
      }
      int i1;
      if ((paraml.C) && (!paraml.jb())) {
        i1 = 8;
      } else {
        i1 = 0;
      }
      paraml.K.setVisibility(i1);
      if (paraml.jb()) {
        paraml.v(false);
      }
    }
    label210:
    if ((paraml.m) && (paraml.G) && (paraml.H)) {
      this.w = true;
    }
    paraml.Q = false;
    paraml.q(paraml.C);
  }
  
  void c(l paraml, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).c(paraml, paramBundle, true);
      }
    }
    Iterator localIterator = this.q.iterator();
    while (localIterator.hasNext())
    {
      localObject = (f)localIterator.next();
      if ((!paramBoolean) || (((f)localObject).b)) {
        ((f)localObject).a.c(this, paraml, paramBundle);
      }
    }
  }
  
  void c(l paraml, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).c(paraml, true);
      }
    }
    localObject = this.q.iterator();
    while (((Iterator)localObject).hasNext())
    {
      f localf = (f)((Iterator)localObject).next();
      if ((!paramBoolean) || (localf.b)) {
        localf.a.b(this, paraml);
      }
    }
  }
  
  public void d(l paraml)
  {
    if (a)
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("detach: ");
      ((StringBuilder)???).append(paraml);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    if (!paraml.D)
    {
      paraml.D = true;
      if (paraml.m)
      {
        if (a)
        {
          ??? = new StringBuilder();
          ((StringBuilder)???).append("remove from detach: ");
          ((StringBuilder)???).append(paraml);
          Log.v("FragmentManager", ((StringBuilder)???).toString());
        }
        synchronized (this.j)
        {
          this.j.remove(paraml);
          if ((paraml.G) && (paraml.H)) {
            this.w = true;
          }
          paraml.m = false;
        }
      }
    }
  }
  
  void d(l paraml, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).d(paraml, paramBundle, true);
      }
    }
    Iterator localIterator = this.q.iterator();
    while (localIterator.hasNext())
    {
      localObject = (f)localIterator.next();
      if ((!paramBoolean) || (((f)localObject).b)) {
        ((f)localObject).a.d(this, paraml, paramBundle);
      }
    }
  }
  
  void d(l paraml, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).d(paraml, true);
      }
    }
    Iterator localIterator = this.q.iterator();
    while (localIterator.hasNext())
    {
      localObject = (f)localIterator.next();
      if ((!paramBoolean) || (((f)localObject).b)) {
        ((f)localObject).a.c(this, paraml);
      }
    }
  }
  
  public boolean d()
  {
    boolean bool;
    if ((!this.x) && (!this.y)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  boolean d(int paramInt)
  {
    boolean bool;
    if (this.r >= paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void e()
  {
    a(new i(null, -1, 0), false);
  }
  
  void e(l paraml)
  {
    if ((paraml.o) && (!paraml.r))
    {
      paraml.b(paraml.i(paraml.d), null, paraml.d);
      View localView = paraml.K;
      if (localView != null)
      {
        paraml.L = localView;
        localView.setSaveFromParentEnabled(false);
        if (paraml.C) {
          paraml.K.setVisibility(8);
        }
        paraml.a(paraml.K, paraml.d);
        a(paraml, paraml.K, paraml.d, false);
      }
      else
      {
        paraml.L = null;
      }
    }
  }
  
  void e(l paraml, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).e(paraml, true);
      }
    }
    localObject = this.q.iterator();
    while (((Iterator)localObject).hasNext())
    {
      f localf = (f)((Iterator)localObject).next();
      if ((!paramBoolean) || (localf.b)) {
        localf.a.d(this, paraml);
      }
    }
  }
  
  public void f(l paraml)
  {
    if (a)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("hide: ");
      localStringBuilder.append(paraml);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (!paraml.C)
    {
      paraml.C = true;
      paraml.Q = (true ^ paraml.Q);
    }
  }
  
  void f(l paraml, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).f(paraml, true);
      }
    }
    Iterator localIterator = this.q.iterator();
    while (localIterator.hasNext())
    {
      localObject = (f)localIterator.next();
      if ((!paramBoolean) || (((f)localObject).b)) {
        ((f)localObject).a.e(this, paraml);
      }
    }
  }
  
  public boolean f()
  {
    B();
    return a(null, -1, 0);
  }
  
  public void g()
  {
    this.x = false;
    this.y = false;
    f(2);
  }
  
  void g(l paraml)
  {
    if (paraml.g >= 0) {
      return;
    }
    int i1 = this.i;
    this.i = (i1 + 1);
    paraml.a(i1, this.u);
    if (this.k == null) {
      this.k = new SparseArray();
    }
    this.k.put(paraml.g, paraml);
    if (a)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Allocated fragment index ");
      localStringBuilder.append(paraml);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  void g(l paraml, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).g(paraml, true);
      }
    }
    localObject = this.q.iterator();
    while (((Iterator)localObject).hasNext())
    {
      f localf = (f)((Iterator)localObject).next();
      if ((!paramBoolean) || (localf.b)) {
        localf.a.f(this, paraml);
      }
    }
  }
  
  public void h()
  {
    this.x = false;
    this.y = false;
    f(1);
  }
  
  void h(l paraml)
  {
    if (paraml.g < 0) {
      return;
    }
    if (a)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Freeing fragment index ");
      localStringBuilder.append(paraml);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    this.k.put(paraml.g, null);
    paraml.fb();
  }
  
  void h(l paraml, boolean paramBoolean)
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      localObject = ((l)localObject).Qa();
      if ((localObject instanceof z)) {
        ((z)localObject).h(paraml, true);
      }
    }
    localObject = this.q.iterator();
    while (((Iterator)localObject).hasNext())
    {
      f localf = (f)((Iterator)localObject).next();
      if ((!paramBoolean) || (localf.b)) {
        localf.a.g(this, paraml);
      }
    }
  }
  
  public void i()
  {
    this.z = true;
    q();
    f(0);
    this.s = null;
    this.t = null;
    this.u = null;
  }
  
  void i(l paraml)
  {
    if (paraml == null) {
      return;
    }
    int i1 = this.r;
    int i2 = i1;
    if (paraml.n) {
      if (paraml.kb()) {
        i2 = Math.min(i1, 1);
      } else {
        i2 = Math.min(i1, 0);
      }
    }
    a(paraml, i2, paraml.Sa(), paraml.Ta(), false);
    if (paraml.K != null)
    {
      Object localObject1 = q(paraml);
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = ((l)localObject1).K;
        localObject1 = paraml.J;
        i1 = ((ViewGroup)localObject1).indexOfChild((View)localObject2);
        i2 = ((ViewGroup)localObject1).indexOfChild(paraml.K);
        if (i2 < i1)
        {
          ((ViewGroup)localObject1).removeViewAt(i2);
          ((ViewGroup)localObject1).addView(paraml.K, i1);
        }
      }
      if ((paraml.P) && (paraml.J != null))
      {
        float f1 = paraml.R;
        if (f1 > 0.0F) {
          paraml.K.setAlpha(f1);
        }
        paraml.R = 0.0F;
        paraml.P = false;
        localObject1 = a(paraml, paraml.Sa(), true, paraml.Ta());
        if (localObject1 != null)
        {
          b(paraml.K, (c)localObject1);
          localObject2 = ((c)localObject1).a;
          if (localObject2 != null)
          {
            paraml.K.startAnimation((Animation)localObject2);
          }
          else
          {
            ((c)localObject1).b.setTarget(paraml.K);
            ((c)localObject1).b.start();
          }
        }
      }
    }
    if (paraml.Q) {
      c(paraml);
    }
  }
  
  public void j()
  {
    f(1);
  }
  
  void j(l paraml)
  {
    a(paraml, this.r, 0, 0, false);
  }
  
  public void k()
  {
    for (int i1 = 0; i1 < this.j.size(); i1++)
    {
      l locall = (l)this.j.get(i1);
      if (locall != null) {
        locall.Cb();
      }
    }
  }
  
  public void k(l paraml)
  {
    if (paraml.M)
    {
      if (this.h)
      {
        this.B = true;
        return;
      }
      paraml.M = false;
      a(paraml, this.r, 0, 0, false);
    }
  }
  
  public void l()
  {
    f(3);
  }
  
  public void l(l paraml)
  {
    if (a)
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("remove: ");
      ((StringBuilder)???).append(paraml);
      ((StringBuilder)???).append(" nesting=");
      ((StringBuilder)???).append(paraml.s);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    boolean bool = paraml.kb();
    if ((!paraml.D) || ((bool ^ true))) {}
    synchronized (this.j)
    {
      this.j.remove(paraml);
      if ((paraml.G) && (paraml.H)) {
        this.w = true;
      }
      paraml.m = false;
      paraml.n = true;
      return;
    }
  }
  
  Bundle m(l paraml)
  {
    if (this.F == null) {
      this.F = new Bundle();
    }
    paraml.j(this.F);
    d(paraml, this.F, false);
    if (!this.F.isEmpty())
    {
      localObject1 = this.F;
      this.F = null;
    }
    else
    {
      localObject1 = null;
    }
    if (paraml.K != null) {
      n(paraml);
    }
    Object localObject2 = localObject1;
    if (paraml.e != null)
    {
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new Bundle();
      }
      ((Bundle)localObject2).putSparseParcelableArray("android:view_state", paraml.e);
    }
    Object localObject1 = localObject2;
    if (!paraml.N)
    {
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Bundle();
      }
      ((Bundle)localObject1).putBoolean("android:user_visible_hint", paraml.N);
    }
    return (Bundle)localObject1;
  }
  
  public void m()
  {
    this.x = false;
    this.y = false;
    f(4);
  }
  
  public void n()
  {
    this.x = false;
    this.y = false;
    f(3);
  }
  
  void n(l paraml)
  {
    if (paraml.L == null) {
      return;
    }
    SparseArray localSparseArray = this.G;
    if (localSparseArray == null) {
      this.G = new SparseArray();
    } else {
      localSparseArray.clear();
    }
    paraml.L.saveHierarchyState(this.G);
    if (this.G.size() > 0)
    {
      paraml.e = this.G;
      this.G = null;
    }
  }
  
  public void o()
  {
    this.y = true;
    f(2);
  }
  
  public void o(l paraml)
  {
    if ((paraml != null) && ((this.k.get(paraml.g) != paraml) || ((paraml.u != null) && (paraml.Qa() != this))))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Fragment ");
      localStringBuilder.append(paraml);
      localStringBuilder.append(" is not an active fragment of FragmentManager ");
      localStringBuilder.append(this);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    this.v = paraml;
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return null;
    }
    paramString = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, g.a);
    int i1 = 0;
    String str1 = paramString;
    if (paramString == null) {
      str1 = localTypedArray.getString(0);
    }
    int i2 = localTypedArray.getResourceId(1, -1);
    String str2 = localTypedArray.getString(2);
    localTypedArray.recycle();
    if (!l.a(this.s.c(), str1)) {
      return null;
    }
    if (paramView != null) {
      i1 = paramView.getId();
    }
    if ((i1 == -1) && (i2 == -1) && (str2 == null))
    {
      paramView = new StringBuilder();
      paramView.append(paramAttributeSet.getPositionDescription());
      paramView.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
      paramView.append(str1);
      throw new IllegalArgumentException(paramView.toString());
    }
    if (i2 != -1) {
      paramView = a(i2);
    } else {
      paramView = null;
    }
    paramString = paramView;
    if (paramView == null)
    {
      paramString = paramView;
      if (str2 != null) {
        paramString = a(str2);
      }
    }
    paramView = paramString;
    if (paramString == null)
    {
      paramView = paramString;
      if (i1 != -1) {
        paramView = a(i1);
      }
    }
    if (a)
    {
      paramString = new StringBuilder();
      paramString.append("onCreateView: id=0x");
      paramString.append(Integer.toHexString(i2));
      paramString.append(" fname=");
      paramString.append(str1);
      paramString.append(" existing=");
      paramString.append(paramView);
      Log.v("FragmentManager", paramString.toString());
    }
    if (paramView == null)
    {
      paramView = this.t.a(paramContext, str1, null);
      paramView.o = true;
      int i3;
      if (i2 != 0) {
        i3 = i2;
      } else {
        i3 = i1;
      }
      paramView.z = i3;
      paramView.A = i1;
      paramView.B = str2;
      paramView.p = true;
      paramView.t = this;
      paramString = this.s;
      paramView.u = paramString;
      paramView.a(paramString.c(), paramAttributeSet, paramView.d);
      a(paramView, true);
    }
    else
    {
      if (paramView.p) {
        break label560;
      }
      paramView.p = true;
      paramString = this.s;
      paramView.u = paramString;
      if (!paramView.F) {
        paramView.a(paramString.c(), paramAttributeSet, paramView.d);
      }
    }
    if ((this.r < 1) && (paramView.o)) {
      a(paramView, 1, 0, 0, false);
    } else {
      j(paramView);
    }
    paramString = paramView.K;
    if (paramString != null)
    {
      if (i2 != 0) {
        paramString.setId(i2);
      }
      if (paramView.K.getTag() == null) {
        paramView.K.setTag(str2);
      }
      return paramView.K;
    }
    paramView = new StringBuilder();
    paramView.append("Fragment ");
    paramView.append(str1);
    paramView.append(" did not create a view.");
    throw new IllegalStateException(paramView.toString());
    label560:
    paramView = new StringBuilder();
    paramView.append(paramAttributeSet.getPositionDescription());
    paramView.append(": Duplicate id 0x");
    paramView.append(Integer.toHexString(i2));
    paramView.append(", tag ");
    paramView.append(str2);
    paramView.append(", or parent id 0x");
    paramView.append(Integer.toHexString(i1));
    paramView.append(" with another fragment for ");
    paramView.append(str1);
    throw new IllegalArgumentException(paramView.toString());
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  void p()
  {
    if (this.B)
    {
      this.B = false;
      z();
    }
  }
  
  public void p(l paraml)
  {
    if (a)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("show: ");
      localStringBuilder.append(paraml);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (paraml.C)
    {
      paraml.C = false;
      paraml.Q ^= true;
    }
  }
  
  /* Error */
  public boolean q()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokespecial 569	android/support/v4/app/z:c	(Z)V
    //   5: iconst_0
    //   6: istore_1
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 199	android/support/v4/app/z:C	Ljava/util/ArrayList;
    //   12: aload_0
    //   13: getfield 194	android/support/v4/app/z:D	Ljava/util/ArrayList;
    //   16: invokespecial 1566	android/support/v4/app/z:b	(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    //   19: ifeq +36 -> 55
    //   22: aload_0
    //   23: iconst_1
    //   24: putfield 192	android/support/v4/app/z:h	Z
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 199	android/support/v4/app/z:C	Ljava/util/ArrayList;
    //   32: aload_0
    //   33: getfield 194	android/support/v4/app/z:D	Ljava/util/ArrayList;
    //   36: invokespecial 582	android/support/v4/app/z:c	(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   39: aload_0
    //   40: invokespecial 584	android/support/v4/app/z:C	()V
    //   43: iconst_1
    //   44: istore_1
    //   45: goto -38 -> 7
    //   48: astore_2
    //   49: aload_0
    //   50: invokespecial 584	android/support/v4/app/z:C	()V
    //   53: aload_2
    //   54: athrow
    //   55: aload_0
    //   56: invokevirtual 586	android/support/v4/app/z:p	()V
    //   59: aload_0
    //   60: invokespecial 588	android/support/v4/app/z:A	()V
    //   63: iload_1
    //   64: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	z
    //   6	58	1	bool	boolean
    //   48	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   27	39	48	finally
  }
  
  LayoutInflater.Factory2 r()
  {
    return this;
  }
  
  public l s()
  {
    return this.v;
  }
  
  public void t()
  {
    this.I = null;
    int i1 = 0;
    this.x = false;
    this.y = false;
    int i2 = this.j.size();
    while (i1 < i2)
    {
      l locall = (l)this.j.get(i1);
      if (locall != null) {
        locall.pb();
      }
      i1++;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    l locall = this.u;
    if (locall != null) {
      kd.a(locall, localStringBuilder);
    } else {
      kd.a(this.s, localStringBuilder);
    }
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  void u()
  {
    if (this.p != null) {
      for (int i1 = 0; i1 < this.p.size(); i1++) {
        ((s.c)this.p.get(i1)).onBackStackChanged();
      }
    }
  }
  
  A v()
  {
    a(this.I);
    return this.I;
  }
  
  Parcelable w()
  {
    E();
    D();
    q();
    this.x = true;
    Object localObject1 = null;
    this.I = null;
    Object localObject2 = this.k;
    if ((localObject2 != null) && (((SparseArray)localObject2).size() > 0))
    {
      int i1 = this.k.size();
      E[] arrayOfE = new E[i1];
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      while (i3 < i1)
      {
        localObject2 = (l)this.k.valueAt(i3);
        if (localObject2 != null) {
          if (((l)localObject2).g >= 0)
          {
            localObject3 = new E((l)localObject2);
            arrayOfE[i3] = localObject3;
            if ((((l)localObject2).c > 0) && (((E)localObject3).k == null))
            {
              ((E)localObject3).k = m((l)localObject2);
              localObject4 = ((l)localObject2).j;
              if (localObject4 != null) {
                if (((l)localObject4).g >= 0)
                {
                  if (((E)localObject3).k == null) {
                    ((E)localObject3).k = new Bundle();
                  }
                  a(((E)localObject3).k, "android:target_state", ((l)localObject2).j);
                  i4 = ((l)localObject2).l;
                  if (i4 != 0) {
                    ((E)localObject3).k.putInt("android:target_req_state", i4);
                  }
                }
                else
                {
                  localObject3 = new StringBuilder();
                  ((StringBuilder)localObject3).append("Failure saving state: ");
                  ((StringBuilder)localObject3).append(localObject2);
                  ((StringBuilder)localObject3).append(" has target not in fragment manager: ");
                  ((StringBuilder)localObject3).append(((l)localObject2).j);
                  a(new IllegalStateException(((StringBuilder)localObject3).toString()));
                  throw null;
                }
              }
            }
            else
            {
              ((E)localObject3).k = ((l)localObject2).d;
            }
            if (a)
            {
              localObject4 = new StringBuilder();
              ((StringBuilder)localObject4).append("Saved state of ");
              ((StringBuilder)localObject4).append(localObject2);
              ((StringBuilder)localObject4).append(": ");
              ((StringBuilder)localObject4).append(((E)localObject3).k);
              Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
            }
            i4 = 1;
          }
          else
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("Failure saving state: active ");
            ((StringBuilder)localObject3).append(localObject2);
            ((StringBuilder)localObject3).append(" has cleared index: ");
            ((StringBuilder)localObject3).append(((l)localObject2).g);
            a(new IllegalStateException(((StringBuilder)localObject3).toString()));
            throw null;
          }
        }
        i3++;
      }
      if (i4 == 0)
      {
        if (a) {
          Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return null;
      }
      i4 = this.j.size();
      if (i4 > 0)
      {
        localObject3 = new int[i4];
        for (i3 = 0;; i3++)
        {
          localObject2 = localObject3;
          if (i3 >= i4) {
            break label648;
          }
          localObject3[i3] = ((l)this.j.get(i3)).g;
          if (localObject3[i3] < 0) {
            break;
          }
          if (a)
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("saveAllState: adding fragment #");
            ((StringBuilder)localObject2).append(i3);
            ((StringBuilder)localObject2).append(": ");
            ((StringBuilder)localObject2).append(this.j.get(i3));
            Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
          }
        }
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Failure saving state: active ");
        ((StringBuilder)localObject2).append(this.j.get(i3));
        ((StringBuilder)localObject2).append(" has cleared index: ");
        ((StringBuilder)localObject2).append(localObject3[i3]);
        a(new IllegalStateException(((StringBuilder)localObject2).toString()));
        throw null;
      }
      localObject2 = null;
      label648:
      Object localObject4 = this.l;
      Object localObject3 = localObject1;
      if (localObject4 != null)
      {
        i4 = ((ArrayList)localObject4).size();
        localObject3 = localObject1;
        if (i4 > 0)
        {
          localObject1 = new f[i4];
          for (i3 = i2;; i3++)
          {
            localObject3 = localObject1;
            if (i3 >= i4) {
              break;
            }
            localObject1[i3] = new f((d)this.l.get(i3));
            if (a)
            {
              localObject3 = new StringBuilder();
              ((StringBuilder)localObject3).append("saveAllState: adding back stack #");
              ((StringBuilder)localObject3).append(i3);
              ((StringBuilder)localObject3).append(": ");
              ((StringBuilder)localObject3).append(this.l.get(i3));
              Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
            }
          }
        }
      }
      localObject1 = new C();
      ((C)localObject1).a = arrayOfE;
      ((C)localObject1).b = ((int[])localObject2);
      ((C)localObject1).c = ((f[])localObject3);
      localObject2 = this.v;
      if (localObject2 != null) {
        ((C)localObject1).d = ((l)localObject2).g;
      }
      ((C)localObject1).e = this.i;
      x();
      return (Parcelable)localObject1;
    }
    return null;
  }
  
  void x()
  {
    if (this.k != null)
    {
      localObject1 = null;
      Object localObject2 = localObject1;
      Object localObject3 = localObject2;
      int i1 = 0;
      for (;;)
      {
        localObject4 = localObject1;
        localObject5 = localObject2;
        localObject6 = localObject3;
        if (i1 >= this.k.size()) {
          break;
        }
        l locall = (l)this.k.valueAt(i1);
        localObject5 = localObject1;
        localObject4 = localObject2;
        Object localObject7 = localObject3;
        if (locall != null)
        {
          localObject6 = localObject1;
          int i2;
          if (locall.E)
          {
            localObject5 = localObject1;
            if (localObject1 == null) {
              localObject5 = new ArrayList();
            }
            ((ArrayList)localObject5).add(locall);
            localObject1 = locall.j;
            if (localObject1 != null) {
              i2 = ((l)localObject1).g;
            } else {
              i2 = -1;
            }
            locall.k = i2;
            localObject6 = localObject5;
            if (a)
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("retainNonConfig: keeping retained ");
              ((StringBuilder)localObject1).append(locall);
              Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
              localObject6 = localObject5;
            }
          }
          localObject1 = locall.v;
          if (localObject1 != null)
          {
            ((z)localObject1).x();
            localObject5 = locall.v.I;
          }
          else
          {
            localObject5 = locall.w;
          }
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = localObject2;
            if (localObject5 != null)
            {
              localObject2 = new ArrayList(this.k.size());
              for (i2 = 0;; i2++)
              {
                localObject1 = localObject2;
                if (i2 >= i1) {
                  break;
                }
                ((ArrayList)localObject2).add(null);
              }
            }
          }
          if (localObject1 != null) {
            ((ArrayList)localObject1).add(localObject5);
          }
          localObject2 = localObject3;
          if (localObject3 == null)
          {
            localObject2 = localObject3;
            if (locall.x != null)
            {
              localObject3 = new ArrayList(this.k.size());
              for (i2 = 0;; i2++)
              {
                localObject2 = localObject3;
                if (i2 >= i1) {
                  break;
                }
                ((ArrayList)localObject3).add(null);
              }
            }
          }
          localObject5 = localObject6;
          localObject4 = localObject1;
          localObject7 = localObject2;
          if (localObject2 != null)
          {
            ((ArrayList)localObject2).add(locall.x);
            localObject7 = localObject2;
            localObject4 = localObject1;
            localObject5 = localObject6;
          }
        }
        i1++;
        localObject1 = localObject5;
        localObject2 = localObject4;
        localObject3 = localObject7;
      }
    }
    Object localObject4 = null;
    Object localObject1 = localObject4;
    Object localObject6 = localObject1;
    Object localObject5 = localObject1;
    if ((localObject4 == null) && (localObject5 == null) && (localObject6 == null)) {
      this.I = null;
    } else {
      this.I = new A((List)localObject4, (List)localObject5, (List)localObject6);
    }
  }
  
  void y()
  {
    try
    {
      ArrayList localArrayList = this.H;
      int i1 = 0;
      int i2;
      if ((localArrayList != null) && (!this.H.isEmpty())) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      int i3 = i1;
      if (this.g != null)
      {
        i3 = i1;
        if (this.g.size() == 1) {
          i3 = 1;
        }
      }
      if ((i2 != 0) || (i3 != 0))
      {
        this.s.e().removeCallbacks(this.J);
        this.s.e().post(this.J);
      }
      return;
    }
    finally {}
  }
  
  void z()
  {
    if (this.k == null) {
      return;
    }
    for (int i1 = 0; i1 < this.k.size(); i1++)
    {
      l locall = (l)this.k.valueAt(i1);
      if (locall != null) {
        k(locall);
      }
    }
  }
  
  private static class a
    extends z.b
  {
    View b;
    
    a(View paramView, Animation.AnimationListener paramAnimationListener)
    {
      super();
      this.b = paramView;
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      if ((!android.support.v4.view.y.A(this.b)) && (Build.VERSION.SDK_INT < 24)) {
        this.b.setLayerType(0, null);
      } else {
        this.b.post(new y(this));
      }
      super.onAnimationEnd(paramAnimation);
    }
  }
  
  private static class b
    implements Animation.AnimationListener
  {
    private final Animation.AnimationListener a;
    
    b(Animation.AnimationListener paramAnimationListener)
    {
      this.a = paramAnimationListener;
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      Animation.AnimationListener localAnimationListener = this.a;
      if (localAnimationListener != null) {
        localAnimationListener.onAnimationEnd(paramAnimation);
      }
    }
    
    public void onAnimationRepeat(Animation paramAnimation)
    {
      Animation.AnimationListener localAnimationListener = this.a;
      if (localAnimationListener != null) {
        localAnimationListener.onAnimationRepeat(paramAnimation);
      }
    }
    
    public void onAnimationStart(Animation paramAnimation)
    {
      Animation.AnimationListener localAnimationListener = this.a;
      if (localAnimationListener != null) {
        localAnimationListener.onAnimationStart(paramAnimation);
      }
    }
  }
  
  private static class c
  {
    public final Animation a;
    public final Animator b;
    
    c(Animator paramAnimator)
    {
      this.a = null;
      this.b = paramAnimator;
      if (paramAnimator != null) {
        return;
      }
      throw new IllegalStateException("Animator cannot be null");
    }
    
    c(Animation paramAnimation)
    {
      this.a = paramAnimation;
      this.b = null;
      if (paramAnimation != null) {
        return;
      }
      throw new IllegalStateException("Animation cannot be null");
    }
  }
  
  private static class d
    extends AnimatorListenerAdapter
  {
    View a;
    
    d(View paramView)
    {
      this.a = paramView;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      this.a.setLayerType(0, null);
      paramAnimator.removeListener(this);
    }
    
    public void onAnimationStart(Animator paramAnimator)
    {
      this.a.setLayerType(2, null);
    }
  }
  
  private static class e
    extends AnimationSet
    implements Runnable
  {
    private final ViewGroup a;
    private final View b;
    private boolean c;
    private boolean d;
    private boolean e = true;
    
    e(Animation paramAnimation, ViewGroup paramViewGroup, View paramView)
    {
      super();
      this.a = paramViewGroup;
      this.b = paramView;
      addAnimation(paramAnimation);
      this.a.post(this);
    }
    
    public boolean getTransformation(long paramLong, Transformation paramTransformation)
    {
      this.e = true;
      if (this.c) {
        return this.d ^ true;
      }
      if (!super.getTransformation(paramLong, paramTransformation))
      {
        this.c = true;
        fa.a(this.a, this);
      }
      return true;
    }
    
    public boolean getTransformation(long paramLong, Transformation paramTransformation, float paramFloat)
    {
      this.e = true;
      if (this.c) {
        return this.d ^ true;
      }
      if (!super.getTransformation(paramLong, paramTransformation, paramFloat))
      {
        this.c = true;
        fa.a(this.a, this);
      }
      return true;
    }
    
    public void run()
    {
      if ((!this.c) && (this.e))
      {
        this.e = false;
        this.a.post(this);
      }
      else
      {
        this.a.endViewTransition(this.b);
        this.d = true;
      }
    }
  }
  
  private static final class f
  {
    final s.b a;
    final boolean b;
  }
  
  static class g
  {
    public static final int[] a = { 16842755, 16842960, 16842961 };
  }
  
  static abstract interface h
  {
    public abstract boolean a(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1);
  }
  
  private class i
    implements z.h
  {
    final String a;
    final int b;
    final int c;
    
    i(String paramString, int paramInt1, int paramInt2)
    {
      this.a = paramString;
      this.b = paramInt1;
      this.c = paramInt2;
    }
    
    public boolean a(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1)
    {
      Object localObject = z.this.v;
      if ((localObject != null) && (this.b < 0) && (this.a == null))
      {
        localObject = ((l)localObject).yb();
        if ((localObject != null) && (((s)localObject).f())) {
          return false;
        }
      }
      return z.this.a(paramArrayList, paramArrayList1, this.a, this.b, this.c);
    }
  }
  
  static class j
    implements l.c
  {
    final boolean a;
    final d b;
    private int c;
    
    j(d paramd, boolean paramBoolean)
    {
      this.a = paramBoolean;
      this.b = paramd;
    }
    
    public void a()
    {
      this.c += 1;
    }
    
    public void b()
    {
      this.c -= 1;
      if (this.c != 0) {
        return;
      }
      this.b.a.y();
    }
    
    public void c()
    {
      d locald = this.b;
      locald.a.a(locald, this.a, false, false);
    }
    
    public void d()
    {
      int i = this.c;
      int j = 0;
      if (i > 0) {
        i = 1;
      } else {
        i = 0;
      }
      z localz = this.b.a;
      int k = localz.j.size();
      while (j < k)
      {
        localObject = (l)localz.j.get(j);
        ((l)localObject).a(null);
        if ((i != 0) && (((l)localObject).lb())) {
          ((l)localObject).Kb();
        }
        j++;
      }
      Object localObject = this.b;
      ((d)localObject).a.a((d)localObject, this.a, i ^ 0x1, true);
    }
    
    public boolean e()
    {
      boolean bool;
      if (this.c == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */