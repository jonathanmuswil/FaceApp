package android.support.design.widget;

import Y;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.c;
import android.support.v4.view.y;
import android.support.v4.widget.H;
import android.support.v4.widget.H.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import fa;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View>
  extends CoordinatorLayout.b<V>
{
  private boolean a = true;
  private float b;
  private int c;
  private boolean d;
  private int e;
  private int f;
  int g;
  int h;
  int i;
  boolean j;
  private boolean k;
  int l = 4;
  H m;
  private boolean n;
  private int o;
  private boolean p;
  int q;
  WeakReference<V> r;
  WeakReference<View> s;
  private a t;
  private VelocityTracker u;
  int v;
  private int w;
  boolean x;
  private Map<View, Integer> y;
  private final H.a z = new j(this);
  
  public BottomSheetBehavior() {}
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, fa.BottomSheetBehavior_Layout);
    TypedValue localTypedValue = paramAttributeSet.peekValue(fa.BottomSheetBehavior_Layout_behavior_peekHeight);
    if (localTypedValue != null)
    {
      int i1 = localTypedValue.data;
      if (i1 == -1)
      {
        b(i1);
        break label82;
      }
    }
    b(paramAttributeSet.getDimensionPixelSize(fa.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
    label82:
    b(paramAttributeSet.getBoolean(fa.BottomSheetBehavior_Layout_behavior_hideable, false));
    a(paramAttributeSet.getBoolean(fa.BottomSheetBehavior_Layout_behavior_fitToContents, true));
    c(paramAttributeSet.getBoolean(fa.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
    paramAttributeSet.recycle();
    this.b = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
  }
  
  public static <V extends View> BottomSheetBehavior<V> b(V paramV)
  {
    paramV = paramV.getLayoutParams();
    if ((paramV instanceof CoordinatorLayout.e))
    {
      paramV = ((CoordinatorLayout.e)paramV).d();
      if ((paramV instanceof BottomSheetBehavior)) {
        return (BottomSheetBehavior)paramV;
      }
      throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
  }
  
  private void c()
  {
    if (this.a) {
      this.i = Math.max(this.q - this.f, this.g);
    } else {
      this.i = (this.q - this.f);
    }
  }
  
  private int d()
  {
    int i1;
    if (this.a) {
      i1 = this.g;
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  private void d(boolean paramBoolean)
  {
    Object localObject = this.r;
    if (localObject == null) {
      return;
    }
    localObject = ((View)((WeakReference)localObject).get()).getParent();
    if (!(localObject instanceof CoordinatorLayout)) {
      return;
    }
    CoordinatorLayout localCoordinatorLayout = (CoordinatorLayout)localObject;
    int i1 = localCoordinatorLayout.getChildCount();
    if ((Build.VERSION.SDK_INT >= 16) && (paramBoolean)) {
      if (this.y == null) {
        this.y = new HashMap(i1);
      } else {
        return;
      }
    }
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = localCoordinatorLayout.getChildAt(i2);
      if (localView != this.r.get()) {
        if (!paramBoolean)
        {
          localObject = this.y;
          if ((localObject != null) && (((Map)localObject).containsKey(localView))) {
            y.d(localView, ((Integer)this.y.get(localView)).intValue());
          }
        }
        else
        {
          if (Build.VERSION.SDK_INT >= 16) {
            this.y.put(localView, Integer.valueOf(localView.getImportantForAccessibility()));
          }
          y.d(localView, 4);
        }
      }
    }
    if (!paramBoolean) {
      this.y = null;
    }
  }
  
  private float e()
  {
    VelocityTracker localVelocityTracker = this.u;
    if (localVelocityTracker == null) {
      return 0.0F;
    }
    localVelocityTracker.computeCurrentVelocity(1000, this.b);
    return this.u.getYVelocity(this.v);
  }
  
  private void f()
  {
    this.v = -1;
    VelocityTracker localVelocityTracker = this.u;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      this.u = null;
    }
  }
  
  View a(View paramView)
  {
    if (y.C(paramView)) {
      return paramView;
    }
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i1 = 0;
      int i2 = localViewGroup.getChildCount();
      while (i1 < i2)
      {
        paramView = a(localViewGroup.getChildAt(i1));
        if (paramView != null) {
          return paramView;
        }
        i1++;
      }
    }
    return null;
  }
  
  void a(int paramInt)
  {
    View localView = (View)this.r.get();
    if (localView != null)
    {
      a locala = this.t;
      if (locala != null)
      {
        int i1 = this.i;
        if (paramInt > i1) {
          locala.a(localView, (i1 - paramInt) / (this.q - i1));
        } else {
          locala.a(localView, (i1 - paramInt) / (i1 - d()));
        }
      }
    }
  }
  
  public void a(a parama)
  {
    this.t = parama;
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable)
  {
    paramParcelable = (b)paramParcelable;
    super.a(paramCoordinatorLayout, paramV, paramParcelable.l());
    int i1 = paramParcelable.c;
    if ((i1 != 1) && (i1 != 2)) {
      this.l = i1;
    } else {
      this.l = 4;
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt)
  {
    paramInt = paramV.getTop();
    int i1 = d();
    int i2 = 3;
    if (paramInt == i1)
    {
      d(3);
      return;
    }
    if ((paramView == this.s.get()) && (this.p))
    {
      if (this.o > 0)
      {
        paramInt = d();
      }
      else if ((this.j) && (a(paramV, e())))
      {
        paramInt = this.q;
        i2 = 5;
      }
      else
      {
        if (this.o == 0)
        {
          paramInt = paramV.getTop();
          if (this.a)
          {
            if (Math.abs(paramInt - this.g) < Math.abs(paramInt - this.i))
            {
              paramInt = this.g;
              break label252;
            }
            paramInt = this.i;
          }
          else
          {
            i1 = this.h;
            if (paramInt < i1)
            {
              if (paramInt < Math.abs(paramInt - this.i))
              {
                paramInt = 0;
                break label252;
              }
              paramInt = this.h;
            }
            else
            {
              if (Math.abs(paramInt - i1) >= Math.abs(paramInt - this.i)) {
                break label234;
              }
              paramInt = this.h;
            }
            i2 = 6;
            break label252;
            label234:
            paramInt = this.i;
          }
        }
        else
        {
          paramInt = this.i;
        }
        i2 = 4;
      }
      label252:
      if (this.m.b(paramV, paramV.getLeft(), paramInt))
      {
        d(2);
        y.a(paramV, new c(paramV, i2));
      }
      else
      {
        d(i2);
      }
      this.p = false;
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if (paramInt3 == 1) {
      return;
    }
    if (paramView != (View)this.s.get()) {
      return;
    }
    int i1 = paramV.getTop();
    paramInt3 = i1 - paramInt2;
    if (paramInt2 > 0)
    {
      if (paramInt3 < d())
      {
        paramArrayOfInt[1] = (i1 - d());
        y.b(paramV, -paramArrayOfInt[1]);
        d(3);
      }
      else
      {
        paramArrayOfInt[1] = paramInt2;
        y.b(paramV, -paramInt2);
        d(1);
      }
    }
    else if ((paramInt2 < 0) && (!paramView.canScrollVertically(-1)))
    {
      paramInt1 = this.i;
      if ((paramInt3 > paramInt1) && (!this.j))
      {
        paramArrayOfInt[1] = (i1 - paramInt1);
        y.b(paramV, -paramArrayOfInt[1]);
        d(4);
      }
      else
      {
        paramArrayOfInt[1] = paramInt2;
        y.b(paramV, -paramInt2);
        d(1);
      }
    }
    a(paramV.getTop());
    this.o = paramInt2;
    this.p = true;
  }
  
  void a(View paramView, int paramInt)
  {
    int i1;
    if (paramInt == 4)
    {
      i1 = this.i;
    }
    else if (paramInt == 6)
    {
      int i2 = this.h;
      if (this.a)
      {
        i1 = this.g;
        if (i2 <= i1)
        {
          paramInt = 3;
          break label84;
        }
      }
      i1 = i2;
    }
    else if (paramInt == 3)
    {
      i1 = d();
    }
    else
    {
      if ((!this.j) || (paramInt != 5)) {
        break label128;
      }
      i1 = this.q;
    }
    label84:
    if (this.m.b(paramView, paramView.getLeft(), i1))
    {
      d(2);
      y.a(paramView, new c(paramView, paramInt));
    }
    else
    {
      d(paramInt);
    }
    return;
    label128:
    paramView = new StringBuilder();
    paramView.append("Illegal state argument: ");
    paramView.append(paramInt);
    throw new IllegalArgumentException(paramView.toString());
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.a == paramBoolean) {
      return;
    }
    this.a = paramBoolean;
    if (this.r != null) {
      c();
    }
    int i1;
    if ((this.a) && (this.l == 6)) {
      i1 = 3;
    } else {
      i1 = this.l;
    }
    d(i1);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    if ((y.i(paramCoordinatorLayout)) && (!y.i(paramV))) {
      paramV.setFitsSystemWindows(true);
    }
    int i1 = paramV.getTop();
    paramCoordinatorLayout.c(paramV, paramInt);
    this.q = paramCoordinatorLayout.getHeight();
    if (this.d)
    {
      if (this.e == 0) {
        this.e = paramCoordinatorLayout.getResources().getDimensionPixelSize(Y.design_bottom_sheet_peek_height_min);
      }
      this.f = Math.max(this.e, this.q - paramCoordinatorLayout.getWidth() * 9 / 16);
    }
    else
    {
      this.f = this.c;
    }
    this.g = Math.max(0, this.q - paramV.getHeight());
    this.h = (this.q / 2);
    c();
    paramInt = this.l;
    if (paramInt == 3)
    {
      y.b(paramV, d());
    }
    else if (paramInt == 6)
    {
      y.b(paramV, this.h);
    }
    else if ((this.j) && (paramInt == 5))
    {
      y.b(paramV, this.q);
    }
    else
    {
      paramInt = this.l;
      if (paramInt == 4) {
        y.b(paramV, this.i);
      } else if ((paramInt == 1) || (paramInt == 2)) {
        y.b(paramV, i1 - paramV.getTop());
      }
    }
    if (this.m == null) {
      this.m = H.a(paramCoordinatorLayout, this.z);
    }
    this.r = new WeakReference(paramV);
    this.s = new WeakReference(a(paramV));
    return true;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool1 = paramV.isShown();
    boolean bool2 = false;
    if (!bool1)
    {
      this.n = true;
      return false;
    }
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 == 0) {
      f();
    }
    if (this.u == null) {
      this.u = VelocityTracker.obtain();
    }
    this.u.addMovement(paramMotionEvent);
    Object localObject1 = null;
    if (i1 != 0)
    {
      if ((i1 == 1) || (i1 == 3))
      {
        this.x = false;
        this.v = -1;
        if (this.n)
        {
          this.n = false;
          return false;
        }
      }
    }
    else
    {
      int i2 = (int)paramMotionEvent.getX();
      this.w = ((int)paramMotionEvent.getY());
      localObject2 = this.s;
      if (localObject2 != null) {
        localObject2 = (View)((WeakReference)localObject2).get();
      } else {
        localObject2 = null;
      }
      if ((localObject2 != null) && (paramCoordinatorLayout.a((View)localObject2, i2, this.w)))
      {
        this.v = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
        this.x = true;
      }
      if ((this.v == -1) && (!paramCoordinatorLayout.a(paramV, i2, this.w))) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      this.n = bool1;
    }
    if (!this.n)
    {
      paramV = this.m;
      if ((paramV != null) && (paramV.b(paramMotionEvent))) {
        return true;
      }
    }
    Object localObject2 = this.s;
    paramV = (V)localObject1;
    if (localObject2 != null) {
      paramV = (View)((WeakReference)localObject2).get();
    }
    bool1 = bool2;
    if (i1 == 2)
    {
      bool1 = bool2;
      if (paramV != null)
      {
        bool1 = bool2;
        if (!this.n)
        {
          bool1 = bool2;
          if (this.l != 1)
          {
            bool1 = bool2;
            if (!paramCoordinatorLayout.a(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
            {
              bool1 = bool2;
              if (this.m != null)
              {
                bool1 = bool2;
                if (Math.abs(this.w - paramMotionEvent.getY()) > this.m.d()) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool;
    if ((paramView == this.s.get()) && ((this.l != 3) || (super.a(paramCoordinatorLayout, paramV, paramView, paramFloat1, paramFloat2)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  boolean a(View paramView, float paramFloat)
  {
    boolean bool1 = this.k;
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    if (paramView.getTop() < this.i) {
      return false;
    }
    if (Math.abs(paramView.getTop() + paramFloat * 0.1F - this.i) / this.c <= 0.5F) {
      bool2 = false;
    }
    return bool2;
  }
  
  public final int b()
  {
    return this.l;
  }
  
  public final void b(int paramInt)
  {
    int i1 = 1;
    if (paramInt == -1)
    {
      if (!this.d)
      {
        this.d = true;
        paramInt = i1;
        break label73;
      }
    }
    else {
      if ((this.d) || (this.c != paramInt)) {
        break label47;
      }
    }
    paramInt = 0;
    break label73;
    label47:
    this.d = false;
    this.c = Math.max(0, paramInt);
    this.i = (this.q - paramInt);
    paramInt = i1;
    label73:
    if ((paramInt != 0) && (this.l == 4))
    {
      Object localObject = this.r;
      if (localObject != null)
      {
        localObject = (View)((WeakReference)localObject).get();
        if (localObject != null) {
          ((View)localObject).requestLayout();
        }
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (!paramV.isShown()) {
      return false;
    }
    int i1 = paramMotionEvent.getActionMasked();
    if ((this.l == 1) && (i1 == 0)) {
      return true;
    }
    paramCoordinatorLayout = this.m;
    if (paramCoordinatorLayout != null) {
      paramCoordinatorLayout.a(paramMotionEvent);
    }
    if (i1 == 0) {
      f();
    }
    if (this.u == null) {
      this.u = VelocityTracker.obtain();
    }
    this.u.addMovement(paramMotionEvent);
    if ((i1 == 2) && (!this.n) && (Math.abs(this.w - paramMotionEvent.getY()) > this.m.d())) {
      this.m.a(paramV, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
    }
    return this.n ^ true;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    this.o = 0;
    this.p = false;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    }
    return bool;
  }
  
  public final void c(int paramInt)
  {
    if (paramInt == this.l) {
      return;
    }
    Object localObject = this.r;
    if (localObject == null)
    {
      if ((paramInt == 4) || (paramInt == 3) || (paramInt == 6) || ((this.j) && (paramInt == 5))) {
        this.l = paramInt;
      }
      return;
    }
    localObject = (View)((WeakReference)localObject).get();
    if (localObject == null) {
      return;
    }
    ViewParent localViewParent = ((View)localObject).getParent();
    if ((localViewParent != null) && (localViewParent.isLayoutRequested()) && (y.A((View)localObject))) {
      ((View)localObject).post(new i(this, (View)localObject, paramInt));
    } else {
      a((View)localObject, paramInt);
    }
  }
  
  public void c(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public Parcelable d(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    return new b(super.d(paramCoordinatorLayout, paramV), this.l);
  }
  
  void d(int paramInt)
  {
    if (this.l == paramInt) {
      return;
    }
    this.l = paramInt;
    if ((paramInt != 6) && (paramInt != 3))
    {
      if ((paramInt == 5) || (paramInt == 4)) {
        d(false);
      }
    }
    else {
      d(true);
    }
    View localView = (View)this.r.get();
    if (localView != null)
    {
      a locala = this.t;
      if (locala != null) {
        locala.a(localView, paramInt);
      }
    }
  }
  
  public static abstract class a
  {
    public abstract void a(View paramView, float paramFloat);
    
    public abstract void a(View paramView, int paramInt);
  }
  
  protected static class b
    extends c
  {
    public static final Parcelable.Creator<b> CREATOR = new k();
    final int c;
    
    public b(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.c = paramParcel.readInt();
    }
    
    public b(Parcelable paramParcelable, int paramInt)
    {
      super();
      this.c = paramInt;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.c);
    }
  }
  
  private class c
    implements Runnable
  {
    private final View a;
    private final int b;
    
    c(View paramView, int paramInt)
    {
      this.a = paramView;
      this.b = paramInt;
    }
    
    public void run()
    {
      H localH = BottomSheetBehavior.this.m;
      if ((localH != null) && (localH.a(true))) {
        y.a(this.a, this);
      } else {
        BottomSheetBehavior.this.d(this.b);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/BottomSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */