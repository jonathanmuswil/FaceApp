package android.support.design.widget;

import Vd;
import W;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.graphics.drawable.a;
import android.support.v4.widget.C;
import android.support.v7.widget.I;
import android.support.v7.widget.p;
import android.support.v7.widget.pb;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import da;
import ea;
import ga;
import java.util.List;
import zd;

public class ba
  extends LinearLayout
{
  private int A;
  private Drawable B;
  private final Rect C = new Rect();
  private final RectF D = new RectF();
  private Typeface E;
  private boolean F;
  private Drawable G;
  private CharSequence H;
  private CheckableImageButton I;
  private boolean J;
  private Drawable K;
  private Drawable L;
  private ColorStateList M;
  private boolean N;
  private PorterDuff.Mode O;
  private boolean P;
  private ColorStateList Q;
  private ColorStateList R;
  private final int S;
  private final int T;
  private int U;
  private final int V;
  private boolean W;
  private final FrameLayout a;
  final s aa = new s(this);
  EditText b;
  private boolean ba;
  private CharSequence c;
  private ValueAnimator ca;
  private final J d = new J(this);
  private boolean da;
  boolean e;
  private boolean ea;
  private int f;
  private boolean fa;
  private boolean g;
  private TextView h;
  private final int i;
  private final int j;
  private boolean k;
  private CharSequence l;
  private boolean m;
  private GradientDrawable n;
  private final int o;
  private final int p;
  private int q;
  private final int r;
  private float s;
  private float t;
  private float u;
  private float v;
  private int w;
  private final int x;
  private final int y;
  private int z;
  
  public ba(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ba(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, W.textInputStyle);
  }
  
  public ba(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(1);
    setWillNotDraw(false);
    setAddStatesFromChildren(true);
    this.a = new FrameLayout(paramContext);
    this.a.setAddStatesFromChildren(true);
    addView(this.a);
    this.aa.b(ga.a);
    this.aa.a(ga.a);
    this.aa.b(8388659);
    paramAttributeSet = android.support.design.internal.c.b(paramContext, paramAttributeSet, fa.TextInputLayout, paramInt, ea.Widget_Design_TextInputLayout, new int[0]);
    this.k = paramAttributeSet.a(fa.TextInputLayout_hintEnabled, true);
    setHint(paramAttributeSet.e(fa.TextInputLayout_android_hint));
    this.ba = paramAttributeSet.a(fa.TextInputLayout_hintAnimationEnabled, true);
    this.o = paramContext.getResources().getDimensionPixelOffset(Y.mtrl_textinput_box_bottom_offset);
    this.p = paramContext.getResources().getDimensionPixelOffset(Y.mtrl_textinput_box_label_cutout_padding);
    this.r = paramAttributeSet.b(fa.TextInputLayout_boxCollapsedPaddingTop, 0);
    this.s = paramAttributeSet.a(fa.TextInputLayout_boxCornerRadiusTopStart, 0.0F);
    this.t = paramAttributeSet.a(fa.TextInputLayout_boxCornerRadiusTopEnd, 0.0F);
    this.u = paramAttributeSet.a(fa.TextInputLayout_boxCornerRadiusBottomEnd, 0.0F);
    this.v = paramAttributeSet.a(fa.TextInputLayout_boxCornerRadiusBottomStart, 0.0F);
    this.A = paramAttributeSet.a(fa.TextInputLayout_boxBackgroundColor, 0);
    this.U = paramAttributeSet.a(fa.TextInputLayout_boxStrokeColor, 0);
    this.x = paramContext.getResources().getDimensionPixelSize(Y.mtrl_textinput_box_stroke_width_default);
    this.y = paramContext.getResources().getDimensionPixelSize(Y.mtrl_textinput_box_stroke_width_focused);
    this.w = this.x;
    setBoxBackgroundMode(paramAttributeSet.d(fa.TextInputLayout_boxBackgroundMode, 0));
    if (paramAttributeSet.g(fa.TextInputLayout_android_textColorHint))
    {
      ColorStateList localColorStateList = paramAttributeSet.a(fa.TextInputLayout_android_textColorHint);
      this.R = localColorStateList;
      this.Q = localColorStateList;
    }
    this.S = android.support.v4.content.c.a(paramContext, X.mtrl_textinput_default_box_stroke_color);
    this.V = android.support.v4.content.c.a(paramContext, X.mtrl_textinput_disabled_color);
    this.T = android.support.v4.content.c.a(paramContext, X.mtrl_textinput_hovered_box_stroke_color);
    if (paramAttributeSet.g(fa.TextInputLayout_hintTextAppearance, -1) != -1) {
      setHintTextAppearance(paramAttributeSet.g(fa.TextInputLayout_hintTextAppearance, 0));
    }
    int i1 = paramAttributeSet.g(fa.TextInputLayout_errorTextAppearance, 0);
    boolean bool1 = paramAttributeSet.a(fa.TextInputLayout_errorEnabled, false);
    paramInt = paramAttributeSet.g(fa.TextInputLayout_helperTextTextAppearance, 0);
    boolean bool2 = paramAttributeSet.a(fa.TextInputLayout_helperTextEnabled, false);
    paramContext = paramAttributeSet.e(fa.TextInputLayout_helperText);
    boolean bool3 = paramAttributeSet.a(fa.TextInputLayout_counterEnabled, false);
    setCounterMaxLength(paramAttributeSet.d(fa.TextInputLayout_counterMaxLength, -1));
    this.j = paramAttributeSet.g(fa.TextInputLayout_counterTextAppearance, 0);
    this.i = paramAttributeSet.g(fa.TextInputLayout_counterOverflowTextAppearance, 0);
    this.F = paramAttributeSet.a(fa.TextInputLayout_passwordToggleEnabled, false);
    this.G = paramAttributeSet.b(fa.TextInputLayout_passwordToggleDrawable);
    this.H = paramAttributeSet.e(fa.TextInputLayout_passwordToggleContentDescription);
    if (paramAttributeSet.g(fa.TextInputLayout_passwordToggleTint))
    {
      this.N = true;
      this.M = paramAttributeSet.a(fa.TextInputLayout_passwordToggleTint);
    }
    if (paramAttributeSet.g(fa.TextInputLayout_passwordToggleTintMode))
    {
      this.P = true;
      this.O = android.support.design.internal.d.a(paramAttributeSet.d(fa.TextInputLayout_passwordToggleTintMode, -1), null);
    }
    paramAttributeSet.a();
    setHelperTextEnabled(bool2);
    setHelperText(paramContext);
    setHelperTextTextAppearance(paramInt);
    setErrorEnabled(bool1);
    setErrorTextAppearance(i1);
    setCounterEnabled(bool3);
    f();
    android.support.v4.view.y.d(this, 2);
  }
  
  private void a(RectF paramRectF)
  {
    float f1 = paramRectF.left;
    int i1 = this.p;
    paramRectF.left = (f1 - i1);
    paramRectF.top -= i1;
    paramRectF.right += i1;
    paramRectF.bottom += i1;
  }
  
  private static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i1 = paramViewGroup.getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = paramViewGroup.getChildAt(i2);
      localView.setEnabled(paramBoolean);
      if ((localView instanceof ViewGroup)) {
        a((ViewGroup)localView, paramBoolean);
      }
    }
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = isEnabled();
    Object localObject = this.b;
    int i1 = 1;
    int i2;
    if ((localObject != null) && (!TextUtils.isEmpty(((EditText)localObject).getText()))) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    localObject = this.b;
    if ((localObject == null) || (!((EditText)localObject).hasFocus())) {
      i1 = 0;
    }
    boolean bool2 = this.d.c();
    localObject = this.Q;
    if (localObject != null)
    {
      this.aa.a((ColorStateList)localObject);
      this.aa.b(this.Q);
    }
    if (!bool1)
    {
      this.aa.a(ColorStateList.valueOf(this.V));
      this.aa.b(ColorStateList.valueOf(this.V));
    }
    else if (bool2)
    {
      this.aa.a(this.d.f());
    }
    else
    {
      if (this.g)
      {
        localObject = this.h;
        if (localObject != null)
        {
          this.aa.a(((TextView)localObject).getTextColors());
          break label219;
        }
      }
      if (i1 != 0)
      {
        localObject = this.R;
        if (localObject != null) {
          this.aa.a((ColorStateList)localObject);
        }
      }
    }
    label219:
    if ((i2 == 0) && ((!isEnabled()) || ((i1 == 0) && (!bool2))))
    {
      if ((paramBoolean2) || (!this.W)) {
        d(paramBoolean1);
      }
    }
    else if ((paramBoolean2) || (this.W)) {
      c(paramBoolean1);
    }
  }
  
  private void c(boolean paramBoolean)
  {
    ValueAnimator localValueAnimator = this.ca;
    if ((localValueAnimator != null) && (localValueAnimator.isRunning())) {
      this.ca.cancel();
    }
    if ((paramBoolean) && (this.ba)) {
      a(1.0F);
    } else {
      this.aa.b(1.0F);
    }
    this.W = false;
    if (l()) {
      p();
    }
  }
  
  private void d(boolean paramBoolean)
  {
    ValueAnimator localValueAnimator = this.ca;
    if ((localValueAnimator != null) && (localValueAnimator.isRunning())) {
      this.ca.cancel();
    }
    if ((paramBoolean) && (this.ba)) {
      a(0.0F);
    } else {
      this.aa.b(0.0F);
    }
    if ((l()) && (((x)this.n).a())) {
      k();
    }
    this.W = true;
  }
  
  private void e()
  {
    if (this.n == null) {
      return;
    }
    q();
    EditText localEditText = this.b;
    if ((localEditText != null) && (this.q == 2))
    {
      if (localEditText.getBackground() != null) {
        this.B = this.b.getBackground();
      }
      android.support.v4.view.y.a(this.b, null);
    }
    localEditText = this.b;
    if ((localEditText != null) && (this.q == 1))
    {
      Drawable localDrawable = this.B;
      if (localDrawable != null) {
        android.support.v4.view.y.a(localEditText, localDrawable);
      }
    }
    int i1 = this.w;
    if (i1 > -1)
    {
      int i2 = this.z;
      if (i2 != 0) {
        this.n.setStroke(i1, i2);
      }
    }
    this.n.setCornerRadii(getCornerRadiiAsArray());
    this.n.setColor(this.A);
    invalidate();
  }
  
  private void f()
  {
    if ((this.G != null) && ((this.N) || (this.P)))
    {
      this.G = a.i(this.G).mutate();
      if (this.N) {
        a.a(this.G, this.M);
      }
      if (this.P) {
        a.a(this.G, this.O);
      }
      Object localObject = this.I;
      if (localObject != null)
      {
        localObject = ((ImageButton)localObject).getDrawable();
        Drawable localDrawable = this.G;
        if (localObject != localDrawable) {
          this.I.setImageDrawable(localDrawable);
        }
      }
    }
  }
  
  private void g()
  {
    int i1 = this.q;
    if (i1 == 0) {
      this.n = null;
    } else if ((i1 == 2) && (this.k) && (!(this.n instanceof x))) {
      this.n = new x();
    } else if (!(this.n instanceof GradientDrawable)) {
      this.n = new GradientDrawable();
    }
  }
  
  private Drawable getBoxBackground()
  {
    int i1 = this.q;
    if ((i1 != 1) && (i1 != 2)) {
      throw new IllegalStateException();
    }
    return this.n;
  }
  
  private float[] getCornerRadiiAsArray()
  {
    if (!android.support.design.internal.d.a(this))
    {
      f1 = this.s;
      f2 = this.t;
      f3 = this.u;
      f4 = this.v;
      return new float[] { f1, f1, f2, f2, f3, f3, f4, f4 };
    }
    float f1 = this.t;
    float f2 = this.s;
    float f4 = this.v;
    float f3 = this.u;
    return new float[] { f1, f1, f2, f2, f4, f4, f3, f3 };
  }
  
  private int h()
  {
    EditText localEditText = this.b;
    if (localEditText == null) {
      return 0;
    }
    int i1 = this.q;
    if (i1 != 1)
    {
      if (i1 != 2) {
        return 0;
      }
      return localEditText.getTop() + j();
    }
    return localEditText.getTop();
  }
  
  private int i()
  {
    int i1 = this.q;
    if (i1 != 1)
    {
      if (i1 != 2) {
        return getPaddingTop();
      }
      return getBoxBackground().getBounds().top - j();
    }
    return getBoxBackground().getBounds().top + this.r;
  }
  
  private int j()
  {
    if (!this.k) {
      return 0;
    }
    int i1 = this.q;
    if ((i1 != 0) && (i1 != 1)) {
      if (i1 != 2) {
        return 0;
      }
    }
    for (float f1 = this.aa.d() / 2.0F;; f1 = this.aa.d()) {
      return (int)f1;
    }
  }
  
  private void k()
  {
    if (l()) {
      ((x)this.n).b();
    }
  }
  
  private boolean l()
  {
    boolean bool;
    if ((this.k) && (!TextUtils.isEmpty(this.l)) && ((this.n instanceof x))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void m()
  {
    int i1 = Build.VERSION.SDK_INT;
    if ((i1 != 21) && (i1 != 22)) {
      return;
    }
    Drawable localDrawable1 = this.b.getBackground();
    if (localDrawable1 == null) {
      return;
    }
    if (!this.da)
    {
      Drawable localDrawable2 = localDrawable1.getConstantState().newDrawable();
      if ((localDrawable1 instanceof DrawableContainer)) {
        this.da = z.a((DrawableContainer)localDrawable1, localDrawable2.getConstantState());
      }
      if (!this.da)
      {
        android.support.v4.view.y.a(this.b, localDrawable2);
        this.da = true;
        o();
      }
    }
  }
  
  private boolean n()
  {
    EditText localEditText = this.b;
    boolean bool;
    if ((localEditText != null) && ((localEditText.getTransformationMethod() instanceof PasswordTransformationMethod))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void o()
  {
    g();
    if (this.q != 0) {
      t();
    }
    v();
  }
  
  private void p()
  {
    if (!l()) {
      return;
    }
    RectF localRectF = this.D;
    this.aa.a(localRectF);
    a(localRectF);
    ((x)this.n).a(localRectF);
  }
  
  private void q()
  {
    int i1 = this.q;
    if (i1 != 1)
    {
      if ((i1 == 2) && (this.U == 0)) {
        this.U = this.R.getColorForState(getDrawableState(), this.R.getDefaultColor());
      }
    }
    else {
      this.w = 0;
    }
  }
  
  private boolean r()
  {
    boolean bool;
    if ((this.F) && ((n()) || (this.J))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void s()
  {
    Object localObject1 = this.b;
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = ((EditText)localObject1).getBackground();
    if (localObject2 == null) {
      return;
    }
    localObject1 = localObject2;
    if (android.support.v7.widget.fa.a((Drawable)localObject2)) {
      localObject1 = ((Drawable)localObject2).mutate();
    }
    localObject2 = new Rect();
    y.a(this, this.b, (Rect)localObject2);
    localObject2 = ((Drawable)localObject1).getBounds();
    if (((Rect)localObject2).left != ((Rect)localObject2).right)
    {
      Rect localRect = new Rect();
      ((Drawable)localObject1).getPadding(localRect);
      int i1 = ((Rect)localObject2).left;
      int i2 = localRect.left;
      int i3 = ((Rect)localObject2).right;
      int i4 = localRect.right;
      ((Drawable)localObject1).setBounds(i1 - i2, ((Rect)localObject2).top, i3 + i4 * 2, this.b.getBottom());
    }
  }
  
  private void setEditText(EditText paramEditText)
  {
    if (this.b == null)
    {
      if (!(paramEditText instanceof X)) {
        Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
      }
      this.b = paramEditText;
      o();
      setTextInputAccessibilityDelegate(new a(this));
      if (!n()) {
        this.aa.c(this.b.getTypeface());
      }
      this.aa.a(this.b.getTextSize());
      int i1 = this.b.getGravity();
      this.aa.b(i1 & 0xFFFFFF8F | 0x30);
      this.aa.d(i1);
      this.b.addTextChangedListener(new Y(this));
      if (this.Q == null) {
        this.Q = this.b.getHintTextColors();
      }
      if (this.k)
      {
        if (TextUtils.isEmpty(this.l))
        {
          this.c = this.b.getHint();
          setHint(this.c);
          this.b.setHint(null);
        }
        this.m = true;
      }
      if (this.h != null) {
        a(this.b.getText().length());
      }
      this.d.a();
      u();
      a(false, true);
      return;
    }
    throw new IllegalArgumentException("We already have an EditText, can only have one");
  }
  
  private void setHintInternal(CharSequence paramCharSequence)
  {
    if (!TextUtils.equals(paramCharSequence, this.l))
    {
      this.l = paramCharSequence;
      this.aa.a(paramCharSequence);
      if (!this.W) {
        p();
      }
    }
  }
  
  private void t()
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.a.getLayoutParams();
    int i1 = j();
    if (i1 != localLayoutParams.topMargin)
    {
      localLayoutParams.topMargin = i1;
      this.a.requestLayout();
    }
  }
  
  private void u()
  {
    if (this.b == null) {
      return;
    }
    Object localObject;
    if (r())
    {
      if (this.I == null)
      {
        this.I = ((CheckableImageButton)LayoutInflater.from(getContext()).inflate(ca.design_text_input_password_icon, this.a, false));
        this.I.setImageDrawable(this.G);
        this.I.setContentDescription(this.H);
        this.a.addView(this.I);
        this.I.setOnClickListener(new Z(this));
      }
      localObject = this.b;
      if ((localObject != null) && (android.support.v4.view.y.m((View)localObject) <= 0)) {
        this.b.setMinimumHeight(android.support.v4.view.y.m(this.I));
      }
      this.I.setVisibility(0);
      this.I.setChecked(this.J);
      if (this.K == null) {
        this.K = new ColorDrawable();
      }
      this.K.setBounds(0, 0, this.I.getMeasuredWidth(), 1);
      localObject = C.d(this.b);
      if (localObject[2] != this.K) {
        this.L = localObject[2];
      }
      C.a(this.b, localObject[0], localObject[1], this.K, localObject[3]);
      this.I.setPadding(this.b.getPaddingLeft(), this.b.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
    }
    else
    {
      localObject = this.I;
      if ((localObject != null) && (((ImageButton)localObject).getVisibility() == 0)) {
        this.I.setVisibility(8);
      }
      if (this.K != null)
      {
        localObject = C.d(this.b);
        if (localObject[2] == this.K)
        {
          C.a(this.b, localObject[0], localObject[1], this.L, localObject[3]);
          this.K = null;
        }
      }
    }
  }
  
  private void v()
  {
    if ((this.q != 0) && (this.n != null) && (this.b != null) && (getRight() != 0))
    {
      int i1 = this.b.getLeft();
      int i2 = h();
      int i3 = this.b.getRight();
      int i4 = this.b.getBottom() + this.o;
      int i5 = i1;
      int i6 = i2;
      int i7 = i3;
      int i8 = i4;
      if (this.q == 2)
      {
        i8 = this.y;
        i5 = i1 + i8 / 2;
        i6 = i2 - i8 / 2;
        i7 = i3 - i8 / 2;
        i8 = i4 + i8 / 2;
      }
      this.n.setBounds(i5, i6, i7, i8);
      e();
      s();
    }
  }
  
  void a(float paramFloat)
  {
    if (this.aa.i() == paramFloat) {
      return;
    }
    if (this.ca == null)
    {
      this.ca = new ValueAnimator();
      this.ca.setInterpolator(ga.b);
      this.ca.setDuration(167L);
      this.ca.addUpdateListener(new aa(this));
    }
    this.ca.setFloatValues(new float[] { this.aa.i(), paramFloat });
    this.ca.start();
  }
  
  void a(int paramInt)
  {
    boolean bool1 = this.g;
    if (this.f == -1)
    {
      this.h.setText(String.valueOf(paramInt));
      this.h.setContentDescription(null);
      this.g = false;
    }
    else
    {
      if (android.support.v4.view.y.b(this.h) == 1) {
        android.support.v4.view.y.c(this.h, 0);
      }
      if (paramInt > this.f) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      this.g = bool2;
      boolean bool2 = this.g;
      if (bool1 != bool2)
      {
        TextView localTextView = this.h;
        int i1;
        if (bool2) {
          i1 = this.i;
        } else {
          i1 = this.j;
        }
        a(localTextView, i1);
        if (this.g) {
          android.support.v4.view.y.c(this.h, 1);
        }
      }
      this.h.setText(getContext().getString(da.character_counter_pattern, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.f) }));
      this.h.setContentDescription(getContext().getString(da.character_counter_content_description, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.f) }));
    }
    if ((this.b != null) && (bool1 != this.g))
    {
      b(false);
      d();
      c();
    }
  }
  
  void a(TextView paramTextView, int paramInt)
  {
    i1 = 1;
    try
    {
      C.d(paramTextView, paramInt);
      if (Build.VERSION.SDK_INT >= 23)
      {
        paramInt = paramTextView.getTextColors().getDefaultColor();
        if (paramInt == -65281)
        {
          paramInt = i1;
          break label37;
        }
      }
      paramInt = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label37:
        paramInt = i1;
      }
    }
    if (paramInt != 0)
    {
      C.d(paramTextView, ea.TextAppearance_AppCompat_Caption);
      paramTextView.setTextColor(android.support.v4.content.c.a(getContext(), X.design_error));
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.F)
    {
      int i1 = this.b.getSelectionEnd();
      if (n())
      {
        this.b.setTransformationMethod(null);
        this.J = true;
      }
      else
      {
        this.b.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.J = false;
      }
      this.I.setChecked(this.J);
      if (paramBoolean) {
        this.I.jumpDrawablesToCurrentState();
      }
      this.b.setSelection(i1);
    }
  }
  
  public boolean a()
  {
    return this.d.l();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramView instanceof EditText))
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramLayoutParams);
      localLayoutParams.gravity = (localLayoutParams.gravity & 0xFFFFFF8F | 0x10);
      this.a.addView(paramView, localLayoutParams);
      this.a.setLayoutParams(paramLayoutParams);
      t();
      setEditText((EditText)paramView);
    }
    else
    {
      super.addView(paramView, paramInt, paramLayoutParams);
    }
  }
  
  void b(boolean paramBoolean)
  {
    a(paramBoolean, false);
  }
  
  boolean b()
  {
    return this.m;
  }
  
  void c()
  {
    Object localObject1 = this.b;
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = ((EditText)localObject1).getBackground();
    if (localObject2 == null) {
      return;
    }
    m();
    localObject1 = localObject2;
    if (android.support.v7.widget.fa.a((Drawable)localObject2)) {
      localObject1 = ((Drawable)localObject2).mutate();
    }
    if (this.d.c())
    {
      ((Drawable)localObject1).setColorFilter(p.a(this.d.e(), PorterDuff.Mode.SRC_IN));
    }
    else
    {
      if (this.g)
      {
        localObject2 = this.h;
        if (localObject2 != null)
        {
          ((Drawable)localObject1).setColorFilter(p.a(((TextView)localObject2).getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
          return;
        }
      }
      a.b((Drawable)localObject1);
      this.b.refreshDrawableState();
    }
  }
  
  void d()
  {
    if ((this.n != null) && (this.q != 0))
    {
      Object localObject = this.b;
      int i1 = 1;
      int i2;
      if ((localObject != null) && (((EditText)localObject).hasFocus())) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      localObject = this.b;
      if ((localObject == null) || (!((EditText)localObject).isHovered())) {
        i1 = 0;
      }
      if (this.q == 2)
      {
        if (!isEnabled())
        {
          this.z = this.V;
        }
        else if (this.d.c())
        {
          this.z = this.d.e();
        }
        else
        {
          if (this.g)
          {
            localObject = this.h;
            if (localObject != null)
            {
              this.z = ((TextView)localObject).getCurrentTextColor();
              break label178;
            }
          }
          if (i2 != 0) {
            this.z = this.U;
          } else if (i1 != 0) {
            this.z = this.T;
          } else {
            this.z = this.S;
          }
        }
        label178:
        if (((i1 != 0) || (i2 != 0)) && (isEnabled())) {
          this.w = this.y;
        } else {
          this.w = this.x;
        }
        e();
      }
    }
  }
  
  public void dispatchProvideAutofillStructure(ViewStructure paramViewStructure, int paramInt)
  {
    if (this.c != null)
    {
      Object localObject = this.b;
      if (localObject != null)
      {
        boolean bool = this.m;
        this.m = false;
        localObject = ((EditText)localObject).getHint();
        this.b.setHint(this.c);
        try
        {
          super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
          return;
        }
        finally
        {
          this.b.setHint((CharSequence)localObject);
          this.m = bool;
        }
      }
    }
    super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    this.fa = true;
    super.dispatchRestoreInstanceState(paramSparseArray);
    this.fa = false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    GradientDrawable localGradientDrawable = this.n;
    if (localGradientDrawable != null) {
      localGradientDrawable.draw(paramCanvas);
    }
    super.draw(paramCanvas);
    if (this.k) {
      this.aa.a(paramCanvas);
    }
  }
  
  protected void drawableStateChanged()
  {
    if (this.ea) {
      return;
    }
    boolean bool1 = true;
    this.ea = true;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if ((!android.support.v4.view.y.B(this)) || (!isEnabled())) {
      bool1 = false;
    }
    b(bool1);
    c();
    v();
    d();
    s locals = this.aa;
    boolean bool2;
    if (locals != null) {
      bool2 = locals.a(arrayOfInt) | false;
    } else {
      bool2 = false;
    }
    if (bool2) {
      invalidate();
    }
    this.ea = false;
  }
  
  public int getBoxBackgroundColor()
  {
    return this.A;
  }
  
  public float getBoxCornerRadiusBottomEnd()
  {
    return this.u;
  }
  
  public float getBoxCornerRadiusBottomStart()
  {
    return this.v;
  }
  
  public float getBoxCornerRadiusTopEnd()
  {
    return this.t;
  }
  
  public float getBoxCornerRadiusTopStart()
  {
    return this.s;
  }
  
  public int getBoxStrokeColor()
  {
    return this.U;
  }
  
  public int getCounterMaxLength()
  {
    return this.f;
  }
  
  CharSequence getCounterOverflowDescription()
  {
    if ((this.e) && (this.g))
    {
      TextView localTextView = this.h;
      if (localTextView != null) {
        return localTextView.getContentDescription();
      }
    }
    return null;
  }
  
  public ColorStateList getDefaultHintTextColor()
  {
    return this.Q;
  }
  
  public EditText getEditText()
  {
    return this.b;
  }
  
  public CharSequence getError()
  {
    CharSequence localCharSequence;
    if (this.d.k()) {
      localCharSequence = this.d.d();
    } else {
      localCharSequence = null;
    }
    return localCharSequence;
  }
  
  public int getErrorCurrentTextColors()
  {
    return this.d.e();
  }
  
  final int getErrorTextCurrentColor()
  {
    return this.d.e();
  }
  
  public CharSequence getHelperText()
  {
    CharSequence localCharSequence;
    if (this.d.l()) {
      localCharSequence = this.d.g();
    } else {
      localCharSequence = null;
    }
    return localCharSequence;
  }
  
  public int getHelperTextCurrentTextColor()
  {
    return this.d.h();
  }
  
  public CharSequence getHint()
  {
    CharSequence localCharSequence;
    if (this.k) {
      localCharSequence = this.l;
    } else {
      localCharSequence = null;
    }
    return localCharSequence;
  }
  
  final float getHintCollapsedTextHeight()
  {
    return this.aa.d();
  }
  
  final int getHintCurrentCollapsedTextColor()
  {
    return this.aa.f();
  }
  
  public CharSequence getPasswordVisibilityToggleContentDescription()
  {
    return this.H;
  }
  
  public Drawable getPasswordVisibilityToggleDrawable()
  {
    return this.G;
  }
  
  public Typeface getTypeface()
  {
    return this.E;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.n != null) {
      v();
    }
    if (this.k)
    {
      EditText localEditText = this.b;
      if (localEditText != null)
      {
        Rect localRect = this.C;
        y.a(this, localEditText, localRect);
        paramInt3 = localRect.left + this.b.getCompoundPaddingLeft();
        paramInt1 = localRect.right - this.b.getCompoundPaddingRight();
        int i1 = i();
        this.aa.b(paramInt3, localRect.top + this.b.getCompoundPaddingTop(), paramInt1, localRect.bottom - this.b.getCompoundPaddingBottom());
        this.aa.a(paramInt3, i1, paramInt1, paramInt4 - paramInt2 - getPaddingBottom());
        this.aa.m();
        if ((l()) && (!this.W)) {
          p();
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    u();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof b))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (b)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.l());
    setError(paramParcelable.c);
    if (paramParcelable.d) {
      a(true);
    }
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState()
  {
    b localb = new b(super.onSaveInstanceState());
    if (this.d.c()) {
      localb.c = getError();
    }
    localb.d = this.J;
    return localb;
  }
  
  public void setBoxBackgroundColor(int paramInt)
  {
    if (this.A != paramInt)
    {
      this.A = paramInt;
      e();
    }
  }
  
  public void setBoxBackgroundColorResource(int paramInt)
  {
    setBoxBackgroundColor(android.support.v4.content.c.a(getContext(), paramInt));
  }
  
  public void setBoxBackgroundMode(int paramInt)
  {
    if (paramInt == this.q) {
      return;
    }
    this.q = paramInt;
    o();
  }
  
  public void setBoxStrokeColor(int paramInt)
  {
    if (this.U != paramInt)
    {
      this.U = paramInt;
      d();
    }
  }
  
  public void setCounterEnabled(boolean paramBoolean)
  {
    if (this.e != paramBoolean)
    {
      if (paramBoolean)
      {
        this.h = new I(getContext());
        this.h.setId(aa.textinput_counter);
        Object localObject = this.E;
        if (localObject != null) {
          this.h.setTypeface((Typeface)localObject);
        }
        this.h.setMaxLines(1);
        a(this.h, this.j);
        this.d.a(this.h, 2);
        localObject = this.b;
        if (localObject == null) {
          a(0);
        } else {
          a(((EditText)localObject).getText().length());
        }
      }
      else
      {
        this.d.b(this.h, 2);
        this.h = null;
      }
      this.e = paramBoolean;
    }
  }
  
  public void setCounterMaxLength(int paramInt)
  {
    if (this.f != paramInt)
    {
      if (paramInt > 0) {
        this.f = paramInt;
      } else {
        this.f = -1;
      }
      if (this.e)
      {
        EditText localEditText = this.b;
        if (localEditText == null) {
          paramInt = 0;
        } else {
          paramInt = localEditText.getText().length();
        }
        a(paramInt);
      }
    }
  }
  
  public void setDefaultHintTextColor(ColorStateList paramColorStateList)
  {
    this.Q = paramColorStateList;
    this.R = paramColorStateList;
    if (this.b != null) {
      b(false);
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    a(this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void setError(CharSequence paramCharSequence)
  {
    if (!this.d.k())
    {
      if (TextUtils.isEmpty(paramCharSequence)) {
        return;
      }
      setErrorEnabled(true);
    }
    if (!TextUtils.isEmpty(paramCharSequence)) {
      this.d.a(paramCharSequence);
    } else {
      this.d.i();
    }
  }
  
  public void setErrorEnabled(boolean paramBoolean)
  {
    this.d.a(paramBoolean);
  }
  
  public void setErrorTextAppearance(int paramInt)
  {
    this.d.b(paramInt);
  }
  
  public void setErrorTextColor(ColorStateList paramColorStateList)
  {
    this.d.a(paramColorStateList);
  }
  
  public void setHelperText(CharSequence paramCharSequence)
  {
    if (TextUtils.isEmpty(paramCharSequence))
    {
      if (a()) {
        setHelperTextEnabled(false);
      }
    }
    else
    {
      if (!a()) {
        setHelperTextEnabled(true);
      }
      this.d.b(paramCharSequence);
    }
  }
  
  public void setHelperTextColor(ColorStateList paramColorStateList)
  {
    this.d.b(paramColorStateList);
  }
  
  public void setHelperTextEnabled(boolean paramBoolean)
  {
    this.d.b(paramBoolean);
  }
  
  public void setHelperTextTextAppearance(int paramInt)
  {
    this.d.c(paramInt);
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    if (this.k)
    {
      setHintInternal(paramCharSequence);
      sendAccessibilityEvent(2048);
    }
  }
  
  public void setHintAnimationEnabled(boolean paramBoolean)
  {
    this.ba = paramBoolean;
  }
  
  public void setHintEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.k)
    {
      this.k = paramBoolean;
      if (!this.k)
      {
        this.m = false;
        if ((!TextUtils.isEmpty(this.l)) && (TextUtils.isEmpty(this.b.getHint()))) {
          this.b.setHint(this.l);
        }
        setHintInternal(null);
      }
      else
      {
        CharSequence localCharSequence = this.b.getHint();
        if (!TextUtils.isEmpty(localCharSequence))
        {
          if (TextUtils.isEmpty(this.l)) {
            setHint(localCharSequence);
          }
          this.b.setHint(null);
        }
        this.m = true;
      }
      if (this.b != null) {
        t();
      }
    }
  }
  
  public void setHintTextAppearance(int paramInt)
  {
    this.aa.a(paramInt);
    this.R = this.aa.b();
    if (this.b != null)
    {
      b(false);
      t();
    }
  }
  
  public void setPasswordVisibilityToggleContentDescription(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0) {
      localCharSequence = getResources().getText(paramInt);
    } else {
      localCharSequence = null;
    }
    setPasswordVisibilityToggleContentDescription(localCharSequence);
  }
  
  public void setPasswordVisibilityToggleContentDescription(CharSequence paramCharSequence)
  {
    this.H = paramCharSequence;
    CheckableImageButton localCheckableImageButton = this.I;
    if (localCheckableImageButton != null) {
      localCheckableImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setPasswordVisibilityToggleDrawable(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = Vd.b(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setPasswordVisibilityToggleDrawable(localDrawable);
  }
  
  public void setPasswordVisibilityToggleDrawable(Drawable paramDrawable)
  {
    this.G = paramDrawable;
    CheckableImageButton localCheckableImageButton = this.I;
    if (localCheckableImageButton != null) {
      localCheckableImageButton.setImageDrawable(paramDrawable);
    }
  }
  
  public void setPasswordVisibilityToggleEnabled(boolean paramBoolean)
  {
    if (this.F != paramBoolean)
    {
      this.F = paramBoolean;
      if ((!paramBoolean) && (this.J))
      {
        EditText localEditText = this.b;
        if (localEditText != null) {
          localEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
      }
      this.J = false;
      u();
    }
  }
  
  public void setPasswordVisibilityToggleTintList(ColorStateList paramColorStateList)
  {
    this.M = paramColorStateList;
    this.N = true;
    f();
  }
  
  public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode paramMode)
  {
    this.O = paramMode;
    this.P = true;
    f();
  }
  
  public void setTextInputAccessibilityDelegate(a parama)
  {
    EditText localEditText = this.b;
    if (localEditText != null) {
      android.support.v4.view.y.a(localEditText, parama);
    }
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    if (paramTypeface != this.E)
    {
      this.E = paramTypeface;
      this.aa.c(paramTypeface);
      this.d.a(paramTypeface);
      TextView localTextView = this.h;
      if (localTextView != null) {
        localTextView.setTypeface(paramTypeface);
      }
    }
  }
  
  public static class a
    extends android.support.v4.view.d
  {
    private final ba c;
    
    public a(ba paramba)
    {
      this.c = paramba;
    }
    
    public void a(View paramView, zd paramzd)
    {
      super.a(paramView, paramzd);
      paramView = this.c.getEditText();
      if (paramView != null) {
        paramView = paramView.getText();
      } else {
        paramView = null;
      }
      CharSequence localCharSequence1 = this.c.getHint();
      CharSequence localCharSequence2 = this.c.getError();
      CharSequence localCharSequence3 = this.c.getCounterOverflowDescription();
      boolean bool1 = TextUtils.isEmpty(paramView) ^ true;
      boolean bool2 = TextUtils.isEmpty(localCharSequence1) ^ true;
      boolean bool3 = TextUtils.isEmpty(localCharSequence2) ^ true;
      boolean bool4 = false;
      int i;
      if ((!bool3) && (TextUtils.isEmpty(localCharSequence3))) {
        i = 0;
      } else {
        i = 1;
      }
      if (bool1) {
        paramzd.f(paramView);
      } else if (bool2) {
        paramzd.f(localCharSequence1);
      }
      if (bool2)
      {
        paramzd.d(localCharSequence1);
        boolean bool5 = bool4;
        if (!bool1)
        {
          bool5 = bool4;
          if (bool2) {
            bool5 = true;
          }
        }
        paramzd.m(bool5);
      }
      if (i != 0)
      {
        if (bool3) {
          paramView = localCharSequence2;
        } else {
          paramView = localCharSequence3;
        }
        paramzd.c(paramView);
        paramzd.e(true);
      }
    }
    
    public void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.c(paramView, paramAccessibilityEvent);
      paramView = this.c.getEditText();
      if (paramView != null) {
        paramView = paramView.getText();
      } else {
        paramView = null;
      }
      Object localObject = paramView;
      if (TextUtils.isEmpty(paramView)) {
        localObject = this.c.getHint();
      }
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        paramAccessibilityEvent.getText().add(localObject);
      }
    }
  }
  
  static class b
    extends android.support.v4.view.c
  {
    public static final Parcelable.Creator<b> CREATOR = new ca();
    CharSequence c;
    boolean d;
    
    b(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.c = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
      int i = paramParcel.readInt();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      this.d = bool;
    }
    
    b(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("TextInputLayout.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" error=");
      localStringBuilder.append(this.c);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      TextUtils.writeToParcel(this.c, paramParcel, paramInt);
      paramParcel.writeInt(this.d);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */