package android.support.v7.app;

import Gd;
import Ld;
import Pd;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.y;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.pa.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;

class AlertController
{
  NestedScrollView A;
  private int B = 0;
  private Drawable C;
  private ImageView D;
  private TextView E;
  private TextView F;
  private View G;
  ListAdapter H;
  int I = -1;
  private int J;
  private int K;
  int L;
  int M;
  int N;
  int O;
  private boolean P;
  private int Q = 0;
  Handler R;
  private final View.OnClickListener S = new c(this);
  private final Context a;
  final B b;
  private final Window c;
  private final int d;
  private CharSequence e;
  private CharSequence f;
  ListView g;
  private View h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private boolean n = false;
  Button o;
  private CharSequence p;
  Message q;
  private Drawable r;
  Button s;
  private CharSequence t;
  Message u;
  private Drawable v;
  Button w;
  private CharSequence x;
  Message y;
  private Drawable z;
  
  public AlertController(Context paramContext, B paramB, Window paramWindow)
  {
    this.a = paramContext;
    this.b = paramB;
    this.c = paramWindow;
    this.R = new b(paramB);
    paramContext = paramContext.obtainStyledAttributes(null, Pd.AlertDialog, Gd.alertDialogStyle, 0);
    this.J = paramContext.getResourceId(Pd.AlertDialog_android_layout, 0);
    this.K = paramContext.getResourceId(Pd.AlertDialog_buttonPanelSideLayout, 0);
    this.L = paramContext.getResourceId(Pd.AlertDialog_listLayout, 0);
    this.M = paramContext.getResourceId(Pd.AlertDialog_multiChoiceItemLayout, 0);
    this.N = paramContext.getResourceId(Pd.AlertDialog_singleChoiceItemLayout, 0);
    this.O = paramContext.getResourceId(Pd.AlertDialog_listItemLayout, 0);
    this.P = paramContext.getBoolean(Pd.AlertDialog_showTitle, true);
    this.d = paramContext.getDimensionPixelSize(Pd.AlertDialog_buttonIconDimen, 0);
    paramContext.recycle();
    paramB.a(1);
  }
  
  private ViewGroup a(View paramView1, View paramView2)
  {
    if (paramView1 == null)
    {
      paramView1 = paramView2;
      if ((paramView2 instanceof ViewStub)) {
        paramView1 = ((ViewStub)paramView2).inflate();
      }
      return (ViewGroup)paramView1;
    }
    if (paramView2 != null)
    {
      ViewParent localViewParent = paramView2.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(paramView2);
      }
    }
    paramView2 = paramView1;
    if ((paramView1 instanceof ViewStub)) {
      paramView2 = ((ViewStub)paramView1).inflate();
    }
    return (ViewGroup)paramView2;
  }
  
  static void a(View paramView1, View paramView2, View paramView3)
  {
    int i1 = 0;
    int i2;
    if (paramView2 != null)
    {
      if (paramView1.canScrollVertically(-1)) {
        i2 = 0;
      } else {
        i2 = 4;
      }
      paramView2.setVisibility(i2);
    }
    if (paramView3 != null)
    {
      if (paramView1.canScrollVertically(1)) {
        i2 = i1;
      } else {
        i2 = 4;
      }
      paramView3.setVisibility(i2);
    }
  }
  
  private void a(ViewGroup paramViewGroup)
  {
    this.o = ((Button)paramViewGroup.findViewById(16908313));
    this.o.setOnClickListener(this.S);
    boolean bool = TextUtils.isEmpty(this.p);
    int i1 = 1;
    int i2;
    Drawable localDrawable;
    if ((bool) && (this.r == null))
    {
      this.o.setVisibility(8);
      i2 = 0;
    }
    else
    {
      this.o.setText(this.p);
      localDrawable = this.r;
      if (localDrawable != null)
      {
        i2 = this.d;
        localDrawable.setBounds(0, 0, i2, i2);
        this.o.setCompoundDrawables(this.r, null, null, null);
      }
      this.o.setVisibility(0);
      i2 = 1;
    }
    this.s = ((Button)paramViewGroup.findViewById(16908314));
    this.s.setOnClickListener(this.S);
    int i3;
    if ((TextUtils.isEmpty(this.t)) && (this.v == null))
    {
      this.s.setVisibility(8);
    }
    else
    {
      this.s.setText(this.t);
      localDrawable = this.v;
      if (localDrawable != null)
      {
        i3 = this.d;
        localDrawable.setBounds(0, 0, i3, i3);
        this.s.setCompoundDrawables(this.v, null, null, null);
      }
      this.s.setVisibility(0);
      i2 |= 0x2;
    }
    this.w = ((Button)paramViewGroup.findViewById(16908315));
    this.w.setOnClickListener(this.S);
    if ((TextUtils.isEmpty(this.x)) && (this.z == null))
    {
      this.w.setVisibility(8);
    }
    else
    {
      this.w.setText(this.x);
      localDrawable = this.r;
      if (localDrawable != null)
      {
        i3 = this.d;
        localDrawable.setBounds(0, 0, i3, i3);
        this.o.setCompoundDrawables(this.r, null, null, null);
      }
      this.w.setVisibility(0);
      i2 |= 0x4;
    }
    if (a(this.a)) {
      if (i2 == 1) {
        a(this.o);
      } else if (i2 == 2) {
        a(this.s);
      } else if (i2 == 4) {
        a(this.w);
      }
    }
    if (i2 != 0) {
      i2 = i1;
    } else {
      i2 = 0;
    }
    if (i2 == 0) {
      paramViewGroup.setVisibility(8);
    }
  }
  
  private void a(ViewGroup paramViewGroup, View paramView, int paramInt1, int paramInt2)
  {
    View localView = this.c.findViewById(Ld.scrollIndicatorUp);
    Object localObject = this.c.findViewById(Ld.scrollIndicatorDown);
    if (Build.VERSION.SDK_INT >= 23)
    {
      y.a(paramView, paramInt1, paramInt2);
      if (localView != null) {
        paramViewGroup.removeView(localView);
      }
      if (localObject != null) {
        paramViewGroup.removeView((View)localObject);
      }
    }
    else
    {
      ListView localListView = null;
      paramView = localView;
      if (localView != null)
      {
        paramView = localView;
        if ((paramInt1 & 0x1) == 0)
        {
          paramViewGroup.removeView(localView);
          paramView = null;
        }
      }
      if ((localObject != null) && ((paramInt1 & 0x2) == 0))
      {
        paramViewGroup.removeView((View)localObject);
        localObject = localListView;
      }
      if ((paramView != null) || (localObject != null)) {
        if (this.f != null)
        {
          this.A.setOnScrollChangeListener(new d(this, paramView, (View)localObject));
          this.A.post(new e(this, paramView, (View)localObject));
        }
        else
        {
          localListView = this.g;
          if (localListView != null)
          {
            localListView.setOnScrollListener(new f(this, paramView, (View)localObject));
            this.g.post(new g(this, paramView, (View)localObject));
          }
          else
          {
            if (paramView != null) {
              paramViewGroup.removeView(paramView);
            }
            if (localObject != null) {
              paramViewGroup.removeView((View)localObject);
            }
          }
        }
      }
    }
  }
  
  private void a(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    localLayoutParams.gravity = 1;
    localLayoutParams.weight = 0.5F;
    paramButton.setLayoutParams(localLayoutParams);
  }
  
  private static boolean a(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext = paramContext.getTheme();
    int i1 = Gd.alertDialogCenterButtons;
    boolean bool = true;
    paramContext.resolveAttribute(i1, localTypedValue, true);
    if (localTypedValue.data == 0) {
      bool = false;
    }
    return bool;
  }
  
  static boolean a(View paramView)
  {
    if (paramView.onCheckIsTextEditor()) {
      return true;
    }
    if (!(paramView instanceof ViewGroup)) {
      return false;
    }
    paramView = (ViewGroup)paramView;
    int i1 = paramView.getChildCount();
    while (i1 > 0)
    {
      int i2 = i1 - 1;
      i1 = i2;
      if (a(paramView.getChildAt(i2))) {
        return true;
      }
    }
    return false;
  }
  
  private int b()
  {
    int i1 = this.K;
    if (i1 == 0) {
      return this.J;
    }
    if (this.Q == 1) {
      return i1;
    }
    return this.J;
  }
  
  private void b(ViewGroup paramViewGroup)
  {
    this.A = ((NestedScrollView)this.c.findViewById(Ld.scrollView));
    this.A.setFocusable(false);
    this.A.setNestedScrollingEnabled(false);
    this.F = ((TextView)paramViewGroup.findViewById(16908299));
    TextView localTextView = this.F;
    if (localTextView == null) {
      return;
    }
    CharSequence localCharSequence = this.f;
    if (localCharSequence != null)
    {
      localTextView.setText(localCharSequence);
    }
    else
    {
      localTextView.setVisibility(8);
      this.A.removeView(this.F);
      if (this.g != null)
      {
        paramViewGroup = (ViewGroup)this.A.getParent();
        int i1 = paramViewGroup.indexOfChild(this.A);
        paramViewGroup.removeViewAt(i1);
        paramViewGroup.addView(this.g, i1, new ViewGroup.LayoutParams(-1, -1));
      }
      else
      {
        paramViewGroup.setVisibility(8);
      }
    }
  }
  
  private void c()
  {
    Object localObject1 = this.c.findViewById(Ld.parentPanel);
    Object localObject2 = ((View)localObject1).findViewById(Ld.topPanel);
    Object localObject3 = ((View)localObject1).findViewById(Ld.contentPanel);
    Object localObject4 = ((View)localObject1).findViewById(Ld.buttonPanel);
    localObject1 = (ViewGroup)((View)localObject1).findViewById(Ld.customPanel);
    c((ViewGroup)localObject1);
    View localView1 = ((ViewGroup)localObject1).findViewById(Ld.topPanel);
    View localView2 = ((ViewGroup)localObject1).findViewById(Ld.contentPanel);
    View localView3 = ((ViewGroup)localObject1).findViewById(Ld.buttonPanel);
    localObject2 = a(localView1, (View)localObject2);
    localObject3 = a(localView2, (View)localObject3);
    localObject4 = a(localView3, (View)localObject4);
    b((ViewGroup)localObject3);
    a((ViewGroup)localObject4);
    d((ViewGroup)localObject2);
    int i1 = 0;
    int i2;
    if ((localObject1 != null) && (((ViewGroup)localObject1).getVisibility() != 8)) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    int i3;
    if ((localObject2 != null) && (((ViewGroup)localObject2).getVisibility() != 8)) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    boolean bool;
    if ((localObject4 != null) && (((ViewGroup)localObject4).getVisibility() != 8)) {
      bool = true;
    } else {
      bool = false;
    }
    if ((!bool) && (localObject3 != null))
    {
      localObject4 = ((ViewGroup)localObject3).findViewById(Ld.textSpacerNoButtons);
      if (localObject4 != null) {
        ((View)localObject4).setVisibility(0);
      }
    }
    if (i3 != 0)
    {
      localObject4 = this.A;
      if (localObject4 != null) {
        ((FrameLayout)localObject4).setClipToPadding(true);
      }
      localObject4 = null;
      if ((this.f != null) || (this.g != null)) {
        localObject4 = ((ViewGroup)localObject2).findViewById(Ld.titleDividerNoCustom);
      }
      if (localObject4 != null) {
        ((View)localObject4).setVisibility(0);
      }
    }
    else if (localObject3 != null)
    {
      localObject4 = ((ViewGroup)localObject3).findViewById(Ld.textSpacerNoTitle);
      if (localObject4 != null) {
        ((View)localObject4).setVisibility(0);
      }
    }
    localObject4 = this.g;
    if ((localObject4 instanceof RecycleListView)) {
      ((RecycleListView)localObject4).a(i3, bool);
    }
    if (i2 == 0)
    {
      localObject4 = this.g;
      if (localObject4 == null) {
        localObject4 = this.A;
      }
      if (localObject4 != null)
      {
        i2 = i1;
        if (bool) {
          i2 = 2;
        }
        a((ViewGroup)localObject3, (View)localObject4, i3 | i2, 3);
      }
    }
    localObject3 = this.g;
    if (localObject3 != null)
    {
      localObject4 = this.H;
      if (localObject4 != null)
      {
        ((ListView)localObject3).setAdapter((ListAdapter)localObject4);
        i2 = this.I;
        if (i2 > -1)
        {
          ((ListView)localObject3).setItemChecked(i2, true);
          ((ListView)localObject3).setSelection(i2);
        }
      }
    }
  }
  
  private void c(ViewGroup paramViewGroup)
  {
    View localView = this.h;
    int i1 = 0;
    if (localView == null) {
      if (this.i != 0) {
        localView = LayoutInflater.from(this.a).inflate(this.i, paramViewGroup, false);
      } else {
        localView = null;
      }
    }
    if (localView != null) {
      i1 = 1;
    }
    if ((i1 == 0) || (!a(localView))) {
      this.c.setFlags(131072, 131072);
    }
    if (i1 != 0)
    {
      FrameLayout localFrameLayout = (FrameLayout)this.c.findViewById(Ld.custom);
      localFrameLayout.addView(localView, new ViewGroup.LayoutParams(-1, -1));
      if (this.n) {
        localFrameLayout.setPadding(this.j, this.k, this.l, this.m);
      }
      if (this.g != null) {
        ((pa.a)paramViewGroup.getLayoutParams()).a = 0.0F;
      }
    }
    else
    {
      paramViewGroup.setVisibility(8);
    }
  }
  
  private void d(ViewGroup paramViewGroup)
  {
    if (this.G != null)
    {
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
      paramViewGroup.addView(this.G, 0, localLayoutParams);
      this.c.findViewById(Ld.title_template).setVisibility(8);
    }
    else
    {
      this.D = ((ImageView)this.c.findViewById(16908294));
      if (((TextUtils.isEmpty(this.e) ^ true)) && (this.P))
      {
        this.E = ((TextView)this.c.findViewById(Ld.alertTitle));
        this.E.setText(this.e);
        int i1 = this.B;
        if (i1 != 0)
        {
          this.D.setImageResource(i1);
        }
        else
        {
          paramViewGroup = this.C;
          if (paramViewGroup != null)
          {
            this.D.setImageDrawable(paramViewGroup);
          }
          else
          {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
          }
        }
      }
      else
      {
        this.c.findViewById(Ld.title_template).setVisibility(8);
        this.D.setVisibility(8);
        paramViewGroup.setVisibility(8);
      }
    }
  }
  
  public int a(int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    this.a.getTheme().resolveAttribute(paramInt, localTypedValue, true);
    return localTypedValue.resourceId;
  }
  
  public void a()
  {
    int i1 = b();
    this.b.setContentView(i1);
    c();
  }
  
  public void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage, Drawable paramDrawable)
  {
    Message localMessage = paramMessage;
    if (paramMessage == null)
    {
      localMessage = paramMessage;
      if (paramOnClickListener != null) {
        localMessage = this.R.obtainMessage(paramInt, paramOnClickListener);
      }
    }
    if (paramInt != -3)
    {
      if (paramInt != -2)
      {
        if (paramInt == -1)
        {
          this.p = paramCharSequence;
          this.q = localMessage;
          this.r = paramDrawable;
        }
        else
        {
          throw new IllegalArgumentException("Button does not exist");
        }
      }
      else
      {
        this.t = paramCharSequence;
        this.u = localMessage;
        this.v = paramDrawable;
      }
    }
    else
    {
      this.x = paramCharSequence;
      this.y = localMessage;
      this.z = paramDrawable;
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    this.C = paramDrawable;
    this.B = 0;
    ImageView localImageView = this.D;
    if (localImageView != null) {
      if (paramDrawable != null)
      {
        localImageView.setVisibility(0);
        this.D.setImageDrawable(paramDrawable);
      }
      else
      {
        localImageView.setVisibility(8);
      }
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.h = paramView;
    this.i = 0;
    this.n = true;
    this.j = paramInt1;
    this.k = paramInt2;
    this.l = paramInt3;
    this.m = paramInt4;
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.f = paramCharSequence;
    TextView localTextView = this.F;
    if (localTextView != null) {
      localTextView.setText(paramCharSequence);
    }
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = this.A;
    boolean bool;
    if ((localNestedScrollView != null) && (localNestedScrollView.a(paramKeyEvent))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b(int paramInt)
  {
    this.C = null;
    this.B = paramInt;
    ImageView localImageView = this.D;
    if (localImageView != null) {
      if (paramInt != 0)
      {
        localImageView.setVisibility(0);
        this.D.setImageResource(this.B);
      }
      else
      {
        localImageView.setVisibility(8);
      }
    }
  }
  
  public void b(View paramView)
  {
    this.G = paramView;
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    TextView localTextView = this.E;
    if (localTextView != null) {
      localTextView.setText(paramCharSequence);
    }
  }
  
  public boolean b(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = this.A;
    boolean bool;
    if ((localNestedScrollView != null) && (localNestedScrollView.a(paramKeyEvent))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c(int paramInt)
  {
    this.h = null;
    this.i = paramInt;
    this.n = false;
  }
  
  public void c(View paramView)
  {
    this.h = paramView;
    this.i = 0;
    this.n = false;
  }
  
  public static class RecycleListView
    extends ListView
  {
    private final int a;
    private final int b;
    
    public RecycleListView(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Pd.RecycleListView);
      this.b = paramContext.getDimensionPixelOffset(Pd.RecycleListView_paddingBottomNoButtons, -1);
      this.a = paramContext.getDimensionPixelOffset(Pd.RecycleListView_paddingTopNoTitle, -1);
    }
    
    public void a(boolean paramBoolean1, boolean paramBoolean2)
    {
      if ((!paramBoolean2) || (!paramBoolean1))
      {
        int i = getPaddingLeft();
        int j;
        if (paramBoolean1) {
          j = getPaddingTop();
        } else {
          j = this.a;
        }
        int k = getPaddingRight();
        int m;
        if (paramBoolean2) {
          m = getPaddingBottom();
        } else {
          m = this.b;
        }
        setPadding(i, j, k, m);
      }
    }
  }
  
  public static class a
  {
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E = false;
    public boolean[] F;
    public boolean G;
    public boolean H;
    public int I = -1;
    public DialogInterface.OnMultiChoiceClickListener J;
    public Cursor K;
    public String L;
    public String M;
    public AdapterView.OnItemSelectedListener N;
    public a O;
    public boolean P = true;
    public final Context a;
    public final LayoutInflater b;
    public int c = 0;
    public Drawable d;
    public int e = 0;
    public CharSequence f;
    public View g;
    public CharSequence h;
    public CharSequence i;
    public Drawable j;
    public DialogInterface.OnClickListener k;
    public CharSequence l;
    public Drawable m;
    public DialogInterface.OnClickListener n;
    public CharSequence o;
    public Drawable p;
    public DialogInterface.OnClickListener q;
    public boolean r;
    public DialogInterface.OnCancelListener s;
    public DialogInterface.OnDismissListener t;
    public DialogInterface.OnKeyListener u;
    public CharSequence[] v;
    public ListAdapter w;
    public DialogInterface.OnClickListener x;
    public int y;
    public View z;
    
    public a(Context paramContext)
    {
      this.a = paramContext;
      this.r = true;
      this.b = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    }
    
    private void b(AlertController paramAlertController)
    {
      AlertController.RecycleListView localRecycleListView = (AlertController.RecycleListView)this.b.inflate(paramAlertController.L, null);
      if (this.G)
      {
        localObject = this.K;
        if (localObject == null) {
          localObject = new h(this, this.a, paramAlertController.M, 16908308, this.v, localRecycleListView);
        } else {
          localObject = new i(this, this.a, (Cursor)localObject, false, localRecycleListView, paramAlertController);
        }
      }
      else
      {
        int i1;
        if (this.H) {
          i1 = paramAlertController.N;
        } else {
          i1 = paramAlertController.O;
        }
        localObject = this.K;
        if (localObject != null)
        {
          localObject = new SimpleCursorAdapter(this.a, i1, (Cursor)localObject, new String[] { this.L }, new int[] { 16908308 });
        }
        else
        {
          localObject = this.w;
          if (localObject == null) {
            localObject = new AlertController.c(this.a, i1, 16908308, this.v);
          }
        }
      }
      a locala = this.O;
      if (locala != null) {
        locala.a(localRecycleListView);
      }
      paramAlertController.H = ((ListAdapter)localObject);
      paramAlertController.I = this.I;
      if (this.x != null) {
        localRecycleListView.setOnItemClickListener(new j(this, paramAlertController));
      } else if (this.J != null) {
        localRecycleListView.setOnItemClickListener(new k(this, localRecycleListView, paramAlertController));
      }
      Object localObject = this.N;
      if (localObject != null) {
        localRecycleListView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject);
      }
      if (this.H) {
        localRecycleListView.setChoiceMode(1);
      } else if (this.G) {
        localRecycleListView.setChoiceMode(2);
      }
      paramAlertController.g = localRecycleListView;
    }
    
    public void a(AlertController paramAlertController)
    {
      Object localObject = this.g;
      int i1;
      if (localObject != null)
      {
        paramAlertController.b((View)localObject);
      }
      else
      {
        localObject = this.f;
        if (localObject != null) {
          paramAlertController.b((CharSequence)localObject);
        }
        localObject = this.d;
        if (localObject != null) {
          paramAlertController.a((Drawable)localObject);
        }
        i1 = this.c;
        if (i1 != 0) {
          paramAlertController.b(i1);
        }
        i1 = this.e;
        if (i1 != 0) {
          paramAlertController.b(paramAlertController.a(i1));
        }
      }
      localObject = this.h;
      if (localObject != null) {
        paramAlertController.a((CharSequence)localObject);
      }
      if ((this.i != null) || (this.j != null)) {
        paramAlertController.a(-1, this.i, this.k, null, this.j);
      }
      if ((this.l != null) || (this.m != null)) {
        paramAlertController.a(-2, this.l, this.n, null, this.m);
      }
      if ((this.o != null) || (this.p != null)) {
        paramAlertController.a(-3, this.o, this.q, null, this.p);
      }
      if ((this.v != null) || (this.K != null) || (this.w != null)) {
        b(paramAlertController);
      }
      localObject = this.z;
      if (localObject != null)
      {
        if (this.E) {
          paramAlertController.a((View)localObject, this.A, this.B, this.C, this.D);
        } else {
          paramAlertController.c((View)localObject);
        }
      }
      else
      {
        i1 = this.y;
        if (i1 != 0) {
          paramAlertController.c(i1);
        }
      }
    }
    
    public static abstract interface a
    {
      public abstract void a(ListView paramListView);
    }
  }
  
  private static final class b
    extends Handler
  {
    private WeakReference<DialogInterface> a;
    
    public b(DialogInterface paramDialogInterface)
    {
      this.a = new WeakReference(paramDialogInterface);
    }
    
    public void handleMessage(Message paramMessage)
    {
      int i = paramMessage.what;
      if ((i != -3) && (i != -2) && (i != -1))
      {
        if (i == 1) {
          ((DialogInterface)paramMessage.obj).dismiss();
        }
      }
      else {
        ((DialogInterface.OnClickListener)paramMessage.obj).onClick((DialogInterface)this.a.get(), paramMessage.what);
      }
    }
  }
  
  private static class c
    extends ArrayAdapter<CharSequence>
  {
    public c(Context paramContext, int paramInt1, int paramInt2, CharSequence[] paramArrayOfCharSequence)
    {
      super(paramInt1, paramInt2, paramArrayOfCharSequence);
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public boolean hasStableIds()
    {
      return true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/AlertController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */