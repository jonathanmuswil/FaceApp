package android.support.v7.widget;

import Gd;
import Pd;
import Vd;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.y;
import android.support.v4.widget.C;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import de;
import java.util.List;

public class SwitchCompat
  extends CompoundButton
{
  private static final Property<SwitchCompat, Float> a = new jb(Float.class, "thumbPos");
  private static final int[] b = { 16842912 };
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F;
  private int G;
  private final TextPaint H = new TextPaint(1);
  private ColorStateList I;
  private Layout J;
  private Layout K;
  private TransformationMethod L;
  ObjectAnimator M;
  private final Rect N = new Rect();
  private Drawable c;
  private ColorStateList d = null;
  private PorterDuff.Mode e = null;
  private boolean f = false;
  private boolean g = false;
  private Drawable h;
  private ColorStateList i = null;
  private PorterDuff.Mode j = null;
  private boolean k = false;
  private boolean l = false;
  private int m;
  private int n;
  private int o;
  private boolean p;
  private CharSequence q;
  private CharSequence r;
  private boolean s;
  private int t;
  private int u;
  private float v;
  private float w;
  private VelocityTracker x = VelocityTracker.obtain();
  private int y;
  float z;
  
  public SwitchCompat(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.switchStyle);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = getResources();
    this.H.density = ((Resources)localObject).getDisplayMetrics().density;
    paramAttributeSet = pb.a(paramContext, paramAttributeSet, Pd.SwitchCompat, paramInt, 0);
    this.c = paramAttributeSet.b(Pd.SwitchCompat_android_thumb);
    localObject = this.c;
    if (localObject != null) {
      ((Drawable)localObject).setCallback(this);
    }
    this.h = paramAttributeSet.b(Pd.SwitchCompat_track);
    localObject = this.h;
    if (localObject != null) {
      ((Drawable)localObject).setCallback(this);
    }
    this.q = paramAttributeSet.e(Pd.SwitchCompat_android_textOn);
    this.r = paramAttributeSet.e(Pd.SwitchCompat_android_textOff);
    this.s = paramAttributeSet.a(Pd.SwitchCompat_showText, true);
    this.m = paramAttributeSet.c(Pd.SwitchCompat_thumbTextPadding, 0);
    this.n = paramAttributeSet.c(Pd.SwitchCompat_switchMinWidth, 0);
    this.o = paramAttributeSet.c(Pd.SwitchCompat_switchPadding, 0);
    this.p = paramAttributeSet.a(Pd.SwitchCompat_splitTrack, false);
    localObject = paramAttributeSet.a(Pd.SwitchCompat_thumbTint);
    if (localObject != null)
    {
      this.d = ((ColorStateList)localObject);
      this.f = true;
    }
    localObject = fa.a(paramAttributeSet.d(Pd.SwitchCompat_thumbTintMode, -1), null);
    if (this.e != localObject)
    {
      this.e = ((PorterDuff.Mode)localObject);
      this.g = true;
    }
    if ((this.f) || (this.g)) {
      a();
    }
    localObject = paramAttributeSet.a(Pd.SwitchCompat_trackTint);
    if (localObject != null)
    {
      this.i = ((ColorStateList)localObject);
      this.k = true;
    }
    localObject = fa.a(paramAttributeSet.d(Pd.SwitchCompat_trackTintMode, -1), null);
    if (this.j != localObject)
    {
      this.j = ((PorterDuff.Mode)localObject);
      this.l = true;
    }
    if ((this.k) || (this.l)) {
      b();
    }
    paramInt = paramAttributeSet.g(Pd.SwitchCompat_switchTextAppearance, 0);
    if (paramInt != 0) {
      a(paramContext, paramInt);
    }
    paramAttributeSet.a();
    paramContext = ViewConfiguration.get(paramContext);
    this.u = paramContext.getScaledTouchSlop();
    this.y = paramContext.getScaledMinimumFlingVelocity();
    refreshDrawableState();
    setChecked(isChecked());
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 >= paramFloat2)
    {
      paramFloat2 = paramFloat1;
      if (paramFloat1 > paramFloat3) {
        paramFloat2 = paramFloat3;
      }
    }
    return paramFloat2;
  }
  
  private Layout a(CharSequence paramCharSequence)
  {
    TransformationMethod localTransformationMethod = this.L;
    CharSequence localCharSequence = paramCharSequence;
    if (localTransformationMethod != null) {
      localCharSequence = localTransformationMethod.getTransformation(paramCharSequence, this);
    }
    paramCharSequence = this.H;
    int i1;
    if (localCharSequence != null) {
      i1 = (int)Math.ceil(Layout.getDesiredWidth(localCharSequence, paramCharSequence));
    } else {
      i1 = 0;
    }
    return new StaticLayout(localCharSequence, paramCharSequence, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
  }
  
  private void a()
  {
    if ((this.c != null) && ((this.f) || (this.g)))
    {
      this.c = this.c.mutate();
      if (this.f) {
        a.a(this.c, this.d);
      }
      if (this.g) {
        a.a(this.c, this.e);
      }
      if (this.c.isStateful()) {
        this.c.setState(getDrawableState());
      }
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    Typeface localTypeface;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          localTypeface = null;
        } else {
          localTypeface = Typeface.MONOSPACE;
        }
      }
      else {
        localTypeface = Typeface.SERIF;
      }
    }
    else {
      localTypeface = Typeface.SANS_SERIF;
    }
    a(localTypeface, paramInt2);
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(3);
    super.onTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
  }
  
  private void a(boolean paramBoolean)
  {
    float f1;
    if (paramBoolean) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    this.M = ObjectAnimator.ofFloat(this, a, new float[] { f1 });
    this.M.setDuration(250L);
    if (Build.VERSION.SDK_INT >= 18) {
      this.M.setAutoCancel(true);
    }
    this.M.start();
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    Object localObject = this.c;
    boolean bool1 = false;
    if (localObject == null) {
      return false;
    }
    int i1 = getThumbOffset();
    this.c.getPadding(this.N);
    int i2 = this.E;
    int i3 = this.u;
    int i4 = this.D + i1 - i3;
    int i5 = this.C;
    localObject = this.N;
    i1 = ((Rect)localObject).left;
    int i6 = ((Rect)localObject).right;
    int i7 = this.G;
    boolean bool2 = bool1;
    if (paramFloat1 > i4)
    {
      bool2 = bool1;
      if (paramFloat1 < i5 + i4 + i1 + i6 + i3)
      {
        bool2 = bool1;
        if (paramFloat2 > i2 - i3)
        {
          bool2 = bool1;
          if (paramFloat2 < i7 + i3) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  private void b()
  {
    if ((this.h != null) && ((this.k) || (this.l)))
    {
      this.h = this.h.mutate();
      if (this.k) {
        a.a(this.h, this.i);
      }
      if (this.l) {
        a.a(this.h, this.j);
      }
      if (this.h.isStateful()) {
        this.h.setState(getDrawableState());
      }
    }
  }
  
  private void b(MotionEvent paramMotionEvent)
  {
    this.t = 0;
    int i1 = paramMotionEvent.getAction();
    boolean bool1 = true;
    if ((i1 == 1) && (isEnabled())) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    boolean bool2 = isChecked();
    if (i1 != 0)
    {
      this.x.computeCurrentVelocity(1000);
      float f1 = this.x.getXVelocity();
      if (Math.abs(f1) > this.y)
      {
        if (Fb.a(this) ? f1 >= 0.0F : f1 <= 0.0F) {
          bool1 = false;
        }
      }
      else {
        bool1 = getTargetCheckedState();
      }
    }
    else
    {
      bool1 = bool2;
    }
    if (bool1 != bool2) {
      playSoundEffect(0);
    }
    setChecked(bool1);
    a(paramMotionEvent);
  }
  
  private void c()
  {
    ObjectAnimator localObjectAnimator = this.M;
    if (localObjectAnimator != null) {
      localObjectAnimator.cancel();
    }
  }
  
  private boolean getTargetCheckedState()
  {
    boolean bool;
    if (this.z > 0.5F) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private int getThumbOffset()
  {
    float f1;
    if (Fb.a(this)) {
      f1 = 1.0F - this.z;
    } else {
      f1 = this.z;
    }
    return (int)(f1 * getThumbScrollRange() + 0.5F);
  }
  
  private int getThumbScrollRange()
  {
    Object localObject = this.h;
    if (localObject != null)
    {
      Rect localRect = this.N;
      ((Drawable)localObject).getPadding(localRect);
      localObject = this.c;
      if (localObject != null) {
        localObject = fa.c((Drawable)localObject);
      } else {
        localObject = fa.a;
      }
      return this.A - this.C - localRect.left - localRect.right - ((Rect)localObject).left - ((Rect)localObject).right;
    }
    return 0;
  }
  
  public void a(Context paramContext, int paramInt)
  {
    pb localpb = pb.a(paramContext, paramInt, Pd.TextAppearance);
    paramContext = localpb.a(Pd.TextAppearance_android_textColor);
    if (paramContext != null) {
      this.I = paramContext;
    } else {
      this.I = getTextColors();
    }
    paramInt = localpb.c(Pd.TextAppearance_android_textSize, 0);
    if (paramInt != 0)
    {
      float f1 = paramInt;
      if (f1 != this.H.getTextSize())
      {
        this.H.setTextSize(f1);
        requestLayout();
      }
    }
    a(localpb.d(Pd.TextAppearance_android_typeface, -1), localpb.d(Pd.TextAppearance_android_textStyle, -1));
    if (localpb.a(Pd.TextAppearance_textAllCaps, false)) {
      this.L = new de(getContext());
    } else {
      this.L = null;
    }
    localpb.a();
  }
  
  public void a(Typeface paramTypeface, int paramInt)
  {
    float f1 = 0.0F;
    boolean bool = false;
    if (paramInt > 0)
    {
      if (paramTypeface == null) {
        paramTypeface = Typeface.defaultFromStyle(paramInt);
      } else {
        paramTypeface = Typeface.create(paramTypeface, paramInt);
      }
      setSwitchTypeface(paramTypeface);
      int i1;
      if (paramTypeface != null) {
        i1 = paramTypeface.getStyle();
      } else {
        i1 = 0;
      }
      paramInt = i1 & paramInt;
      paramTypeface = this.H;
      if ((paramInt & 0x1) != 0) {
        bool = true;
      }
      paramTypeface.setFakeBoldText(bool);
      paramTypeface = this.H;
      if ((paramInt & 0x2) != 0) {
        f1 = -0.25F;
      }
      paramTypeface.setTextSkewX(f1);
    }
    else
    {
      this.H.setFakeBoldText(false);
      this.H.setTextSkewX(0.0F);
      setSwitchTypeface(paramTypeface);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = this.N;
    int i1 = this.D;
    int i2 = this.E;
    int i3 = this.F;
    int i4 = this.G;
    int i5 = getThumbOffset() + i1;
    Object localObject = this.c;
    if (localObject != null) {
      localObject = fa.c((Drawable)localObject);
    } else {
      localObject = fa.a;
    }
    Drawable localDrawable = this.h;
    int i6 = i5;
    if (localDrawable != null)
    {
      localDrawable.getPadding(localRect);
      int i7 = localRect.left;
      int i8 = i5 + i7;
      int i9;
      if (localObject != null)
      {
        i5 = ((Rect)localObject).left;
        i6 = i1;
        if (i5 > i7) {
          i6 = i1 + (i5 - i7);
        }
        i5 = ((Rect)localObject).top;
        i7 = localRect.top;
        if (i5 > i7) {
          i5 = i5 - i7 + i2;
        } else {
          i5 = i2;
        }
        i9 = ((Rect)localObject).right;
        i1 = localRect.right;
        i7 = i3;
        if (i9 > i1) {
          i7 = i3 - (i9 - i1);
        }
        int i10 = ((Rect)localObject).bottom;
        int i11 = localRect.bottom;
        i1 = i6;
        i3 = i7;
        i9 = i5;
        if (i10 > i11)
        {
          i3 = i4 - (i10 - i11);
          i1 = i6;
          i6 = i3;
          break label263;
        }
      }
      else
      {
        i9 = i2;
      }
      i6 = i4;
      i5 = i9;
      i7 = i3;
      label263:
      this.h.setBounds(i1, i5, i7, i6);
      i6 = i8;
    }
    localObject = this.c;
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(localRect);
      i5 = i6 - localRect.left;
      i6 = i6 + this.C + localRect.right;
      this.c.setBounds(i5, i2, i6, i4);
      localObject = getBackground();
      if (localObject != null) {
        a.a((Drawable)localObject, i5, i2, i6, i4);
      }
    }
    super.draw(paramCanvas);
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      super.drawableHotspotChanged(paramFloat1, paramFloat2);
    }
    Drawable localDrawable = this.c;
    if (localDrawable != null) {
      a.a(localDrawable, paramFloat1, paramFloat2);
    }
    localDrawable = this.h;
    if (localDrawable != null) {
      a.a(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable localDrawable = this.c;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localDrawable != null)
    {
      bool2 = bool1;
      if (localDrawable.isStateful()) {
        bool2 = false | localDrawable.setState(arrayOfInt);
      }
    }
    localDrawable = this.h;
    bool1 = bool2;
    if (localDrawable != null)
    {
      bool1 = bool2;
      if (localDrawable.isStateful()) {
        bool1 = bool2 | localDrawable.setState(arrayOfInt);
      }
    }
    if (bool1) {
      invalidate();
    }
  }
  
  public int getCompoundPaddingLeft()
  {
    if (!Fb.a(this)) {
      return super.getCompoundPaddingLeft();
    }
    int i1 = super.getCompoundPaddingLeft() + this.A;
    int i2 = i1;
    if (!TextUtils.isEmpty(getText())) {
      i2 = i1 + this.o;
    }
    return i2;
  }
  
  public int getCompoundPaddingRight()
  {
    if (Fb.a(this)) {
      return super.getCompoundPaddingRight();
    }
    int i1 = super.getCompoundPaddingRight() + this.A;
    int i2 = i1;
    if (!TextUtils.isEmpty(getText())) {
      i2 = i1 + this.o;
    }
    return i2;
  }
  
  public boolean getShowText()
  {
    return this.s;
  }
  
  public boolean getSplitTrack()
  {
    return this.p;
  }
  
  public int getSwitchMinWidth()
  {
    return this.n;
  }
  
  public int getSwitchPadding()
  {
    return this.o;
  }
  
  public CharSequence getTextOff()
  {
    return this.r;
  }
  
  public CharSequence getTextOn()
  {
    return this.q;
  }
  
  public Drawable getThumbDrawable()
  {
    return this.c;
  }
  
  public int getThumbTextPadding()
  {
    return this.m;
  }
  
  public ColorStateList getThumbTintList()
  {
    return this.d;
  }
  
  public PorterDuff.Mode getThumbTintMode()
  {
    return this.e;
  }
  
  public Drawable getTrackDrawable()
  {
    return this.h;
  }
  
  public ColorStateList getTrackTintList()
  {
    return this.i;
  }
  
  public PorterDuff.Mode getTrackTintMode()
  {
    return this.j;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Object localObject = this.c;
    if (localObject != null) {
      ((Drawable)localObject).jumpToCurrentState();
    }
    localObject = this.h;
    if (localObject != null) {
      ((Drawable)localObject).jumpToCurrentState();
    }
    localObject = this.M;
    if ((localObject != null) && (((ObjectAnimator)localObject).isStarted()))
    {
      this.M.end();
      this.M = null;
    }
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked()) {
      CompoundButton.mergeDrawableStates(arrayOfInt, b);
    }
    return arrayOfInt;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Object localObject1 = this.N;
    Object localObject2 = this.h;
    if (localObject2 != null) {
      ((Drawable)localObject2).getPadding((Rect)localObject1);
    } else {
      ((Rect)localObject1).setEmpty();
    }
    int i1 = this.E;
    int i2 = this.G;
    int i3 = ((Rect)localObject1).top;
    int i4 = ((Rect)localObject1).bottom;
    Object localObject3 = this.c;
    Object localObject4;
    int i5;
    if (localObject2 != null) {
      if ((this.p) && (localObject3 != null))
      {
        localObject4 = fa.c((Drawable)localObject3);
        ((Drawable)localObject3).copyBounds((Rect)localObject1);
        ((Rect)localObject1).left += ((Rect)localObject4).left;
        ((Rect)localObject1).right -= ((Rect)localObject4).right;
        i5 = paramCanvas.save();
        paramCanvas.clipRect((Rect)localObject1, Region.Op.DIFFERENCE);
        ((Drawable)localObject2).draw(paramCanvas);
        paramCanvas.restoreToCount(i5);
      }
      else
      {
        ((Drawable)localObject2).draw(paramCanvas);
      }
    }
    int i6 = paramCanvas.save();
    if (localObject3 != null) {
      ((Drawable)localObject3).draw(paramCanvas);
    }
    if (getTargetCheckedState()) {
      localObject4 = this.J;
    } else {
      localObject4 = this.K;
    }
    if (localObject4 != null)
    {
      localObject2 = getDrawableState();
      localObject1 = this.I;
      if (localObject1 != null) {
        this.H.setColor(((ColorStateList)localObject1).getColorForState((int[])localObject2, 0));
      }
      this.H.drawableState = ((int[])localObject2);
      if (localObject3 != null)
      {
        localObject3 = ((Drawable)localObject3).getBounds();
        i5 = ((Rect)localObject3).left + ((Rect)localObject3).right;
      }
      else
      {
        i5 = getWidth();
      }
      int i7 = i5 / 2;
      i5 = ((Layout)localObject4).getWidth() / 2;
      i2 = (i1 + i3 + (i2 - i4)) / 2;
      i4 = ((Layout)localObject4).getHeight() / 2;
      paramCanvas.translate(i7 - i5, i2 - i4);
      ((Layout)localObject4).draw(paramCanvas);
    }
    paramCanvas.restoreToCount(i6);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
    CharSequence localCharSequence1;
    if (isChecked()) {
      localCharSequence1 = this.q;
    } else {
      localCharSequence1 = this.r;
    }
    if (!TextUtils.isEmpty(localCharSequence1))
    {
      CharSequence localCharSequence2 = paramAccessibilityNodeInfo.getText();
      if (TextUtils.isEmpty(localCharSequence2))
      {
        paramAccessibilityNodeInfo.setText(localCharSequence1);
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localCharSequence2);
        localStringBuilder.append(' ');
        localStringBuilder.append(localCharSequence1);
        paramAccessibilityNodeInfo.setText(localStringBuilder);
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject1 = this.c;
    paramInt1 = 0;
    if (localObject1 != null)
    {
      localObject1 = this.N;
      Object localObject2 = this.h;
      if (localObject2 != null) {
        ((Drawable)localObject2).getPadding((Rect)localObject1);
      } else {
        ((Rect)localObject1).setEmpty();
      }
      localObject2 = fa.c(this.c);
      paramInt2 = Math.max(0, ((Rect)localObject2).left - ((Rect)localObject1).left);
      paramInt1 = Math.max(0, ((Rect)localObject2).right - ((Rect)localObject1).right);
    }
    else
    {
      paramInt2 = 0;
    }
    if (Fb.a(this))
    {
      paramInt3 = getPaddingLeft() + paramInt2;
      paramInt2 = this.A + paramInt3 - paramInt2 - paramInt1;
    }
    else
    {
      paramInt3 = getWidth() - getPaddingRight() - paramInt1;
      paramInt1 = paramInt3 - this.A + paramInt2 + paramInt1;
      paramInt2 = paramInt3;
      paramInt3 = paramInt1;
    }
    paramInt1 = getGravity() & 0x70;
    if (paramInt1 != 16) {
      if (paramInt1 != 80)
      {
        paramInt1 = getPaddingTop();
        paramInt4 = this.B;
      }
    }
    for (;;)
    {
      paramInt4 += paramInt1;
      break;
      paramInt4 = getHeight() - getPaddingBottom();
      paramInt1 = paramInt4 - this.B;
      break;
      paramInt1 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2;
      paramInt4 = this.B;
      paramInt1 -= paramInt4 / 2;
    }
    this.D = paramInt3;
    this.E = paramInt1;
    this.G = paramInt4;
    this.F = paramInt2;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.s)
    {
      if (this.J == null) {
        this.J = a(this.q);
      }
      if (this.K == null) {
        this.K = a(this.r);
      }
    }
    Object localObject = this.N;
    Drawable localDrawable = this.c;
    int i1 = 0;
    int i2;
    if (localDrawable != null)
    {
      localDrawable.getPadding((Rect)localObject);
      i2 = this.c.getIntrinsicWidth() - ((Rect)localObject).left - ((Rect)localObject).right;
      i3 = this.c.getIntrinsicHeight();
    }
    else
    {
      i2 = 0;
      i3 = 0;
    }
    if (this.s) {
      i4 = Math.max(this.J.getWidth(), this.K.getWidth()) + this.m * 2;
    } else {
      i4 = 0;
    }
    this.C = Math.max(i4, i2);
    localDrawable = this.h;
    if (localDrawable != null)
    {
      localDrawable.getPadding((Rect)localObject);
      i2 = this.h.getIntrinsicHeight();
    }
    else
    {
      ((Rect)localObject).setEmpty();
      i2 = i1;
    }
    int i5 = ((Rect)localObject).left;
    int i6 = ((Rect)localObject).right;
    localObject = this.c;
    i1 = i6;
    int i4 = i5;
    if (localObject != null)
    {
      localObject = fa.c((Drawable)localObject);
      i4 = Math.max(i5, ((Rect)localObject).left);
      i1 = Math.max(i6, ((Rect)localObject).right);
    }
    i4 = Math.max(this.n, this.C * 2 + i4 + i1);
    int i3 = Math.max(i2, i3);
    this.A = i4;
    this.B = i3;
    super.onMeasure(paramInt1, paramInt2);
    if (getMeasuredHeight() < i3) {
      setMeasuredDimension(getMeasuredWidthAndState(), i3);
    }
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    CharSequence localCharSequence;
    if (isChecked()) {
      localCharSequence = this.q;
    } else {
      localCharSequence = this.r;
    }
    if (localCharSequence != null) {
      paramAccessibilityEvent.getText().add(localCharSequence);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.x.addMovement(paramMotionEvent);
    int i1 = paramMotionEvent.getActionMasked();
    float f2;
    float f3;
    if (i1 != 0)
    {
      if (i1 != 1) {
        if (i1 != 2)
        {
          if (i1 != 3) {
            break label322;
          }
        }
        else
        {
          i1 = this.t;
          if (i1 == 0) {
            break label322;
          }
          if (i1 != 1)
          {
            if (i1 != 2) {
              break label322;
            }
            float f1 = paramMotionEvent.getX();
            i1 = getThumbScrollRange();
            f2 = f1 - this.v;
            if (i1 != 0) {
              f2 /= i1;
            } else if (f2 > 0.0F) {
              f2 = 1.0F;
            } else {
              f2 = -1.0F;
            }
            f3 = f2;
            if (Fb.a(this)) {
              f3 = -f2;
            }
            f2 = a(this.z + f3, 0.0F, 1.0F);
            if (f2 != this.z)
            {
              this.v = f1;
              setThumbPosition(f2);
            }
            return true;
          }
          f2 = paramMotionEvent.getX();
          f3 = paramMotionEvent.getY();
          if ((Math.abs(f2 - this.v) <= this.u) && (Math.abs(f3 - this.w) <= this.u)) {
            break label322;
          }
          this.t = 2;
          getParent().requestDisallowInterceptTouchEvent(true);
          this.v = f2;
          this.w = f3;
          return true;
        }
      }
      if (this.t == 2)
      {
        b(paramMotionEvent);
        super.onTouchEvent(paramMotionEvent);
        return true;
      }
      this.t = 0;
      this.x.clear();
    }
    else
    {
      f2 = paramMotionEvent.getX();
      f3 = paramMotionEvent.getY();
      if ((isEnabled()) && (a(f2, f3)))
      {
        this.t = 1;
        this.v = f2;
        this.w = f3;
      }
    }
    label322:
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if ((getWindowToken() != null) && (y.B(this)))
    {
      a(paramBoolean);
    }
    else
    {
      c();
      float f1;
      if (paramBoolean) {
        f1 = 1.0F;
      } else {
        f1 = 0.0F;
      }
      setThumbPosition(f1);
    }
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(C.a(this, paramCallback));
  }
  
  public void setShowText(boolean paramBoolean)
  {
    if (this.s != paramBoolean)
    {
      this.s = paramBoolean;
      requestLayout();
    }
  }
  
  public void setSplitTrack(boolean paramBoolean)
  {
    this.p = paramBoolean;
    invalidate();
  }
  
  public void setSwitchMinWidth(int paramInt)
  {
    this.n = paramInt;
    requestLayout();
  }
  
  public void setSwitchPadding(int paramInt)
  {
    this.o = paramInt;
    requestLayout();
  }
  
  public void setSwitchTypeface(Typeface paramTypeface)
  {
    if (((this.H.getTypeface() != null) && (!this.H.getTypeface().equals(paramTypeface))) || ((this.H.getTypeface() == null) && (paramTypeface != null)))
    {
      this.H.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    }
  }
  
  public void setTextOff(CharSequence paramCharSequence)
  {
    this.r = paramCharSequence;
    requestLayout();
  }
  
  public void setTextOn(CharSequence paramCharSequence)
  {
    this.q = paramCharSequence;
    requestLayout();
  }
  
  public void setThumbDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.c;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    this.c = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    requestLayout();
  }
  
  void setThumbPosition(float paramFloat)
  {
    this.z = paramFloat;
    invalidate();
  }
  
  public void setThumbResource(int paramInt)
  {
    setThumbDrawable(Vd.b(getContext(), paramInt));
  }
  
  public void setThumbTextPadding(int paramInt)
  {
    this.m = paramInt;
    requestLayout();
  }
  
  public void setThumbTintList(ColorStateList paramColorStateList)
  {
    this.d = paramColorStateList;
    this.f = true;
    a();
  }
  
  public void setThumbTintMode(PorterDuff.Mode paramMode)
  {
    this.e = paramMode;
    this.g = true;
    a();
  }
  
  public void setTrackDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.h;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    this.h = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    requestLayout();
  }
  
  public void setTrackResource(int paramInt)
  {
    setTrackDrawable(Vd.b(getContext(), paramInt));
  }
  
  public void setTrackTintList(ColorStateList paramColorStateList)
  {
    this.i = paramColorStateList;
    this.k = true;
    b();
  }
  
  public void setTrackTintMode(PorterDuff.Mode paramMode)
  {
    this.j = paramMode;
    this.l = true;
    b();
  }
  
  public void toggle()
  {
    boolean bool;
    if (!isChecked()) {
      bool = true;
    } else {
      bool = false;
    }
    setChecked(bool);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if ((!super.verifyDrawable(paramDrawable)) && (paramDrawable != this.c) && (paramDrawable != this.h)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/SwitchCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */