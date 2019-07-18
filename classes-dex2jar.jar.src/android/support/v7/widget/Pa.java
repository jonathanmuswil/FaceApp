package android.support.v7.widget;

import Pd;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.f;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class pa
  extends ViewGroup
{
  private boolean a = true;
  private int b = -1;
  private int c = 0;
  private int d;
  private int e = 8388659;
  private int f;
  private float g;
  private boolean h;
  private int[] i;
  private int[] j;
  private Drawable k;
  private int l;
  private int m;
  private int n;
  private int o;
  
  public pa(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public pa(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public pa(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = pb.a(paramContext, paramAttributeSet, Pd.LinearLayoutCompat, paramInt, 0);
    paramInt = paramContext.d(Pd.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0) {
      setOrientation(paramInt);
    }
    paramInt = paramContext.d(Pd.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0) {
      setGravity(paramInt);
    }
    boolean bool = paramContext.a(Pd.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool) {
      setBaselineAligned(bool);
    }
    this.g = paramContext.b(Pd.LinearLayoutCompat_android_weightSum, -1.0F);
    this.b = paramContext.d(Pd.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    this.h = paramContext.a(Pd.LinearLayoutCompat_measureWithLargestChild, false);
    setDividerDrawable(paramContext.b(Pd.LinearLayoutCompat_divider));
    this.n = paramContext.d(Pd.LinearLayoutCompat_showDividers, 0);
    this.o = paramContext.c(Pd.LinearLayoutCompat_dividerPadding, 0);
    paramContext.a();
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt3 + paramInt1, paramInt4 + paramInt2);
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    for (int i2 = 0; i2 < paramInt1; i2++)
    {
      View localView = b(i2);
      if (localView.getVisibility() != 8)
      {
        a locala = (a)localView.getLayoutParams();
        if (locala.height == -1)
        {
          int i3 = locala.width;
          locala.width = localView.getMeasuredWidth();
          measureChildWithMargins(localView, paramInt2, 0, i1, 0);
          locala.width = i3;
        }
      }
    }
  }
  
  private void d(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (int i2 = 0; i2 < paramInt1; i2++)
    {
      View localView = b(i2);
      if (localView.getVisibility() != 8)
      {
        a locala = (a)localView.getLayoutParams();
        if (locala.width == -1)
        {
          int i3 = locala.height;
          locala.height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, i1, 0, paramInt2, 0);
          locala.height = i3;
        }
      }
    }
  }
  
  int a(View paramView)
  {
    return 0;
  }
  
  int a(View paramView, int paramInt)
  {
    return 0;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.f = 0;
    int i1 = getVirtualChildCount();
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    if ((this.i == null) || (this.j == null))
    {
      this.i = new int[4];
      this.j = new int[4];
    }
    int[] arrayOfInt = this.i;
    Object localObject1 = this.j;
    arrayOfInt[3] = -1;
    arrayOfInt[2] = -1;
    arrayOfInt[1] = -1;
    arrayOfInt[0] = -1;
    localObject1[3] = -1;
    localObject1[2] = -1;
    localObject1[1] = -1;
    localObject1[0] = -1;
    boolean bool1 = this.a;
    boolean bool2 = this.h;
    int i4;
    if (i2 == 1073741824) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    float f1 = 0.0F;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 1;
    int i13 = 0;
    Object localObject2;
    Object localObject3;
    while (i5 < i1)
    {
      localObject2 = b(i5);
      if (localObject2 == null) {
        this.f += d(i5);
      }
      for (;;)
      {
        break;
        if (((View)localObject2).getVisibility() == 8)
        {
          i5 += a((View)localObject2, i5);
        }
        else
        {
          if (c(i5)) {
            this.f += this.l;
          }
          localObject3 = (a)((View)localObject2).getLayoutParams();
          f1 += ((a)localObject3).a;
          if ((i2 == 1073741824) && (((ViewGroup.MarginLayoutParams)localObject3).width == 0) && (((a)localObject3).a > 0.0F))
          {
            if (i4 != 0)
            {
              this.f += ((ViewGroup.MarginLayoutParams)localObject3).leftMargin + ((ViewGroup.MarginLayoutParams)localObject3).rightMargin;
            }
            else
            {
              i14 = this.f;
              this.f = Math.max(i14, ((ViewGroup.MarginLayoutParams)localObject3).leftMargin + i14 + ((ViewGroup.MarginLayoutParams)localObject3).rightMargin);
            }
            if (bool1)
            {
              i14 = View.MeasureSpec.makeMeasureSpec(0, 0);
              ((View)localObject2).measure(i14, i14);
              i14 = i6;
            }
            else
            {
              i10 = 1;
              break label568;
            }
          }
          else
          {
            if ((((ViewGroup.MarginLayoutParams)localObject3).width == 0) && (((a)localObject3).a > 0.0F))
            {
              ((ViewGroup.MarginLayoutParams)localObject3).width = -2;
              i14 = 0;
            }
            else
            {
              i14 = Integer.MIN_VALUE;
            }
            if (f1 == 0.0F) {
              i15 = this.f;
            } else {
              i15 = 0;
            }
            a((View)localObject2, i5, paramInt1, i15, paramInt2, 0);
            if (i14 != Integer.MIN_VALUE) {
              ((ViewGroup.MarginLayoutParams)localObject3).width = i14;
            }
            i15 = ((View)localObject2).getMeasuredWidth();
            if (i4 != 0)
            {
              this.f += ((ViewGroup.MarginLayoutParams)localObject3).leftMargin + i15 + ((ViewGroup.MarginLayoutParams)localObject3).rightMargin + b((View)localObject2);
            }
            else
            {
              i14 = this.f;
              this.f = Math.max(i14, i14 + i15 + ((ViewGroup.MarginLayoutParams)localObject3).leftMargin + ((ViewGroup.MarginLayoutParams)localObject3).rightMargin + b((View)localObject2));
            }
            i14 = i6;
            if (bool2) {
              i14 = Math.max(i15, i6);
            }
          }
          i6 = i14;
          label568:
          i16 = i5;
          if ((i3 != 1073741824) && (((ViewGroup.MarginLayoutParams)localObject3).height == -1))
          {
            i5 = 1;
            i13 = 1;
          }
          else
          {
            i5 = 0;
          }
          i14 = ((ViewGroup.MarginLayoutParams)localObject3).topMargin + ((ViewGroup.MarginLayoutParams)localObject3).bottomMargin;
          i15 = ((View)localObject2).getMeasuredHeight() + i14;
          int i17 = View.combineMeasuredStates(i11, ((View)localObject2).getMeasuredState());
          if (bool1)
          {
            int i18 = ((View)localObject2).getBaseline();
            if (i18 != -1)
            {
              int i19 = ((a)localObject3).b;
              i11 = i19;
              if (i19 < 0) {
                i11 = this.e;
              }
              i11 = ((i11 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              arrayOfInt[i11] = Math.max(arrayOfInt[i11], i18);
              localObject1[i11] = Math.max(localObject1[i11], i15 - i18);
            }
          }
          i7 = Math.max(i7, i15);
          if ((i12 != 0) && (((ViewGroup.MarginLayoutParams)localObject3).height == -1)) {
            i12 = 1;
          } else {
            i12 = 0;
          }
          if (((a)localObject3).a > 0.0F)
          {
            if (i5 == 0) {
              i14 = i15;
            }
            i5 = Math.max(i9, i14);
          }
          else
          {
            if (i5 != 0) {
              i15 = i14;
            }
            i8 = Math.max(i8, i15);
            i5 = i9;
          }
          i9 = a((View)localObject2, i16);
          i11 = i17;
          i14 = i9 + i16;
          i9 = i5;
          i5 = i14;
        }
      }
      i5++;
    }
    if ((this.f > 0) && (c(i1))) {
      this.f += this.l;
    }
    if ((arrayOfInt[1] == -1) && (arrayOfInt[0] == -1) && (arrayOfInt[2] == -1) && (arrayOfInt[3] == -1)) {
      break label969;
    }
    i7 = Math.max(i7, Math.max(arrayOfInt[3], Math.max(arrayOfInt[0], Math.max(arrayOfInt[1], arrayOfInt[2]))) + Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))));
    label969:
    int i14 = i7;
    if (bool2) {
      if (i2 != Integer.MIN_VALUE)
      {
        i14 = i7;
        if (i2 != 0) {}
      }
      else
      {
        this.f = 0;
        for (i5 = 0;; i5++)
        {
          i14 = i7;
          if (i5 >= i1) {
            break;
          }
          localObject2 = b(i5);
          if (localObject2 == null)
          {
            this.f += d(i5);
          }
          else
          {
            if (((View)localObject2).getVisibility() != 8) {
              break label1069;
            }
            i5 += a((View)localObject2, i5);
          }
          for (;;)
          {
            break;
            label1069:
            localObject3 = (a)((View)localObject2).getLayoutParams();
            if (i4 != 0)
            {
              this.f += ((ViewGroup.MarginLayoutParams)localObject3).leftMargin + i6 + ((ViewGroup.MarginLayoutParams)localObject3).rightMargin + b((View)localObject2);
            }
            else
            {
              i14 = this.f;
              this.f = Math.max(i14, i14 + i6 + ((ViewGroup.MarginLayoutParams)localObject3).leftMargin + ((ViewGroup.MarginLayoutParams)localObject3).rightMargin + b((View)localObject2));
            }
          }
        }
      }
    }
    this.f += getPaddingLeft() + getPaddingRight();
    int i16 = View.resolveSizeAndState(Math.max(this.f, getSuggestedMinimumWidth()), paramInt1, 0);
    int i15 = (0xFFFFFF & i16) - this.f;
    if ((i10 == 0) && ((i15 == 0) || (f1 <= 0.0F)))
    {
      i7 = Math.max(i8, i9);
      if ((bool2) && (i2 != 1073741824)) {
        for (i8 = 0; i8 < i1; i8++)
        {
          localObject1 = b(i8);
          if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (((a)((View)localObject1).getLayoutParams()).a > 0.0F)) {
            ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredHeight(), 1073741824));
          }
        }
      }
      i5 = i1;
      i8 = i14;
      i6 = i7;
    }
    else
    {
      float f2 = this.g;
      if (f2 > 0.0F) {
        f1 = f2;
      }
      arrayOfInt[3] = -1;
      arrayOfInt[2] = -1;
      arrayOfInt[1] = -1;
      arrayOfInt[0] = -1;
      localObject1[3] = -1;
      localObject1[2] = -1;
      localObject1[1] = -1;
      localObject1[0] = -1;
      this.f = 0;
      i9 = -1;
      i10 = 0;
      i5 = i12;
      i6 = i1;
      i7 = i8;
      i12 = i11;
      i8 = i15;
      for (i11 = i10; i11 < i6; i11++)
      {
        localObject3 = b(i11);
        if ((localObject3 != null) && (((View)localObject3).getVisibility() != 8))
        {
          localObject2 = (a)((View)localObject3).getLayoutParams();
          f2 = ((a)localObject2).a;
          if (f2 > 0.0F)
          {
            i14 = (int)(i8 * f2 / f1);
            i15 = ViewGroup.getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams)localObject2).topMargin + ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin, ((ViewGroup.MarginLayoutParams)localObject2).height);
            if ((((ViewGroup.MarginLayoutParams)localObject2).width == 0) && (i2 == 1073741824))
            {
              if (i14 > 0) {
                i10 = i14;
              } else {
                i10 = 0;
              }
              ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i15);
            }
            else
            {
              i1 = ((View)localObject3).getMeasuredWidth() + i14;
              i10 = i1;
              if (i1 < 0) {
                i10 = 0;
              }
              ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i15);
            }
            i12 = View.combineMeasuredStates(i12, ((View)localObject3).getMeasuredState() & 0xFF000000);
            f1 -= f2;
            i8 -= i14;
          }
          if (i4 != 0)
          {
            this.f += ((View)localObject3).getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)localObject2).leftMargin + ((ViewGroup.MarginLayoutParams)localObject2).rightMargin + b((View)localObject3);
          }
          else
          {
            i10 = this.f;
            this.f = Math.max(i10, ((View)localObject3).getMeasuredWidth() + i10 + ((ViewGroup.MarginLayoutParams)localObject2).leftMargin + ((ViewGroup.MarginLayoutParams)localObject2).rightMargin + b((View)localObject3));
          }
          if ((i3 != 1073741824) && (((ViewGroup.MarginLayoutParams)localObject2).height == -1)) {
            i10 = 1;
          } else {
            i10 = 0;
          }
          i15 = ((ViewGroup.MarginLayoutParams)localObject2).topMargin + ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin;
          i1 = ((View)localObject3).getMeasuredHeight() + i15;
          i14 = Math.max(i9, i1);
          if (i10 != 0) {
            i9 = i15;
          } else {
            i9 = i1;
          }
          i9 = Math.max(i7, i9);
          if ((i5 != 0) && (((ViewGroup.MarginLayoutParams)localObject2).height == -1)) {
            i5 = 1;
          } else {
            i5 = 0;
          }
          if (bool1)
          {
            i15 = ((View)localObject3).getBaseline();
            if (i15 != -1)
            {
              i10 = ((a)localObject2).b;
              i7 = i10;
              if (i10 < 0) {
                i7 = this.e;
              }
              i7 = ((i7 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              arrayOfInt[i7] = Math.max(arrayOfInt[i7], i15);
              localObject1[i7] = Math.max(localObject1[i7], i1 - i15);
            }
          }
          i7 = i9;
          i9 = i14;
        }
      }
      this.f += getPaddingLeft() + getPaddingRight();
      if ((arrayOfInt[1] == -1) && (arrayOfInt[0] == -1) && (arrayOfInt[2] == -1) && (arrayOfInt[3] == -1)) {
        i8 = i9;
      } else {
        i8 = Math.max(i9, Math.max(arrayOfInt[3], Math.max(arrayOfInt[0], Math.max(arrayOfInt[1], arrayOfInt[2]))) + Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))));
      }
      i11 = i12;
      i12 = i5;
      i5 = i6;
      i6 = i7;
    }
    if ((i12 == 0) && (i3 != 1073741824)) {
      i8 = i6;
    }
    setMeasuredDimension(i16 | i11 & 0xFF000000, View.resolveSizeAndState(Math.max(i8 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), paramInt2, i11 << 16));
    if (i13 != 0) {
      c(i5, paramInt1);
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = Fb.a(this);
    int i1 = getPaddingTop();
    int i2 = paramInt4 - paramInt2;
    int i3 = getPaddingBottom();
    int i4 = getPaddingBottom();
    int i5 = getVirtualChildCount();
    paramInt4 = this.e;
    paramInt2 = paramInt4 & 0x70;
    boolean bool2 = this.a;
    int[] arrayOfInt1 = this.i;
    int[] arrayOfInt2 = this.j;
    paramInt4 = f.a(0x800007 & paramInt4, y.l(this));
    if (paramInt4 != 1)
    {
      if (paramInt4 != 5) {
        paramInt1 = getPaddingLeft();
      } else {
        paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - this.f;
      }
    }
    else {
      paramInt1 = getPaddingLeft() + (paramInt3 - paramInt1 - this.f) / 2;
    }
    int i6;
    int i7;
    if (bool1)
    {
      i6 = i5 - 1;
      i7 = -1;
    }
    else
    {
      i6 = 0;
      i7 = 1;
    }
    paramInt4 = 0;
    paramInt3 = i1;
    while (paramInt4 < i5)
    {
      int i8 = i6 + i7 * paramInt4;
      View localView = b(i8);
      if (localView == null)
      {
        paramInt1 += d(i8);
      }
      else if (localView.getVisibility() != 8)
      {
        int i9 = localView.getMeasuredWidth();
        int i10 = localView.getMeasuredHeight();
        a locala = (a)localView.getLayoutParams();
        if ((bool2) && (locala.height != -1)) {
          i11 = localView.getBaseline();
        } else {
          i11 = -1;
        }
        int i12 = locala.b;
        int i13 = i12;
        if (i12 < 0) {
          i13 = paramInt2;
        }
        i13 &= 0x70;
        if (i13 != 16)
        {
          if (i13 != 48)
          {
            if (i13 != 80) {
              i13 = paramInt3;
            }
            for (;;)
            {
              break;
              i12 = i2 - i3 - i10 - locala.bottomMargin;
              i13 = i12;
              if (i11 != -1)
              {
                i13 = localView.getMeasuredHeight();
                i13 = i12 - (arrayOfInt2[2] - (i13 - i11));
              }
            }
          }
          i13 = locala.topMargin + paramInt3;
          if (i11 != -1) {
            i13 += arrayOfInt1[1] - i11;
          }
        }
        else
        {
          i13 = (i2 - i1 - i4 - i10) / 2 + paramInt3 + locala.topMargin - locala.bottomMargin;
        }
        int i11 = paramInt1;
        if (c(i8)) {
          i11 = paramInt1 + this.l;
        }
        paramInt1 = locala.leftMargin + i11;
        a(localView, paramInt1 + a(localView), i13, i9, i10);
        i11 = locala.rightMargin;
        i13 = b(localView);
        paramInt4 += a(localView, i8);
        paramInt1 += i9 + i11 + i13;
      }
      paramInt4++;
    }
  }
  
  void a(Canvas paramCanvas)
  {
    int i1 = getVirtualChildCount();
    boolean bool = Fb.a(this);
    View localView;
    a locala;
    int i3;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localView = b(i2);
      if ((localView != null) && (localView.getVisibility() != 8) && (c(i2)))
      {
        locala = (a)localView.getLayoutParams();
        if (bool) {
          i3 = localView.getRight() + locala.rightMargin;
        } else {
          i3 = localView.getLeft() - locala.leftMargin - this.l;
        }
        b(paramCanvas, i3);
      }
    }
    if (c(i1))
    {
      localView = b(i1 - 1);
      if (localView == null)
      {
        if (bool)
        {
          i2 = getPaddingLeft();
          break label223;
        }
        i2 = getWidth() - getPaddingRight();
        i3 = this.l;
      }
      else
      {
        locala = (a)localView.getLayoutParams();
        if (!bool) {
          break label210;
        }
        i2 = localView.getLeft() - locala.leftMargin;
        i3 = this.l;
      }
      i2 -= i3;
      break label223;
      label210:
      i2 = localView.getRight() + locala.rightMargin;
      label223:
      b(paramCanvas, i2);
    }
  }
  
  void a(Canvas paramCanvas, int paramInt)
  {
    this.k.setBounds(getPaddingLeft() + this.o, paramInt, getWidth() - getPaddingRight() - this.o, this.m + paramInt);
    this.k.draw(paramCanvas);
  }
  
  void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  int b(View paramView)
  {
    return 0;
  }
  
  View b(int paramInt)
  {
    return getChildAt(paramInt);
  }
  
  void b(int paramInt1, int paramInt2)
  {
    this.f = 0;
    int i1 = getVirtualChildCount();
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = this.b;
    boolean bool = this.h;
    float f1 = 0.0F;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 1;
    int i13 = 0;
    Object localObject1;
    Object localObject2;
    int i16;
    int i17;
    while (i10 < i1)
    {
      localObject1 = b(i10);
      if (localObject1 == null) {
        this.f += d(i10);
      }
      for (;;)
      {
        break;
        if (((View)localObject1).getVisibility() == 8)
        {
          i10 += a((View)localObject1, i10);
        }
        else
        {
          if (c(i10)) {
            this.f += this.m;
          }
          localObject2 = (a)((View)localObject1).getLayoutParams();
          f1 += ((a)localObject2).a;
          if ((i3 == 1073741824) && (((ViewGroup.MarginLayoutParams)localObject2).height == 0) && (((a)localObject2).a > 0.0F))
          {
            i11 = this.f;
            this.f = Math.max(i11, ((ViewGroup.MarginLayoutParams)localObject2).topMargin + i11 + ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin);
            i11 = 1;
          }
          else
          {
            if ((((ViewGroup.MarginLayoutParams)localObject2).height == 0) && (((a)localObject2).a > 0.0F))
            {
              ((ViewGroup.MarginLayoutParams)localObject2).height = -2;
              i14 = 0;
            }
            else
            {
              i14 = Integer.MIN_VALUE;
            }
            if (f1 == 0.0F) {
              i15 = this.f;
            } else {
              i15 = 0;
            }
            a((View)localObject1, i10, paramInt1, 0, paramInt2, i15);
            if (i14 != Integer.MIN_VALUE) {
              ((ViewGroup.MarginLayoutParams)localObject2).height = i14;
            }
            i15 = ((View)localObject1).getMeasuredHeight();
            i14 = this.f;
            this.f = Math.max(i14, i14 + i15 + ((ViewGroup.MarginLayoutParams)localObject2).topMargin + ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin + b((View)localObject1));
            if (bool) {
              i7 = Math.max(i15, i7);
            }
          }
          i16 = i10;
          if ((i4 >= 0) && (i4 == i16 + 1)) {
            this.c = this.f;
          }
          if ((i16 < i4) && (((a)localObject2).a > 0.0F)) {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
          }
          if ((i2 != 1073741824) && (((ViewGroup.MarginLayoutParams)localObject2).width == -1))
          {
            i10 = 1;
            i13 = 1;
          }
          else
          {
            i10 = 0;
          }
          i14 = ((ViewGroup.MarginLayoutParams)localObject2).leftMargin + ((ViewGroup.MarginLayoutParams)localObject2).rightMargin;
          i15 = ((View)localObject1).getMeasuredWidth() + i14;
          i6 = Math.max(i6, i15);
          i17 = View.combineMeasuredStates(i5, ((View)localObject1).getMeasuredState());
          if ((i12 != 0) && (((ViewGroup.MarginLayoutParams)localObject2).width == -1)) {
            i5 = 1;
          } else {
            i5 = 0;
          }
          if (((a)localObject2).a > 0.0F)
          {
            if (i10 == 0) {
              i14 = i15;
            }
            i8 = Math.max(i8, i14);
            i12 = i9;
            i9 = i8;
          }
          else
          {
            if (i10 == 0) {
              i14 = i15;
            }
            i12 = Math.max(i9, i14);
            i9 = i8;
          }
          i14 = a((View)localObject1, i16);
          i10 = i5;
          i8 = i9;
          i9 = i12;
          i5 = i17;
          i14 += i16;
          i12 = i10;
          i10 = i14;
        }
      }
      i10++;
    }
    if ((this.f > 0) && (c(i1))) {
      this.f += this.m;
    }
    if (bool)
    {
      i10 = i3;
      if ((i10 == Integer.MIN_VALUE) || (i10 == 0))
      {
        this.f = 0;
        for (i10 = 0; i10 < i1; i10++)
        {
          localObject2 = b(i10);
          if (localObject2 == null)
          {
            this.f += d(i10);
          }
          else if (((View)localObject2).getVisibility() == 8)
          {
            i10 += a((View)localObject2, i10);
          }
          else
          {
            localObject1 = (a)((View)localObject2).getLayoutParams();
            i14 = this.f;
            this.f = Math.max(i14, i14 + i7 + ((ViewGroup.MarginLayoutParams)localObject1).topMargin + ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin + b((View)localObject2));
          }
        }
      }
    }
    i10 = i3;
    this.f += getPaddingTop() + getPaddingBottom();
    int i15 = View.resolveSizeAndState(Math.max(this.f, getSuggestedMinimumHeight()), paramInt2, 0);
    int i14 = (0xFFFFFF & i15) - this.f;
    if ((i11 == 0) && ((i14 == 0) || (f1 <= 0.0F)))
    {
      i9 = Math.max(i9, i8);
      if ((bool) && (i10 != 1073741824)) {
        for (i3 = 0; i3 < i1; i3++)
        {
          localObject1 = b(i3);
          if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (((a)((View)localObject1).getLayoutParams()).a > 0.0F)) {
            ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
          }
        }
      }
      i3 = i5;
      i5 = i9;
      i9 = i6;
    }
    else
    {
      float f2 = this.g;
      if (f2 > 0.0F) {
        f1 = f2;
      }
      this.f = 0;
      i8 = 0;
      i3 = i9;
      i7 = i14;
      i9 = i6;
      while (i8 < i1)
      {
        localObject1 = b(i8);
        if (((View)localObject1).getVisibility() != 8)
        {
          localObject2 = (a)((View)localObject1).getLayoutParams();
          f2 = ((a)localObject2).a;
          if (f2 > 0.0F)
          {
            i6 = (int)(i7 * f2 / f1);
            i14 = getPaddingLeft();
            i16 = getPaddingRight();
            i11 = i7 - i6;
            i7 = ((ViewGroup.MarginLayoutParams)localObject2).leftMargin;
            i17 = ((ViewGroup.MarginLayoutParams)localObject2).rightMargin;
            i4 = ((ViewGroup.MarginLayoutParams)localObject2).width;
            f1 -= f2;
            i14 = ViewGroup.getChildMeasureSpec(paramInt1, i14 + i16 + i7 + i17, i4);
            if ((((ViewGroup.MarginLayoutParams)localObject2).height == 0) && (i10 == 1073741824))
            {
              if (i6 > 0) {
                i7 = i6;
              } else {
                i7 = 0;
              }
              ((View)localObject1).measure(i14, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            }
            else
            {
              i6 = ((View)localObject1).getMeasuredHeight() + i6;
              i7 = i6;
              if (i6 < 0) {
                i7 = 0;
              }
              ((View)localObject1).measure(i14, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            }
            i5 = View.combineMeasuredStates(i5, ((View)localObject1).getMeasuredState() & 0xFF00);
            i7 = i11;
          }
          i6 = ((ViewGroup.MarginLayoutParams)localObject2).leftMargin + ((ViewGroup.MarginLayoutParams)localObject2).rightMargin;
          i14 = ((View)localObject1).getMeasuredWidth() + i6;
          i11 = Math.max(i9, i14);
          if ((i2 != 1073741824) && (((ViewGroup.MarginLayoutParams)localObject2).width == -1)) {
            i9 = 1;
          } else {
            i9 = 0;
          }
          if (i9 != 0) {
            i9 = i6;
          } else {
            i9 = i14;
          }
          i9 = Math.max(i3, i9);
          if ((i12 != 0) && (((ViewGroup.MarginLayoutParams)localObject2).width == -1)) {
            i3 = 1;
          } else {
            i3 = 0;
          }
          i12 = this.f;
          this.f = Math.max(i12, ((View)localObject1).getMeasuredHeight() + i12 + ((ViewGroup.MarginLayoutParams)localObject2).topMargin + ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin + b((View)localObject1));
          i12 = i3;
          i3 = i9;
          i9 = i11;
        }
        i8++;
      }
      this.f += getPaddingTop() + getPaddingBottom();
      i7 = i3;
      i3 = i5;
      i5 = i7;
    }
    if ((i12 != 0) || (i2 == 1073741824)) {
      i5 = i9;
    }
    setMeasuredDimension(View.resolveSizeAndState(Math.max(i5 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), paramInt1, i3), i15);
    if (i13 != 0) {
      d(i1, paramInt2);
    }
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getPaddingLeft();
    int i2 = paramInt3 - paramInt1;
    int i3 = getPaddingRight();
    int i4 = getPaddingRight();
    int i5 = getVirtualChildCount();
    int i6 = this.e;
    paramInt1 = i6 & 0x70;
    if (paramInt1 != 16)
    {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.f;
      }
    }
    else {
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - this.f) / 2;
    }
    paramInt2 = 0;
    while (paramInt2 < i5)
    {
      View localView = b(paramInt2);
      if (localView == null)
      {
        paramInt3 = paramInt1 + d(paramInt2);
        paramInt4 = paramInt2;
      }
      else
      {
        paramInt3 = paramInt1;
        paramInt4 = paramInt2;
        if (localView.getVisibility() != 8)
        {
          int i7 = localView.getMeasuredWidth();
          int i8 = localView.getMeasuredHeight();
          a locala = (a)localView.getLayoutParams();
          paramInt4 = locala.b;
          paramInt3 = paramInt4;
          if (paramInt4 < 0) {
            paramInt3 = i6 & 0x800007;
          }
          paramInt3 = f.a(paramInt3, y.l(this)) & 0x7;
          if (paramInt3 != 1) {
            if (paramInt3 != 5) {
              paramInt3 = locala.leftMargin + i1;
            }
          }
          for (;;)
          {
            break;
            paramInt3 = i2 - i3 - i7;
            paramInt4 = locala.rightMargin;
            break label274;
            paramInt3 = (i2 - i1 - i4 - i7) / 2 + i1 + locala.leftMargin;
            paramInt4 = locala.rightMargin;
            label274:
            paramInt3 -= paramInt4;
          }
          paramInt4 = paramInt1;
          if (c(paramInt2)) {
            paramInt4 = paramInt1 + this.m;
          }
          paramInt1 = paramInt4 + locala.topMargin;
          a(localView, paramInt3, paramInt1 + a(localView), i7, i8);
          i7 = locala.bottomMargin;
          paramInt3 = b(localView);
          paramInt4 = paramInt2 + a(localView, paramInt2);
          paramInt3 = paramInt1 + (i8 + i7 + paramInt3);
        }
      }
      paramInt2 = paramInt4 + 1;
      paramInt1 = paramInt3;
    }
  }
  
  void b(Canvas paramCanvas)
  {
    int i1 = getVirtualChildCount();
    Object localObject1;
    Object localObject2;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject1 = b(i2);
      if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (c(i2)))
      {
        localObject2 = (a)((View)localObject1).getLayoutParams();
        a(paramCanvas, ((View)localObject1).getTop() - ((ViewGroup.MarginLayoutParams)localObject2).topMargin - this.m);
      }
    }
    if (c(i1))
    {
      localObject2 = b(i1 - 1);
      if (localObject2 == null)
      {
        i2 = getHeight() - getPaddingBottom() - this.m;
      }
      else
      {
        localObject1 = (a)((View)localObject2).getLayoutParams();
        i2 = ((View)localObject2).getBottom() + ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
      }
      a(paramCanvas, i2);
    }
  }
  
  void b(Canvas paramCanvas, int paramInt)
  {
    this.k.setBounds(paramInt, getPaddingTop() + this.o, this.l + paramInt, getHeight() - getPaddingBottom() - this.o);
    this.k.draw(paramCanvas);
  }
  
  protected boolean c(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramInt == 0)
    {
      if ((this.n & 0x1) != 0) {
        bool3 = true;
      }
      return bool3;
    }
    if (paramInt == getChildCount())
    {
      bool3 = bool1;
      if ((this.n & 0x4) != 0) {
        bool3 = true;
      }
      return bool3;
    }
    bool3 = bool2;
    if ((this.n & 0x2) != 0)
    {
      paramInt--;
      for (;;)
      {
        bool3 = bool2;
        if (paramInt < 0) {
          break;
        }
        if (getChildAt(paramInt).getVisibility() != 8)
        {
          bool3 = true;
          break;
        }
        paramInt--;
      }
    }
    return bool3;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof a;
  }
  
  int d(int paramInt)
  {
    return 0;
  }
  
  protected a generateDefaultLayoutParams()
  {
    int i1 = this.d;
    if (i1 == 0) {
      return new a(-2, -2);
    }
    if (i1 == 1) {
      return new a(-1, -2);
    }
    return null;
  }
  
  public a generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new a(getContext(), paramAttributeSet);
  }
  
  protected a generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new a(paramLayoutParams);
  }
  
  public int getBaseline()
  {
    if (this.b < 0) {
      return super.getBaseline();
    }
    int i1 = getChildCount();
    int i2 = this.b;
    if (i1 > i2)
    {
      View localView = getChildAt(i2);
      int i3 = localView.getBaseline();
      if (i3 == -1)
      {
        if (this.b == 0) {
          return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
      }
      i2 = this.c;
      i1 = i2;
      if (this.d == 1)
      {
        int i4 = this.e & 0x70;
        i1 = i2;
        if (i4 != 48) {
          if (i4 != 16)
          {
            if (i4 != 80) {
              i1 = i2;
            } else {
              i1 = getBottom() - getTop() - getPaddingBottom() - this.f;
            }
          }
          else {
            i1 = i2 + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.f) / 2;
          }
        }
      }
      return i1 + ((a)localView.getLayoutParams()).topMargin + i3;
    }
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
  }
  
  public int getBaselineAlignedChildIndex()
  {
    return this.b;
  }
  
  public Drawable getDividerDrawable()
  {
    return this.k;
  }
  
  public int getDividerPadding()
  {
    return this.o;
  }
  
  public int getDividerWidth()
  {
    return this.l;
  }
  
  public int getGravity()
  {
    return this.e;
  }
  
  public int getOrientation()
  {
    return this.d;
  }
  
  public int getShowDividers()
  {
    return this.n;
  }
  
  int getVirtualChildCount()
  {
    return getChildCount();
  }
  
  public float getWeightSum()
  {
    return this.g;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.k == null) {
      return;
    }
    if (this.d == 1) {
      b(paramCanvas);
    } else {
      a(paramCanvas);
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(pa.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(pa.class.getName());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.d == 1) {
      b(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      a(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.d == 1) {
      b(paramInt1, paramInt2);
    } else {
      a(paramInt1, paramInt2);
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < getChildCount()))
    {
      this.b = paramInt;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("base aligned child index out of range (0, ");
    localStringBuilder.append(getChildCount());
    localStringBuilder.append(")");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == this.k) {
      return;
    }
    this.k = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null)
    {
      this.l = paramDrawable.getIntrinsicWidth();
      this.m = paramDrawable.getIntrinsicHeight();
    }
    else
    {
      this.l = 0;
      this.m = 0;
    }
    if (paramDrawable == null) {
      bool = true;
    }
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt)
  {
    this.o = paramInt;
  }
  
  public void setGravity(int paramInt)
  {
    if (this.e != paramInt)
    {
      int i1 = paramInt;
      if ((0x800007 & paramInt) == 0) {
        i1 = paramInt | 0x800003;
      }
      paramInt = i1;
      if ((i1 & 0x70) == 0) {
        paramInt = i1 | 0x30;
      }
      this.e = paramInt;
      requestLayout();
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    paramInt &= 0x800007;
    int i1 = this.e;
    if ((0x800007 & i1) != paramInt)
    {
      this.e = (paramInt | 0xFF7FFFF8 & i1);
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    if (paramInt != this.n) {
      requestLayout();
    }
    this.n = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    int i1 = paramInt & 0x70;
    paramInt = this.e;
    if ((paramInt & 0x70) != i1)
    {
      this.e = (i1 | paramInt & 0xFFFFFF8F);
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    this.g = Math.max(0.0F, paramFloat);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public static class a
    extends ViewGroup.MarginLayoutParams
  {
    public float a;
    public int b = -1;
    
    public a(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.a = 0.0F;
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Pd.LinearLayoutCompat_Layout);
      this.a = paramContext.getFloat(Pd.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
      this.b = paramContext.getInt(Pd.LinearLayoutCompat_Layout_android_layout_gravity, -1);
      paramContext.recycle();
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/pa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */