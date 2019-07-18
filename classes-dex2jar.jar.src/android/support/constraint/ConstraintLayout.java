package android.support.constraint;

import B;
import B.a;
import C;
import F;
import J;
import K;
import L;
import N;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.HashMap;
import q;
import u;
import z;
import z.b;
import z.c;

public class ConstraintLayout
  extends ViewGroup
{
  SparseArray<View> a = new SparseArray();
  private ArrayList<a> b = new ArrayList(4);
  private final ArrayList<B> c = new ArrayList(100);
  C d = new C();
  private int e = 0;
  private int f = 0;
  private int g = Integer.MAX_VALUE;
  private int h = Integer.MAX_VALUE;
  private boolean i = true;
  private int j = 7;
  private c k = null;
  private int l = -1;
  private HashMap<String, Integer> m = new HashMap();
  private int n = -1;
  private int o = -1;
  int p = -1;
  int q = -1;
  int r = 0;
  int s = 0;
  private q t;
  
  public ConstraintLayout(Context paramContext)
  {
    super(paramContext);
    a(null);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }
  
  private void a()
  {
    boolean bool = isInEditMode();
    int i1 = getChildCount();
    int i2 = 0;
    if (bool)
    {
      i3 = 0;
      while (i3 < i1)
      {
        Object localObject1 = getChildAt(i3);
        try
        {
          localObject2 = getResources().getResourceName(((View)localObject1).getId());
          a(0, localObject2, Integer.valueOf(((View)localObject1).getId()));
          i4 = ((String)localObject2).indexOf('/');
          localObject3 = localObject2;
          if (i4 != -1) {
            localObject3 = ((String)localObject2).substring(i4 + 1);
          }
          c(((View)localObject1).getId()).a((String)localObject3);
          i3++;
        }
        catch (Resources.NotFoundException localNotFoundException1)
        {
          Object localObject2;
          int i4;
          Object localObject3;
          int i5;
          for (;;) {}
        }
      }
    }
    for (int i3 = 0; i3 < i1; i3++)
    {
      localObject3 = a(getChildAt(i3));
      if (localObject3 != null) {
        ((B)localObject3).D();
      }
    }
    if (this.l != -1) {
      for (i3 = 0; i3 < i1; i3++)
      {
        localObject3 = getChildAt(i3);
        if ((((View)localObject3).getId() == this.l) && ((localObject3 instanceof d))) {
          this.k = ((d)localObject3).getConstraintSet();
        }
      }
    }
    localObject3 = this.k;
    if (localObject3 != null) {
      ((c)localObject3).b(this);
    }
    this.d.L();
    i4 = this.b.size();
    if (i4 > 0) {
      for (i3 = 0; i3 < i4; i3++) {
        ((a)this.b.get(i3)).c(this);
      }
    }
    for (i3 = 0; i3 < i1; i3++)
    {
      localObject3 = getChildAt(i3);
      if ((localObject3 instanceof e)) {
        ((e)localObject3).b(this);
      }
    }
    i5 = 0;
    for (i3 = i2; i5 < i1; i3 = i4)
    {
      localObject1 = getChildAt(i5);
      localObject2 = a((View)localObject1);
      if (localObject2 == null)
      {
        i4 = i3;
      }
      else
      {
        localObject3 = (a)((View)localObject1).getLayoutParams();
        ((a)localObject3).a();
        if (((a)localObject3).ma) {
          ((a)localObject3).ma = i3;
        } else if (bool) {
          try
          {
            String str = getResources().getResourceName(((View)localObject1).getId());
            a(i3, str, Integer.valueOf(((View)localObject1).getId()));
            str = str.substring(str.indexOf("id/") + 3);
            c(((View)localObject1).getId()).a(str);
          }
          catch (Resources.NotFoundException localNotFoundException2) {}
        }
        ((B)localObject2).n(((View)localObject1).getVisibility());
        if (((a)localObject3).aa) {
          ((B)localObject2).n(8);
        }
        ((B)localObject2).a(localObject1);
        this.d.b((B)localObject2);
        if ((!((a)localObject3).W) || (!((a)localObject3).V)) {
          this.c.add(localObject2);
        }
        float f1;
        if (((a)localObject3).Y)
        {
          localObject2 = (F)localObject2;
          i4 = ((a)localObject3).ia;
          i2 = ((a)localObject3).ja;
          f1 = ((a)localObject3).ka;
          if (Build.VERSION.SDK_INT < 17)
          {
            i4 = ((a)localObject3).a;
            i2 = ((a)localObject3).b;
            f1 = ((a)localObject3).c;
          }
          if (f1 != -1.0F)
          {
            ((F)localObject2).e(f1);
            i4 = i3;
          }
          else if (i4 != -1)
          {
            ((F)localObject2).t(i4);
            i4 = i3;
          }
          else
          {
            i4 = i3;
            if (i2 != -1)
            {
              ((F)localObject2).u(i2);
              i4 = i3;
            }
          }
        }
        else if ((((a)localObject3).d == -1) && (((a)localObject3).e == -1) && (((a)localObject3).f == -1) && (((a)localObject3).g == -1) && (((a)localObject3).q == -1) && (((a)localObject3).p == -1) && (((a)localObject3).r == -1) && (((a)localObject3).s == -1) && (((a)localObject3).h == -1) && (((a)localObject3).i == -1) && (((a)localObject3).j == -1) && (((a)localObject3).k == -1) && (((a)localObject3).l == -1) && (((a)localObject3).Q == -1) && (((a)localObject3).R == -1) && (((a)localObject3).m == -1) && (((ViewGroup.MarginLayoutParams)localObject3).width != -1))
        {
          i4 = i3;
          if (((ViewGroup.MarginLayoutParams)localObject3).height != -1) {}
        }
        else
        {
          int i6 = ((a)localObject3).ba;
          int i7 = ((a)localObject3).ca;
          i4 = ((a)localObject3).da;
          int i8 = ((a)localObject3).ea;
          i3 = ((a)localObject3).fa;
          i2 = ((a)localObject3).ga;
          f1 = ((a)localObject3).ha;
          if (Build.VERSION.SDK_INT < 17)
          {
            i2 = ((a)localObject3).d;
            i3 = ((a)localObject3).e;
            i7 = ((a)localObject3).f;
            i8 = ((a)localObject3).g;
            i6 = ((a)localObject3).t;
            i4 = ((a)localObject3).v;
            f1 = ((a)localObject3).z;
            if ((i2 == -1) && (i3 == -1))
            {
              i9 = ((a)localObject3).q;
              if (i9 != -1)
              {
                i2 = i9;
              }
              else
              {
                i9 = ((a)localObject3).p;
                if (i9 != -1) {
                  i3 = i9;
                }
              }
            }
            if ((i7 == -1) && (i8 == -1))
            {
              int i10 = ((a)localObject3).r;
              if (i10 != -1)
              {
                i11 = i6;
                i9 = i4;
                i4 = i10;
                i6 = i2;
                i7 = i3;
                i3 = i11;
                i2 = i9;
                break label1089;
              }
              i9 = ((a)localObject3).s;
              if (i9 != -1)
              {
                i11 = i6;
                i8 = i4;
                break label1111;
              }
            }
            i9 = i6;
            i11 = i4;
            i4 = i7;
            i6 = i2;
            i7 = i3;
            i3 = i9;
            i2 = i11;
          }
          label1089:
          int i9 = i8;
          i8 = i2;
          int i11 = i3;
          i3 = i7;
          i2 = i6;
          i7 = i4;
          label1111:
          i4 = ((a)localObject3).m;
          if (i4 != -1)
          {
            localObject1 = c(i4);
            if (localObject1 != null) {
              ((B)localObject2).a((B)localObject1, ((a)localObject3).o, ((a)localObject3).n);
            }
          }
          else
          {
            Object localObject4;
            if (i2 != -1)
            {
              localObject1 = c(i2);
              if (localObject1 != null)
              {
                localObject4 = z.c.b;
                ((B)localObject2).a((z.c)localObject4, (B)localObject1, (z.c)localObject4, ((ViewGroup.MarginLayoutParams)localObject3).leftMargin, i11);
              }
            }
            else if (i3 != -1)
            {
              localObject1 = c(i3);
              if (localObject1 != null) {
                ((B)localObject2).a(z.c.b, (B)localObject1, z.c.d, ((ViewGroup.MarginLayoutParams)localObject3).leftMargin, i11);
              }
            }
            if (i7 != -1)
            {
              localObject1 = c(i7);
              if (localObject1 != null) {
                ((B)localObject2).a(z.c.d, (B)localObject1, z.c.b, ((ViewGroup.MarginLayoutParams)localObject3).rightMargin, i8);
              }
            }
            else if (i9 != -1)
            {
              localObject1 = c(i9);
              if (localObject1 != null)
              {
                localObject4 = z.c.d;
                ((B)localObject2).a((z.c)localObject4, (B)localObject1, (z.c)localObject4, ((ViewGroup.MarginLayoutParams)localObject3).rightMargin, i8);
              }
            }
            i3 = ((a)localObject3).h;
            if (i3 != -1)
            {
              localObject4 = c(i3);
              if (localObject4 != null)
              {
                localObject1 = z.c.c;
                ((B)localObject2).a((z.c)localObject1, (B)localObject4, (z.c)localObject1, ((ViewGroup.MarginLayoutParams)localObject3).topMargin, ((a)localObject3).u);
              }
            }
            else
            {
              i3 = ((a)localObject3).i;
              if (i3 != -1)
              {
                localObject1 = c(i3);
                if (localObject1 != null) {
                  ((B)localObject2).a(z.c.c, (B)localObject1, z.c.e, ((ViewGroup.MarginLayoutParams)localObject3).topMargin, ((a)localObject3).u);
                }
              }
            }
            i3 = ((a)localObject3).j;
            if (i3 != -1)
            {
              localObject1 = c(i3);
              if (localObject1 != null) {
                ((B)localObject2).a(z.c.e, (B)localObject1, z.c.c, ((ViewGroup.MarginLayoutParams)localObject3).bottomMargin, ((a)localObject3).w);
              }
            }
            else
            {
              i3 = ((a)localObject3).k;
              if (i3 != -1)
              {
                localObject1 = c(i3);
                if (localObject1 != null)
                {
                  localObject4 = z.c.e;
                  ((B)localObject2).a((z.c)localObject4, (B)localObject1, (z.c)localObject4, ((ViewGroup.MarginLayoutParams)localObject3).bottomMargin, ((a)localObject3).w);
                }
              }
            }
            i3 = ((a)localObject3).l;
            if (i3 != -1)
            {
              localObject4 = (View)this.a.get(i3);
              localObject1 = c(((a)localObject3).l);
              if ((localObject1 != null) && (localObject4 != null) && ((((View)localObject4).getLayoutParams() instanceof a)))
              {
                localObject4 = (a)((View)localObject4).getLayoutParams();
                ((a)localObject3).X = true;
                ((a)localObject4).X = true;
                ((B)localObject2).a(z.c.f).a(((B)localObject1).a(z.c.f), 0, -1, z.b.b, 0, true);
                ((B)localObject2).a(z.c.c).j();
                ((B)localObject2).a(z.c.e).j();
              }
            }
            if ((f1 >= 0.0F) && (f1 != 0.5F)) {
              ((B)localObject2).a(f1);
            }
            f1 = ((a)localObject3).A;
            if ((f1 >= 0.0F) && (f1 != 0.5F)) {
              ((B)localObject2).c(f1);
            }
          }
          if ((bool) && ((((a)localObject3).Q != -1) || (((a)localObject3).R != -1))) {
            ((B)localObject2).c(((a)localObject3).Q, ((a)localObject3).R);
          }
          if (!((a)localObject3).V)
          {
            if (((ViewGroup.MarginLayoutParams)localObject3).width == -1)
            {
              ((B)localObject2).a(B.a.d);
              ((B)localObject2).a(z.c.b).e = ((ViewGroup.MarginLayoutParams)localObject3).leftMargin;
              ((B)localObject2).a(z.c.d).e = ((ViewGroup.MarginLayoutParams)localObject3).rightMargin;
            }
            else
            {
              ((B)localObject2).a(B.a.c);
              ((B)localObject2).o(0);
            }
          }
          else
          {
            ((B)localObject2).a(B.a.a);
            ((B)localObject2).o(((ViewGroup.MarginLayoutParams)localObject3).width);
          }
          if (!((a)localObject3).W)
          {
            if (((ViewGroup.MarginLayoutParams)localObject3).height == -1)
            {
              ((B)localObject2).b(B.a.d);
              ((B)localObject2).a(z.c.c).e = ((ViewGroup.MarginLayoutParams)localObject3).topMargin;
              ((B)localObject2).a(z.c.e).e = ((ViewGroup.MarginLayoutParams)localObject3).bottomMargin;
            }
            else
            {
              ((B)localObject2).b(B.a.c);
              ((B)localObject2).g(0);
            }
          }
          else
          {
            ((B)localObject2).b(B.a.a);
            ((B)localObject2).g(((ViewGroup.MarginLayoutParams)localObject3).height);
          }
          i4 = 0;
          localObject1 = ((a)localObject3).B;
          if (localObject1 != null) {
            ((B)localObject2).b((String)localObject1);
          }
          ((B)localObject2).b(((a)localObject3).E);
          ((B)localObject2).d(((a)localObject3).F);
          ((B)localObject2).h(((a)localObject3).G);
          ((B)localObject2).m(((a)localObject3).H);
          ((B)localObject2).a(((a)localObject3).I, ((a)localObject3).K, ((a)localObject3).M, ((a)localObject3).O);
          ((B)localObject2).b(((a)localObject3).J, ((a)localObject3).L, ((a)localObject3).N, ((a)localObject3).P);
        }
      }
      i5++;
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = getPaddingTop() + getPaddingBottom();
    int i2 = getPaddingLeft() + getPaddingRight();
    int i3 = getChildCount();
    for (int i4 = 0; i4 < i3; i4++)
    {
      View localView = getChildAt(i4);
      if (localView.getVisibility() != 8)
      {
        a locala = (a)localView.getLayoutParams();
        B localB = locala.la;
        if ((!locala.Y) && (!locala.Z))
        {
          localB.n(localView.getVisibility());
          int i5 = locala.width;
          int i6 = locala.height;
          boolean bool = locala.V;
          int i7;
          if ((!bool) && (!locala.W) && ((bool) || (locala.I != 1)) && (locala.width != -1) && ((locala.W) || ((locala.J != 1) && (locala.height != -1)))) {
            i7 = 0;
          } else {
            i7 = 1;
          }
          int i8;
          int i9;
          int i10;
          if (i7 != 0)
          {
            if (i5 == 0)
            {
              i8 = ViewGroup.getChildMeasureSpec(paramInt1, i2, -2);
              i7 = 1;
            }
            else if (i5 == -1)
            {
              i8 = ViewGroup.getChildMeasureSpec(paramInt1, i2, -1);
              i7 = 0;
            }
            else
            {
              if (i5 == -2) {
                i7 = 1;
              } else {
                i7 = 0;
              }
              i8 = ViewGroup.getChildMeasureSpec(paramInt1, i2, i5);
            }
            if (i6 == 0)
            {
              i9 = ViewGroup.getChildMeasureSpec(paramInt2, i1, -2);
              i10 = 1;
            }
            else if (i6 == -1)
            {
              i9 = ViewGroup.getChildMeasureSpec(paramInt2, i1, -1);
              i10 = 0;
            }
            else
            {
              if (i6 == -2) {
                i10 = 1;
              } else {
                i10 = 0;
              }
              i9 = ViewGroup.getChildMeasureSpec(paramInt2, i1, i6);
            }
            localView.measure(i8, i9);
            q localq = this.t;
            if (localq != null) {
              localq.a += 1L;
            }
            if (i5 == -2) {
              bool = true;
            } else {
              bool = false;
            }
            localB.b(bool);
            if (i6 == -2) {
              bool = true;
            } else {
              bool = false;
            }
            localB.a(bool);
            i9 = localView.getMeasuredWidth();
            i8 = localView.getMeasuredHeight();
          }
          else
          {
            i7 = 0;
            i10 = 0;
            i8 = i6;
            i9 = i5;
          }
          localB.o(i9);
          localB.g(i8);
          if (i7 != 0) {
            localB.q(i9);
          }
          if (i10 != 0) {
            localB.p(i8);
          }
          if (locala.X)
          {
            i7 = localView.getBaseline();
            if (i7 != -1) {
              localB.f(i7);
            }
          }
        }
      }
    }
  }
  
  private void a(AttributeSet paramAttributeSet)
  {
    this.d.a(this);
    this.a.put(getId(), this);
    this.k = null;
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, g.ConstraintLayout_Layout);
      int i1 = paramAttributeSet.getIndexCount();
      for (int i2 = 0; i2 < i1; i2++)
      {
        int i3 = paramAttributeSet.getIndex(i2);
        if (i3 == g.ConstraintLayout_Layout_android_minWidth)
        {
          this.e = paramAttributeSet.getDimensionPixelOffset(i3, this.e);
        }
        else if (i3 == g.ConstraintLayout_Layout_android_minHeight)
        {
          this.f = paramAttributeSet.getDimensionPixelOffset(i3, this.f);
        }
        else if (i3 == g.ConstraintLayout_Layout_android_maxWidth)
        {
          this.g = paramAttributeSet.getDimensionPixelOffset(i3, this.g);
        }
        else if (i3 == g.ConstraintLayout_Layout_android_maxHeight)
        {
          this.h = paramAttributeSet.getDimensionPixelOffset(i3, this.h);
        }
        else if (i3 == g.ConstraintLayout_Layout_layout_optimizationLevel)
        {
          this.j = paramAttributeSet.getInt(i3, this.j);
        }
        else if (i3 == g.ConstraintLayout_Layout_constraintSet)
        {
          i3 = paramAttributeSet.getResourceId(i3, 0);
          try
          {
            c localc = new android/support/constraint/c;
            localc.<init>();
            this.k = localc;
            this.k.b(getContext(), i3);
          }
          catch (Resources.NotFoundException localNotFoundException)
          {
            this.k = null;
          }
          this.l = i3;
        }
      }
      paramAttributeSet.recycle();
    }
    this.d.u(this.j);
  }
  
  private void b()
  {
    int i1 = getChildCount();
    int i2 = 0;
    int i4;
    for (int i3 = 0;; i3++)
    {
      i4 = i2;
      if (i3 >= i1) {
        break;
      }
      if (getChildAt(i3).isLayoutRequested())
      {
        i4 = 1;
        break;
      }
    }
    if (i4 != 0)
    {
      this.c.clear();
      a();
    }
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    Object localObject1 = this;
    int i1 = getPaddingTop() + getPaddingBottom();
    int i2 = getPaddingLeft() + getPaddingRight();
    int i3 = getChildCount();
    long l1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    Object localObject5;
    boolean bool;
    for (int i4 = 0;; i4++)
    {
      l1 = 1L;
      if (i4 >= i3) {
        break;
      }
      localObject2 = ((ViewGroup)localObject1).getChildAt(i4);
      if (((View)localObject2).getVisibility() != 8)
      {
        localObject3 = (a)((View)localObject2).getLayoutParams();
        localObject4 = ((a)localObject3).la;
        if ((!((a)localObject3).Y) && (!((a)localObject3).Z))
        {
          ((B)localObject4).n(((View)localObject2).getVisibility());
          i5 = ((ViewGroup.MarginLayoutParams)localObject3).width;
          i6 = ((ViewGroup.MarginLayoutParams)localObject3).height;
          if ((i5 != 0) && (i6 != 0))
          {
            if (i5 == -2) {
              i7 = 1;
            } else {
              i7 = 0;
            }
            i8 = ViewGroup.getChildMeasureSpec(paramInt1, i2, i5);
            if (i6 == -2) {
              i9 = 1;
            } else {
              i9 = 0;
            }
            ((View)localObject2).measure(i8, ViewGroup.getChildMeasureSpec(paramInt2, i1, i6));
            localObject5 = ((ConstraintLayout)localObject1).t;
            if (localObject5 != null) {
              ((q)localObject5).a += 1L;
            }
            if (i5 == -2) {
              bool = true;
            } else {
              bool = false;
            }
            ((B)localObject4).b(bool);
            if (i6 == -2) {
              bool = true;
            } else {
              bool = false;
            }
            ((B)localObject4).a(bool);
            i5 = ((View)localObject2).getMeasuredWidth();
            i6 = ((View)localObject2).getMeasuredHeight();
            ((B)localObject4).o(i5);
            ((B)localObject4).g(i6);
            if (i7 != 0) {
              ((B)localObject4).q(i5);
            }
            if (i9 != 0) {
              ((B)localObject4).p(i6);
            }
            if (((a)localObject3).X)
            {
              i7 = ((View)localObject2).getBaseline();
              if (i7 != -1) {
                ((B)localObject4).f(i7);
              }
            }
            if ((((a)localObject3).V) && (((a)localObject3).W))
            {
              ((B)localObject4).m().a(i5);
              ((B)localObject4).l().a(i6);
            }
          }
          else
          {
            ((B)localObject4).m().b();
            ((B)localObject4).l().b();
          }
        }
      }
    }
    ((ConstraintLayout)localObject1).d.U();
    int i10 = 0;
    while (i10 < i3)
    {
      localObject3 = ((ViewGroup)localObject1).getChildAt(i10);
      if (((View)localObject3).getVisibility() != 8)
      {
        localObject4 = (a)((View)localObject3).getLayoutParams();
        localObject2 = ((a)localObject4).la;
        if ((!((a)localObject4).Y) && (!((a)localObject4).Z))
        {
          ((B)localObject2).n(((View)localObject3).getVisibility());
          i5 = ((ViewGroup.MarginLayoutParams)localObject4).width;
          i8 = ((ViewGroup.MarginLayoutParams)localObject4).height;
          if ((i5 == 0) || (i8 == 0))
          {
            J localJ1 = ((B)localObject2).a(z.c.b).d();
            localObject5 = ((B)localObject2).a(z.c.d).d();
            if ((((B)localObject2).a(z.c.b).g() != null) && (((B)localObject2).a(z.c.d).g() != null)) {
              i7 = 1;
            } else {
              i7 = 0;
            }
            J localJ2 = ((B)localObject2).a(z.c.c).d();
            J localJ3 = ((B)localObject2).a(z.c.e).d();
            if ((((B)localObject2).a(z.c.c).g() != null) && (((B)localObject2).a(z.c.e).g() != null)) {
              i11 = 1;
            } else {
              i11 = 0;
            }
            if ((i5 == 0) && (i8 == 0) && (i7 != 0) && (i11 != 0))
            {
              l1 = 1L;
              localObject4 = localObject1;
              break label1314;
            }
            if (((ConstraintLayout)localObject1).d.j() != B.a.b) {
              i6 = 1;
            } else {
              i6 = 0;
            }
            if (((ConstraintLayout)localObject1).d.q() != B.a.b) {
              i4 = 1;
            } else {
              i4 = 0;
            }
            if (i6 == 0) {
              ((B)localObject2).m().b();
            }
            if (i4 == 0) {
              ((B)localObject2).l().b();
            }
            if (i5 == 0)
            {
              if ((i6 != 0) && (((B)localObject2).C()) && (i7 != 0) && (localJ1.c()) && (((L)localObject5).c()))
              {
                i5 = (int)(((J)localObject5).f() - localJ1.f());
                ((B)localObject2).m().a(i5);
                i9 = ViewGroup.getChildMeasureSpec(paramInt1, i2, i5);
              }
              else
              {
                i9 = ViewGroup.getChildMeasureSpec(paramInt1, i2, -2);
                i7 = 1;
                i12 = 0;
                i13 = i5;
                break label908;
              }
            }
            else
            {
              if (i5 != -1) {
                break label874;
              }
              i9 = ViewGroup.getChildMeasureSpec(paramInt1, i2, -1);
            }
            i7 = 0;
            int i12 = i6;
            int i13 = i5;
            break label908;
            label874:
            if (i5 == -2) {
              i7 = 1;
            } else {
              i7 = 0;
            }
            i9 = ViewGroup.getChildMeasureSpec(paramInt1, i2, i5);
            i13 = i5;
            i12 = i6;
            label908:
            if (i8 == 0)
            {
              if ((i4 != 0) && (((B)localObject2).B()) && (i11 != 0) && (localJ2.c()) && (localJ3.c()))
              {
                i8 = (int)(localJ3.f() - localJ2.f());
                ((B)localObject2).l().a(i8);
                i6 = ViewGroup.getChildMeasureSpec(paramInt2, i1, i8);
              }
              else
              {
                i6 = ViewGroup.getChildMeasureSpec(paramInt2, i1, -2);
                i4 = 1;
                i5 = 0;
                break label1066;
              }
            }
            else
            {
              if (i8 != -1) {
                break label1028;
              }
              i6 = ViewGroup.getChildMeasureSpec(paramInt2, i1, -1);
            }
            i5 = i4;
            i4 = 0;
            break label1066;
            label1028:
            if (i8 == -2) {
              i6 = 1;
            } else {
              i6 = 0;
            }
            int i11 = ViewGroup.getChildMeasureSpec(paramInt2, i1, i8);
            i5 = i4;
            i4 = i6;
            i6 = i11;
            label1066:
            ((View)localObject3).measure(i9, i6);
            localObject1 = this;
            localObject5 = ((ConstraintLayout)localObject1).t;
            if (localObject5 != null) {
              ((q)localObject5).a += 1L;
            }
            long l2 = 1L;
            if (i13 == -2) {
              bool = true;
            } else {
              bool = false;
            }
            ((B)localObject2).b(bool);
            if (i8 == -2) {
              bool = true;
            } else {
              bool = false;
            }
            ((B)localObject2).a(bool);
            i9 = ((View)localObject3).getMeasuredWidth();
            i6 = ((View)localObject3).getMeasuredHeight();
            ((B)localObject2).o(i9);
            ((B)localObject2).g(i6);
            if (i7 != 0) {
              ((B)localObject2).q(i9);
            }
            if (i4 != 0) {
              ((B)localObject2).p(i6);
            }
            if (i12 != 0) {
              ((B)localObject2).m().a(i9);
            } else {
              ((B)localObject2).m().f();
            }
            if (i5 != 0) {
              ((B)localObject2).l().a(i6);
            } else {
              ((B)localObject2).l().f();
            }
            if (((a)localObject4).X)
            {
              i4 = ((View)localObject3).getBaseline();
              localObject4 = localObject1;
              l1 = l2;
              if (i4 == -1) {
                break label1314;
              }
              ((B)localObject2).f(i4);
              localObject4 = localObject1;
              l1 = l2;
              break label1314;
            }
            localObject4 = localObject1;
            l1 = l2;
            break label1314;
          }
        }
      }
      localObject4 = localObject1;
      label1314:
      i10++;
      localObject1 = localObject4;
    }
  }
  
  private final B c(int paramInt)
  {
    if (paramInt == 0) {
      return this.d;
    }
    View localView = (View)this.a.get(paramInt);
    Object localObject = localView;
    if (localView == null)
    {
      localView = findViewById(paramInt);
      localObject = localView;
      if (localView != null)
      {
        localObject = localView;
        if (localView != this)
        {
          localObject = localView;
          if (localView.getParent() == this)
          {
            onViewAdded(localView);
            localObject = localView;
          }
        }
      }
    }
    if (localObject == this) {
      return this.d;
    }
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((a)((View)localObject).getLayoutParams()).la;
    }
    return (B)localObject;
  }
  
  private void c()
  {
    int i1 = getChildCount();
    int i2 = 0;
    for (int i3 = 0; i3 < i1; i3++)
    {
      View localView = getChildAt(i3);
      if ((localView instanceof e)) {
        ((e)localView).a(this);
      }
    }
    i1 = this.b.size();
    if (i1 > 0) {
      for (i3 = i2; i3 < i1; i3++) {
        ((a)this.b.get(i3)).b(this);
      }
    }
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    int i3 = getPaddingTop();
    int i4 = getPaddingBottom();
    int i5 = getPaddingLeft();
    int i6 = getPaddingRight();
    B.a locala1 = B.a.a;
    getLayoutParams();
    if (i1 != Integer.MIN_VALUE)
    {
      if (i1 != 0) {
        if (i1 == 1073741824) {}
      }
      for (locala2 = locala1;; locala2 = B.a.b)
      {
        paramInt1 = 0;
        break;
        paramInt1 = Math.min(this.g, paramInt1) - (i5 + i6);
        locala2 = locala1;
        break;
      }
    }
    B.a locala2 = B.a.b;
    if (i2 != Integer.MIN_VALUE)
    {
      if (i2 != 0) {
        if (i2 == 1073741824) {}
      }
      for (;;)
      {
        paramInt2 = 0;
        break;
        paramInt2 = Math.min(this.h, paramInt2) - (i3 + i4);
        break;
        locala1 = B.a.b;
      }
    }
    locala1 = B.a.b;
    this.d.l(0);
    this.d.k(0);
    this.d.a(locala2);
    this.d.o(paramInt1);
    this.d.b(locala1);
    this.d.g(paramInt2);
    this.d.l(this.e - getPaddingLeft() - getPaddingRight());
    this.d.k(this.f - getPaddingTop() - getPaddingBottom());
  }
  
  public final B a(View paramView)
  {
    if (paramView == this) {
      return this.d;
    }
    if (paramView == null) {
      paramView = null;
    } else {
      paramView = ((a)paramView.getLayoutParams()).la;
    }
    return paramView;
  }
  
  public Object a(int paramInt, Object paramObject)
  {
    if ((paramInt == 0) && ((paramObject instanceof String)))
    {
      paramObject = (String)paramObject;
      HashMap localHashMap = this.m;
      if ((localHashMap != null) && (localHashMap.containsKey(paramObject))) {
        return this.m.get(paramObject);
      }
    }
    return null;
  }
  
  public void a(int paramInt, Object paramObject1, Object paramObject2)
  {
    if ((paramInt == 0) && ((paramObject1 instanceof String)) && ((paramObject2 instanceof Integer)))
    {
      if (this.m == null) {
        this.m = new HashMap();
      }
      String str = (String)paramObject1;
      paramInt = str.indexOf("/");
      paramObject1 = str;
      if (paramInt != -1) {
        paramObject1 = str.substring(paramInt + 1);
      }
      paramInt = ((Integer)paramObject2).intValue();
      this.m.put(paramObject1, Integer.valueOf(paramInt));
    }
  }
  
  protected void a(String paramString)
  {
    this.d.K();
    paramString = this.t;
    if (paramString != null) {
      paramString.c += 1L;
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if (Build.VERSION.SDK_INT < 14) {
      onViewAdded(paramView);
    }
  }
  
  public View b(int paramInt)
  {
    return (View)this.a.get(paramInt);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof a;
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    if (isInEditMode())
    {
      int i1 = getChildCount();
      float f1 = getWidth();
      float f2 = getHeight();
      for (int i2 = 0; i2 < i1; i2++)
      {
        Object localObject = getChildAt(i2);
        if (((View)localObject).getVisibility() != 8)
        {
          localObject = ((View)localObject).getTag();
          if ((localObject != null) && ((localObject instanceof String)))
          {
            localObject = ((String)localObject).split(",");
            if (localObject.length == 4)
            {
              int i3 = Integer.parseInt(localObject[0]);
              int i4 = Integer.parseInt(localObject[1]);
              int i5 = Integer.parseInt(localObject[2]);
              int i6 = Integer.parseInt(localObject[3]);
              i3 = (int)(i3 / 1080.0F * f1);
              i4 = (int)(i4 / 1920.0F * f2);
              i5 = (int)(i5 / 1080.0F * f1);
              i6 = (int)(i6 / 1920.0F * f2);
              localObject = new Paint();
              ((Paint)localObject).setColor(-65536);
              float f3 = i3;
              float f4 = i4;
              float f5 = i3 + i5;
              paramCanvas.drawLine(f3, f4, f5, f4, (Paint)localObject);
              float f6 = i4 + i6;
              paramCanvas.drawLine(f5, f4, f5, f6, (Paint)localObject);
              paramCanvas.drawLine(f5, f6, f3, f6, (Paint)localObject);
              paramCanvas.drawLine(f3, f6, f3, f4, (Paint)localObject);
              ((Paint)localObject).setColor(-16711936);
              paramCanvas.drawLine(f3, f4, f5, f6, (Paint)localObject);
              paramCanvas.drawLine(f3, f6, f5, f4, (Paint)localObject);
            }
          }
        }
      }
    }
  }
  
  protected a generateDefaultLayoutParams()
  {
    return new a(-2, -2);
  }
  
  public a generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new a(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new a(paramLayoutParams);
  }
  
  public int getMaxHeight()
  {
    return this.h;
  }
  
  public int getMaxWidth()
  {
    return this.g;
  }
  
  public int getMinHeight()
  {
    return this.f;
  }
  
  public int getMinWidth()
  {
    return this.e;
  }
  
  public int getOptimizationLevel()
  {
    return this.d.M();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = getChildCount();
    paramBoolean = isInEditMode();
    paramInt2 = 0;
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      Object localObject = (a)localView.getLayoutParams();
      B localB = ((a)localObject).la;
      if (((localView.getVisibility() != 8) || (((a)localObject).Y) || (((a)localObject).Z) || (paramBoolean)) && (!((a)localObject).aa))
      {
        int i1 = localB.g();
        paramInt4 = localB.h();
        int i2 = localB.s() + i1;
        int i3 = localB.i() + paramInt4;
        localView.layout(i1, paramInt4, i2, i3);
        if ((localView instanceof e))
        {
          localObject = ((e)localView).getContent();
          if (localObject != null)
          {
            ((View)localObject).setVisibility(0);
            ((View)localObject).layout(i1, paramInt4, i2, i3);
          }
        }
      }
    }
    paramInt3 = this.b.size();
    if (paramInt3 > 0) {
      for (paramInt1 = paramInt2; paramInt1 < paramInt3; paramInt1++) {
        ((a)this.b.get(paramInt1)).a(this);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    System.currentTimeMillis();
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i5 = getPaddingLeft();
    int i6 = getPaddingTop();
    this.d.r(i5);
    this.d.s(i6);
    this.d.j(this.g);
    this.d.i(this.h);
    if (Build.VERSION.SDK_INT >= 17)
    {
      localObject1 = this.d;
      boolean bool;
      if (getLayoutDirection() == 1) {
        bool = true;
      } else {
        bool = false;
      }
      ((C)localObject1).c(bool);
    }
    c(paramInt1, paramInt2);
    int i7 = this.d.s();
    int i8 = this.d.i();
    if (this.i)
    {
      this.i = false;
      b();
      i9 = 1;
    }
    else
    {
      i9 = 0;
    }
    int i10;
    if ((this.j & 0x8) == 8) {
      i10 = 1;
    } else {
      i10 = 0;
    }
    if (i10 != 0)
    {
      this.d.T();
      this.d.f(i7, i8);
      b(paramInt1, paramInt2);
    }
    else
    {
      a(paramInt1, paramInt2);
    }
    c();
    if ((getChildCount() > 0) && (i9 != 0)) {
      u.a(this.d);
    }
    Object localObject1 = this.d;
    if (((C)localObject1).Ia)
    {
      if ((((C)localObject1).Ja) && (i1 == Integer.MIN_VALUE))
      {
        i9 = ((C)localObject1).La;
        if (i9 < i2) {
          ((B)localObject1).o(i9);
        }
        this.d.a(B.a.a);
      }
      localObject1 = this.d;
      if ((((C)localObject1).Ka) && (i3 == Integer.MIN_VALUE))
      {
        i9 = ((C)localObject1).Ma;
        if (i9 < i4) {
          ((B)localObject1).g(i9);
        }
        this.d.b(B.a.a);
      }
    }
    if ((this.j & 0x20) == 32)
    {
      i11 = this.d.s();
      i9 = this.d.i();
      if ((this.n != i11) && (i1 == 1073741824)) {
        u.a(this.d.Ha, 0, i11);
      }
      if ((this.o != i9) && (i3 == 1073741824)) {
        u.a(this.d.Ha, 1, i9);
      }
      localObject1 = this.d;
      if ((((C)localObject1).Ja) && (((C)localObject1).La > i2)) {
        u.a(((C)localObject1).Ha, 0, i2);
      }
      localObject1 = this.d;
      if ((((C)localObject1).Ka) && (((C)localObject1).Ma > i4)) {
        u.a(((C)localObject1).Ha, 1, i4);
      }
    }
    if (getChildCount() > 0) {
      a("First pass");
    }
    int i11 = this.c.size();
    int i12 = i6 + getPaddingBottom();
    int i13 = i5 + getPaddingRight();
    if (i11 > 0)
    {
      if (this.d.j() == B.a.b) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if (this.d.q() == B.a.b) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      i6 = Math.max(this.d.s(), this.e);
      i5 = Math.max(this.d.i(), this.f);
      int i14 = 0;
      i3 = 0;
      i9 = 0;
      Object localObject2;
      while (i14 < i11)
      {
        localObject1 = (B)this.c.get(i14);
        View localView = (View)((B)localObject1).e();
        if (localView != null)
        {
          localObject2 = (a)localView.getLayoutParams();
          if ((!((a)localObject2).Z) && (!((a)localObject2).Y))
          {
            int i15 = localView.getVisibility();
            i4 = i3;
            if (i15 != 8)
            {
              while ((i10 != 0) && (((B)localObject1).m().c()) && (((B)localObject1).l().c())) {}
              if ((((ViewGroup.MarginLayoutParams)localObject2).width == -2) && (((a)localObject2).V)) {
                i3 = ViewGroup.getChildMeasureSpec(paramInt1, i13, ((ViewGroup.MarginLayoutParams)localObject2).width);
              } else {
                i3 = View.MeasureSpec.makeMeasureSpec(((B)localObject1).s(), 1073741824);
              }
              if ((((ViewGroup.MarginLayoutParams)localObject2).height == -2) && (((a)localObject2).W)) {
                i15 = ViewGroup.getChildMeasureSpec(paramInt2, i12, ((ViewGroup.MarginLayoutParams)localObject2).height);
              } else {
                i15 = View.MeasureSpec.makeMeasureSpec(((B)localObject1).i(), 1073741824);
              }
              localView.measure(i3, i15);
              q localq = this.t;
              if (localq != null) {
                localq.b += 1L;
              }
              int i16 = localView.getMeasuredWidth();
              i15 = localView.getMeasuredHeight();
              i3 = i6;
              if (i16 != ((B)localObject1).s())
              {
                ((B)localObject1).o(i16);
                if (i10 != 0) {
                  ((B)localObject1).m().a(i16);
                }
                i3 = i6;
                if (i2 != 0)
                {
                  i3 = i6;
                  if (((B)localObject1).n() > i6) {
                    i3 = Math.max(i6, ((B)localObject1).n() + ((B)localObject1).a(z.c.d).b());
                  }
                }
                i4 = 1;
              }
              i6 = i5;
              if (i15 != ((B)localObject1).i())
              {
                ((B)localObject1).g(i15);
                if (i10 != 0) {
                  ((B)localObject1).l().a(i15);
                }
                i6 = i5;
                if (i1 != 0)
                {
                  i6 = i5;
                  if (((B)localObject1).d() > i5) {
                    i6 = Math.max(i5, ((B)localObject1).d() + ((B)localObject1).a(z.c.e).b());
                  }
                }
                i4 = 1;
              }
              i5 = i4;
              if (((a)localObject2).X)
              {
                i15 = localView.getBaseline();
                i5 = i4;
                if (i15 != -1)
                {
                  i5 = i4;
                  if (i15 != ((B)localObject1).c())
                  {
                    ((B)localObject1).f(i15);
                    i5 = 1;
                  }
                }
              }
              if (Build.VERSION.SDK_INT >= 11)
              {
                i9 = ViewGroup.combineMeasuredStates(i9, localView.getMeasuredState());
                i4 = i6;
                i6 = i3;
                i3 = i5;
                break label1192;
              }
              i4 = i6;
              i6 = i3;
              i3 = i5;
              break label1192;
            }
          }
        }
        i4 = i5;
        label1192:
        i14++;
        i5 = i4;
      }
      i4 = i9;
      if (i3 != 0)
      {
        this.d.o(i7);
        this.d.g(i8);
        if (i10 != 0) {
          this.d.U();
        }
        a("2nd pass");
        if (this.d.s() < i6)
        {
          this.d.o(i6);
          i9 = 1;
        }
        else
        {
          i9 = 0;
        }
        if (this.d.i() < i5)
        {
          this.d.g(i5);
          i9 = 1;
        }
        if (i9 != 0) {
          a("3rd pass");
        }
      }
      for (i5 = 0;; i5++)
      {
        i9 = i4;
        if (i5 >= i11) {
          break;
        }
        localObject2 = (B)this.c.get(i5);
        localObject1 = (View)((B)localObject2).e();
        if (localObject1 != null)
        {
          while (((((View)localObject1).getMeasuredWidth() == ((B)localObject2).s()) && (((View)localObject1).getMeasuredHeight() == ((B)localObject2).i())) || (((B)localObject2).r() == 8)) {}
          ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(((B)localObject2).s(), 1073741824), View.MeasureSpec.makeMeasureSpec(((B)localObject2).i(), 1073741824));
          localObject1 = this.t;
          if (localObject1 != null) {
            ((q)localObject1).b += 1L;
          }
        }
      }
    }
    int i9 = 0;
    i5 = this.d.s() + i13;
    i6 = this.d.i() + i12;
    if (Build.VERSION.SDK_INT >= 11)
    {
      paramInt1 = ViewGroup.resolveSizeAndState(i5, paramInt1, i9);
      i9 = ViewGroup.resolveSizeAndState(i6, paramInt2, i9 << 16);
      paramInt2 = Math.min(this.g, paramInt1 & 0xFFFFFF);
      i9 = Math.min(this.h, i9 & 0xFFFFFF);
      paramInt1 = paramInt2;
      if (this.d.Q()) {
        paramInt1 = paramInt2 | 0x1000000;
      }
      paramInt2 = i9;
      if (this.d.O()) {
        paramInt2 = i9 | 0x1000000;
      }
      setMeasuredDimension(paramInt1, paramInt2);
      this.n = paramInt1;
      this.o = paramInt2;
    }
    else
    {
      setMeasuredDimension(i5, i6);
      this.n = i5;
      this.o = i6;
    }
  }
  
  public void onViewAdded(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      super.onViewAdded(paramView);
    }
    Object localObject = a(paramView);
    if (((paramView instanceof Guideline)) && (!(localObject instanceof F)))
    {
      localObject = (a)paramView.getLayoutParams();
      ((a)localObject).la = new F();
      ((a)localObject).Y = true;
      ((F)((a)localObject).la).v(((a)localObject).S);
    }
    if ((paramView instanceof a))
    {
      localObject = (a)paramView;
      ((a)localObject).a();
      ((a)paramView.getLayoutParams()).Z = true;
      if (!this.b.contains(localObject)) {
        this.b.add(localObject);
      }
    }
    this.a.put(paramView.getId(), paramView);
    this.i = true;
  }
  
  public void onViewRemoved(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      super.onViewRemoved(paramView);
    }
    this.a.remove(paramView.getId());
    B localB = a(paramView);
    this.d.c(localB);
    this.b.remove(paramView);
    this.c.remove(localB);
    this.i = true;
  }
  
  public void removeView(View paramView)
  {
    super.removeView(paramView);
    if (Build.VERSION.SDK_INT < 14) {
      onViewRemoved(paramView);
    }
  }
  
  public void requestLayout()
  {
    super.requestLayout();
    this.i = true;
    this.n = -1;
    this.o = -1;
    this.p = -1;
    this.q = -1;
    this.r = 0;
    this.s = 0;
  }
  
  public void setConstraintSet(c paramc)
  {
    this.k = paramc;
  }
  
  public void setId(int paramInt)
  {
    this.a.remove(getId());
    super.setId(paramInt);
    this.a.put(getId(), this);
  }
  
  public void setMaxHeight(int paramInt)
  {
    if (paramInt == this.h) {
      return;
    }
    this.h = paramInt;
    requestLayout();
  }
  
  public void setMaxWidth(int paramInt)
  {
    if (paramInt == this.g) {
      return;
    }
    this.g = paramInt;
    requestLayout();
  }
  
  public void setMinHeight(int paramInt)
  {
    if (paramInt == this.f) {
      return;
    }
    this.f = paramInt;
    requestLayout();
  }
  
  public void setMinWidth(int paramInt)
  {
    if (paramInt == this.e) {
      return;
    }
    this.e = paramInt;
    requestLayout();
  }
  
  public void setOptimizationLevel(int paramInt)
  {
    this.d.u(paramInt);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public static class a
    extends ViewGroup.MarginLayoutParams
  {
    public float A = 0.5F;
    public String B = null;
    float C = 0.0F;
    int D = 1;
    public float E = -1.0F;
    public float F = -1.0F;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public int J = 0;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public float O = 1.0F;
    public float P = 1.0F;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public boolean T = false;
    public boolean U = false;
    boolean V = true;
    boolean W = true;
    boolean X = false;
    boolean Y = false;
    boolean Z = false;
    public int a = -1;
    boolean aa = false;
    public int b = -1;
    int ba = -1;
    public float c = -1.0F;
    int ca = -1;
    public int d = -1;
    int da = -1;
    public int e = -1;
    int ea = -1;
    public int f = -1;
    int fa = -1;
    public int g = -1;
    int ga = -1;
    public int h = -1;
    float ha = 0.5F;
    public int i = -1;
    int ia;
    public int j = -1;
    int ja;
    public int k = -1;
    float ka;
    public int l = -1;
    B la = new B();
    public int m = -1;
    public boolean ma = false;
    public int n = 0;
    public float o = 0.0F;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public float z = 0.5F;
    
    public a(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, g.ConstraintLayout_Layout);
      int i1 = paramContext.getIndexCount();
      for (int i2 = 0; i2 < i1; i2++)
      {
        int i3 = paramContext.getIndex(i2);
        String str;
        switch (a.a.get(i3))
        {
        case 43: 
        default: 
          break;
        case 50: 
          this.R = paramContext.getDimensionPixelOffset(i3, this.R);
          break;
        case 49: 
          this.Q = paramContext.getDimensionPixelOffset(i3, this.Q);
          break;
        case 48: 
          this.H = paramContext.getInt(i3, 0);
          break;
        case 47: 
          this.G = paramContext.getInt(i3, 0);
          break;
        case 46: 
          this.F = paramContext.getFloat(i3, this.F);
          break;
        case 45: 
          this.E = paramContext.getFloat(i3, this.E);
          break;
        case 44: 
          this.B = paramContext.getString(i3);
          this.C = NaN.0F;
          this.D = -1;
          paramAttributeSet = this.B;
          if (paramAttributeSet != null)
          {
            int i4 = paramAttributeSet.length();
            i3 = this.B.indexOf(',');
            if ((i3 > 0) && (i3 < i4 - 1))
            {
              paramAttributeSet = this.B.substring(0, i3);
              if (paramAttributeSet.equalsIgnoreCase("W")) {
                this.D = 0;
              } else if (paramAttributeSet.equalsIgnoreCase("H")) {
                this.D = 1;
              }
              i3++;
            }
            else
            {
              i3 = 0;
            }
            int i5 = this.B.indexOf(':');
            if ((i5 >= 0) && (i5 < i4 - 1))
            {
              paramAttributeSet = this.B.substring(i3, i5);
              str = this.B.substring(i5 + 1);
              if ((paramAttributeSet.length() <= 0) || (str.length() <= 0)) {
                continue;
              }
            }
          }
          break;
        }
        try
        {
          f1 = Float.parseFloat(paramAttributeSet);
          float f2 = Float.parseFloat(str);
          if ((f1 <= 0.0F) || (f2 <= 0.0F)) {
            continue;
          }
          if (this.D == 1) {
            this.C = Math.abs(f2 / f1);
          } else {
            this.C = Math.abs(f1 / f2);
          }
        }
        catch (NumberFormatException paramAttributeSet)
        {
          float f1;
          continue;
        }
        paramAttributeSet = this.B.substring(i3);
        if (paramAttributeSet.length() > 0)
        {
          this.C = Float.parseFloat(paramAttributeSet);
          continue;
          this.P = Math.max(0.0F, paramContext.getFloat(i3, this.P));
          continue;
          try
          {
            this.N = paramContext.getDimensionPixelSize(i3, this.N);
          }
          catch (Exception paramAttributeSet)
          {
            if (paramContext.getInt(i3, this.N) != -2) {
              continue;
            }
          }
          this.N = -2;
          continue;
          try
          {
            this.L = paramContext.getDimensionPixelSize(i3, this.L);
          }
          catch (Exception paramAttributeSet)
          {
            if (paramContext.getInt(i3, this.L) != -2) {
              continue;
            }
          }
          this.L = -2;
          continue;
          this.O = Math.max(0.0F, paramContext.getFloat(i3, this.O));
          continue;
          try
          {
            this.M = paramContext.getDimensionPixelSize(i3, this.M);
          }
          catch (Exception paramAttributeSet)
          {
            if (paramContext.getInt(i3, this.M) != -2) {
              continue;
            }
          }
          this.M = -2;
          continue;
          try
          {
            this.K = paramContext.getDimensionPixelSize(i3, this.K);
          }
          catch (Exception paramAttributeSet)
          {
            if (paramContext.getInt(i3, this.K) != -2) {
              continue;
            }
          }
          this.K = -2;
          continue;
          this.J = paramContext.getInt(i3, 0);
          if (this.J == 1)
          {
            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
            continue;
            this.I = paramContext.getInt(i3, 0);
            if (this.I == 1)
            {
              Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
              continue;
              this.A = paramContext.getFloat(i3, this.A);
              continue;
              this.z = paramContext.getFloat(i3, this.z);
              continue;
              this.U = paramContext.getBoolean(i3, this.U);
              continue;
              this.T = paramContext.getBoolean(i3, this.T);
              continue;
              this.y = paramContext.getDimensionPixelSize(i3, this.y);
              continue;
              this.x = paramContext.getDimensionPixelSize(i3, this.x);
              continue;
              this.w = paramContext.getDimensionPixelSize(i3, this.w);
              continue;
              this.v = paramContext.getDimensionPixelSize(i3, this.v);
              continue;
              this.u = paramContext.getDimensionPixelSize(i3, this.u);
              continue;
              this.t = paramContext.getDimensionPixelSize(i3, this.t);
              continue;
              this.s = paramContext.getResourceId(i3, this.s);
              if (this.s == -1)
              {
                this.s = paramContext.getInt(i3, -1);
                continue;
                this.r = paramContext.getResourceId(i3, this.r);
                if (this.r == -1)
                {
                  this.r = paramContext.getInt(i3, -1);
                  continue;
                  this.q = paramContext.getResourceId(i3, this.q);
                  if (this.q == -1)
                  {
                    this.q = paramContext.getInt(i3, -1);
                    continue;
                    this.p = paramContext.getResourceId(i3, this.p);
                    if (this.p == -1)
                    {
                      this.p = paramContext.getInt(i3, -1);
                      continue;
                      this.l = paramContext.getResourceId(i3, this.l);
                      if (this.l == -1)
                      {
                        this.l = paramContext.getInt(i3, -1);
                        continue;
                        this.k = paramContext.getResourceId(i3, this.k);
                        if (this.k == -1)
                        {
                          this.k = paramContext.getInt(i3, -1);
                          continue;
                          this.j = paramContext.getResourceId(i3, this.j);
                          if (this.j == -1)
                          {
                            this.j = paramContext.getInt(i3, -1);
                            continue;
                            this.i = paramContext.getResourceId(i3, this.i);
                            if (this.i == -1)
                            {
                              this.i = paramContext.getInt(i3, -1);
                              continue;
                              this.h = paramContext.getResourceId(i3, this.h);
                              if (this.h == -1)
                              {
                                this.h = paramContext.getInt(i3, -1);
                                continue;
                                this.g = paramContext.getResourceId(i3, this.g);
                                if (this.g == -1)
                                {
                                  this.g = paramContext.getInt(i3, -1);
                                  continue;
                                  this.f = paramContext.getResourceId(i3, this.f);
                                  if (this.f == -1)
                                  {
                                    this.f = paramContext.getInt(i3, -1);
                                    continue;
                                    this.e = paramContext.getResourceId(i3, this.e);
                                    if (this.e == -1)
                                    {
                                      this.e = paramContext.getInt(i3, -1);
                                      continue;
                                      this.d = paramContext.getResourceId(i3, this.d);
                                      if (this.d == -1)
                                      {
                                        this.d = paramContext.getInt(i3, -1);
                                        continue;
                                        this.c = paramContext.getFloat(i3, this.c);
                                        continue;
                                        this.b = paramContext.getDimensionPixelOffset(i3, this.b);
                                        continue;
                                        this.a = paramContext.getDimensionPixelOffset(i3, this.a);
                                        continue;
                                        this.o = (paramContext.getFloat(i3, this.o) % 360.0F);
                                        f1 = this.o;
                                        if (f1 < 0.0F)
                                        {
                                          this.o = ((360.0F - f1) % 360.0F);
                                          continue;
                                          this.n = paramContext.getDimensionPixelSize(i3, this.n);
                                          continue;
                                          this.m = paramContext.getResourceId(i3, this.m);
                                          if (this.m == -1)
                                          {
                                            this.m = paramContext.getInt(i3, -1);
                                            continue;
                                            this.S = paramContext.getInt(i3, this.S);
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      paramContext.recycle();
      a();
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public void a()
    {
      this.Y = false;
      this.V = true;
      this.W = true;
      if ((this.width == -2) && (this.T))
      {
        this.V = false;
        this.I = 1;
      }
      if ((this.height == -2) && (this.U))
      {
        this.W = false;
        this.J = 1;
      }
      if ((this.width == 0) || (this.width == -1))
      {
        this.V = false;
        if ((this.width == 0) && (this.I == 1))
        {
          this.width = -2;
          this.T = true;
        }
      }
      if ((this.height == 0) || (this.height == -1))
      {
        this.W = false;
        if ((this.height == 0) && (this.J == 1))
        {
          this.height = -2;
          this.U = true;
        }
      }
      if ((this.c != -1.0F) || (this.a != -1) || (this.b != -1))
      {
        this.Y = true;
        this.V = true;
        this.W = true;
        if (!(this.la instanceof F)) {
          this.la = new F();
        }
        ((F)this.la).v(this.S);
      }
    }
    
    @TargetApi(17)
    public void resolveLayoutDirection(int paramInt)
    {
      int i1 = this.leftMargin;
      int i2 = this.rightMargin;
      super.resolveLayoutDirection(paramInt);
      this.da = -1;
      this.ea = -1;
      this.ba = -1;
      this.ca = -1;
      this.fa = -1;
      this.ga = -1;
      this.fa = this.t;
      this.ga = this.v;
      this.ha = this.z;
      this.ia = this.a;
      this.ja = this.b;
      this.ka = this.c;
      paramInt = getLayoutDirection();
      int i3 = 0;
      if (1 == paramInt) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (paramInt != 0)
      {
        paramInt = this.p;
        if (paramInt != -1) {
          this.da = paramInt;
        }
        for (;;)
        {
          paramInt = 1;
          break;
          int i4 = this.q;
          paramInt = i3;
          if (i4 == -1) {
            break;
          }
          this.ea = i4;
        }
        i3 = this.r;
        if (i3 != -1)
        {
          this.ca = i3;
          paramInt = 1;
        }
        i3 = this.s;
        if (i3 != -1)
        {
          this.ba = i3;
          paramInt = 1;
        }
        i3 = this.x;
        if (i3 != -1) {
          this.ga = i3;
        }
        i3 = this.y;
        if (i3 != -1) {
          this.fa = i3;
        }
        if (paramInt != 0) {
          this.ha = (1.0F - this.z);
        }
        if ((this.Y) && (this.S == 1))
        {
          float f1 = this.c;
          if (f1 != -1.0F)
          {
            this.ka = (1.0F - f1);
            this.ia = -1;
            this.ja = -1;
          }
          else
          {
            paramInt = this.a;
            if (paramInt != -1)
            {
              this.ja = paramInt;
              this.ia = -1;
              this.ka = -1.0F;
            }
            else
            {
              paramInt = this.b;
              if (paramInt != -1)
              {
                this.ia = paramInt;
                this.ja = -1;
                this.ka = -1.0F;
              }
            }
          }
        }
      }
      else
      {
        paramInt = this.p;
        if (paramInt != -1) {
          this.ca = paramInt;
        }
        paramInt = this.q;
        if (paramInt != -1) {
          this.ba = paramInt;
        }
        paramInt = this.r;
        if (paramInt != -1) {
          this.da = paramInt;
        }
        paramInt = this.s;
        if (paramInt != -1) {
          this.ea = paramInt;
        }
        paramInt = this.x;
        if (paramInt != -1) {
          this.fa = paramInt;
        }
        paramInt = this.y;
        if (paramInt != -1) {
          this.ga = paramInt;
        }
      }
      if ((this.r == -1) && (this.s == -1) && (this.q == -1) && (this.p == -1))
      {
        paramInt = this.f;
        if (paramInt != -1)
        {
          this.da = paramInt;
          if ((this.rightMargin <= 0) && (i2 > 0)) {
            this.rightMargin = i2;
          }
        }
        else
        {
          paramInt = this.g;
          if (paramInt != -1)
          {
            this.ea = paramInt;
            if ((this.rightMargin <= 0) && (i2 > 0)) {
              this.rightMargin = i2;
            }
          }
        }
        paramInt = this.d;
        if (paramInt != -1)
        {
          this.ba = paramInt;
          if ((this.leftMargin <= 0) && (i1 > 0)) {
            this.leftMargin = i1;
          }
        }
        else
        {
          paramInt = this.e;
          if (paramInt != -1)
          {
            this.ca = paramInt;
            if ((this.leftMargin <= 0) && (i1 > 0)) {
              this.leftMargin = i1;
            }
          }
        }
      }
    }
    
    private static class a
    {
      public static final SparseIntArray a = new SparseIntArray();
      
      static
      {
        a.append(g.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
        a.append(g.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
        a.append(g.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
        a.append(g.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
        a.append(g.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
        a.append(g.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
        a.append(g.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
        a.append(g.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
        a.append(g.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
        a.append(g.ConstraintLayout_Layout_layout_constraintCircle, 2);
        a.append(g.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
        a.append(g.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
        a.append(g.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
        a.append(g.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
        a.append(g.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
        a.append(g.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
        a.append(g.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
        a.append(g.ConstraintLayout_Layout_android_orientation, 1);
        a.append(g.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
        a.append(g.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
        a.append(g.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
        a.append(g.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
        a.append(g.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
        a.append(g.ConstraintLayout_Layout_layout_goneMarginTop, 22);
        a.append(g.ConstraintLayout_Layout_layout_goneMarginRight, 23);
        a.append(g.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
        a.append(g.ConstraintLayout_Layout_layout_goneMarginStart, 25);
        a.append(g.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
        a.append(g.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
        a.append(g.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
        a.append(g.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
        a.append(g.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
        a.append(g.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
        a.append(g.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
        a.append(g.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
        a.append(g.ConstraintLayout_Layout_layout_constrainedWidth, 27);
        a.append(g.ConstraintLayout_Layout_layout_constrainedHeight, 28);
        a.append(g.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
        a.append(g.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
        a.append(g.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
        a.append(g.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
        a.append(g.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
        a.append(g.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
        a.append(g.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
        a.append(g.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
        a.append(g.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
        a.append(g.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
        a.append(g.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
        a.append(g.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
        a.append(g.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/constraint/ConstraintLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */