package android.support.v7.view.menu;

import Jd;
import Md;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.view.y;
import android.support.v7.widget.va;
import android.support.v7.widget.wa;
import android.support.v7.widget.xa;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class i
  extends s
  implements v, View.OnKeyListener, PopupWindow.OnDismissListener
{
  private static final int b = Md.abc_cascading_menu_item_layout;
  private PopupWindow.OnDismissListener A;
  boolean B;
  private final Context c;
  private final int d;
  private final int e;
  private final int f;
  private final boolean g;
  final Handler h;
  private final List<l> i = new ArrayList();
  final List<a> j = new ArrayList();
  final ViewTreeObserver.OnGlobalLayoutListener k = new e(this);
  private final View.OnAttachStateChangeListener l = new f(this);
  private final wa m = new h(this);
  private int n = 0;
  private int o = 0;
  private View p;
  View q;
  private int r;
  private boolean s;
  private boolean t;
  private int u;
  private int v;
  private boolean w;
  private boolean x;
  private v.a y;
  ViewTreeObserver z;
  
  public i(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.c = paramContext;
    this.p = paramView;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramBoolean;
    this.w = false;
    this.r = e();
    paramContext = paramContext.getResources();
    this.d = Math.max(paramContext.getDisplayMetrics().widthPixels / 2, paramContext.getDimensionPixelSize(Jd.abc_config_prefDialogWidth));
    this.h = new Handler();
  }
  
  private MenuItem a(l paraml1, l paraml2)
  {
    int i1 = paraml1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      MenuItem localMenuItem = paraml1.getItem(i2);
      if ((localMenuItem.hasSubMenu()) && (paraml2 == localMenuItem.getSubMenu())) {
        return localMenuItem;
      }
    }
    return null;
  }
  
  private View a(a parama, l paraml)
  {
    paraml = a(parama.b, paraml);
    if (paraml == null) {
      return null;
    }
    ListView localListView = parama.a();
    parama = localListView.getAdapter();
    boolean bool = parama instanceof HeaderViewListAdapter;
    int i1 = 0;
    int i2;
    if (bool)
    {
      parama = (HeaderViewListAdapter)parama;
      i2 = parama.getHeadersCount();
      parama = (k)parama.getWrappedAdapter();
    }
    else
    {
      parama = (k)parama;
      i2 = 0;
    }
    int i3 = parama.getCount();
    while (i1 < i3)
    {
      if (paraml == parama.getItem(i1)) {
        break label105;
      }
      i1++;
    }
    i1 = -1;
    label105:
    if (i1 == -1) {
      return null;
    }
    i1 = i1 + i2 - localListView.getFirstVisiblePosition();
    if ((i1 >= 0) && (i1 < localListView.getChildCount())) {
      return localListView.getChildAt(i1);
    }
    return null;
  }
  
  private int c(l paraml)
  {
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (paraml == ((a)this.j.get(i2)).b) {
        return i2;
      }
    }
    return -1;
  }
  
  private int d(int paramInt)
  {
    Object localObject = this.j;
    localObject = ((a)((List)localObject).get(((List)localObject).size() - 1)).a();
    int[] arrayOfInt = new int[2];
    ((ListView)localObject).getLocationOnScreen(arrayOfInt);
    Rect localRect = new Rect();
    this.q.getWindowVisibleDisplayFrame(localRect);
    if (this.r == 1)
    {
      if (arrayOfInt[0] + ((ListView)localObject).getWidth() + paramInt > localRect.right) {
        return 0;
      }
      return 1;
    }
    if (arrayOfInt[0] - paramInt < 0) {
      return 1;
    }
    return 0;
  }
  
  private xa d()
  {
    xa localxa = new xa(this.c, null, this.e, this.f);
    localxa.a(this.m);
    localxa.a(this);
    localxa.a(this);
    localxa.b(this.p);
    localxa.c(this.o);
    localxa.a(true);
    localxa.f(2);
    return localxa;
  }
  
  private void d(l paraml)
  {
    Object localObject1 = LayoutInflater.from(this.c);
    Object localObject2 = new k(paraml, (LayoutInflater)localObject1, this.g, b);
    if ((!L()) && (this.w)) {
      ((k)localObject2).a(true);
    } else if (L()) {
      ((k)localObject2).a(s.b(paraml));
    }
    int i1 = s.a((ListAdapter)localObject2, null, this.c, this.d);
    xa localxa = d();
    localxa.a((ListAdapter)localObject2);
    localxa.b(i1);
    localxa.c(this.o);
    if (this.j.size() > 0)
    {
      localObject2 = this.j;
      localObject2 = (a)((List)localObject2).get(((List)localObject2).size() - 1);
      localObject3 = a((a)localObject2, paraml);
    }
    else
    {
      localObject2 = null;
      localObject3 = localObject2;
    }
    if (localObject3 != null)
    {
      localxa.c(false);
      localxa.a(null);
      int i2 = d(i1);
      int i3;
      if (i2 == 1) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      this.r = i2;
      int i4;
      if (Build.VERSION.SDK_INT >= 26)
      {
        localxa.b((View)localObject3);
        i2 = 0;
        i4 = 0;
      }
      else
      {
        int[] arrayOfInt1 = new int[2];
        this.p.getLocationOnScreen(arrayOfInt1);
        int[] arrayOfInt2 = new int[2];
        ((View)localObject3).getLocationOnScreen(arrayOfInt2);
        if ((this.o & 0x7) == 5)
        {
          arrayOfInt1[0] += this.p.getWidth();
          arrayOfInt2[0] += ((View)localObject3).getWidth();
        }
        i4 = arrayOfInt2[0] - arrayOfInt1[0];
        i2 = arrayOfInt2[1] - arrayOfInt1[1];
      }
      if ((this.o & 0x5) == 5)
      {
        if (i3 == 0)
        {
          i1 = ((View)localObject3).getWidth();
          break label365;
        }
      }
      else
      {
        if (i3 == 0) {
          break label365;
        }
        i1 = ((View)localObject3).getWidth();
      }
      i1 = i4 + i1;
      break label372;
      label365:
      i1 = i4 - i1;
      label372:
      localxa.e(i1);
      localxa.b(true);
      localxa.i(i2);
    }
    else
    {
      if (this.s) {
        localxa.e(this.u);
      }
      if (this.t) {
        localxa.i(this.v);
      }
      localxa.a(c());
    }
    Object localObject3 = new a(localxa, paraml, this.r);
    this.j.add(localObject3);
    localxa.K();
    localObject3 = localxa.M();
    ((ListView)localObject3).setOnKeyListener(this);
    if ((localObject2 == null) && (this.x) && (paraml.h() != null))
    {
      localObject1 = (FrameLayout)((LayoutInflater)localObject1).inflate(Md.abc_popup_menu_header_item_layout, (ViewGroup)localObject3, false);
      localObject2 = (TextView)((FrameLayout)localObject1).findViewById(16908310);
      ((FrameLayout)localObject1).setEnabled(false);
      ((TextView)localObject2).setText(paraml.h());
      ((ListView)localObject3).addHeaderView((View)localObject1, null, false);
      localxa.K();
    }
  }
  
  private int e()
  {
    int i1 = y.l(this.p);
    int i2 = 1;
    if (i1 == 1) {
      i2 = 0;
    }
    return i2;
  }
  
  public void K()
  {
    if (L()) {
      return;
    }
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext()) {
      d((l)localIterator.next());
    }
    this.i.clear();
    this.q = this.p;
    if (this.q != null)
    {
      int i1;
      if (this.z == null) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      this.z = this.q.getViewTreeObserver();
      if (i1 != 0) {
        this.z.addOnGlobalLayoutListener(this.k);
      }
      this.q.addOnAttachStateChangeListener(this.l);
    }
  }
  
  public boolean L()
  {
    int i1 = this.j.size();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i1 > 0)
    {
      bool2 = bool1;
      if (((a)this.j.get(0)).a.L()) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public ListView M()
  {
    Object localObject;
    if (this.j.isEmpty())
    {
      localObject = null;
    }
    else
    {
      localObject = this.j;
      localObject = ((a)((List)localObject).get(((List)localObject).size() - 1)).a();
    }
    return (ListView)localObject;
  }
  
  public void a(int paramInt)
  {
    if (this.n != paramInt)
    {
      this.n = paramInt;
      this.o = android.support.v4.view.f.a(paramInt, y.l(this.p));
    }
  }
  
  public void a(l paraml)
  {
    paraml.a(this, this.c);
    if (L()) {
      d(paraml);
    } else {
      this.i.add(paraml);
    }
  }
  
  public void a(l paraml, boolean paramBoolean)
  {
    int i1 = c(paraml);
    if (i1 < 0) {
      return;
    }
    int i2 = i1 + 1;
    if (i2 < this.j.size()) {
      ((a)this.j.get(i2)).b.a(false);
    }
    Object localObject = (a)this.j.remove(i1);
    ((a)localObject).b.b(this);
    if (this.B)
    {
      ((a)localObject).a.b(null);
      ((a)localObject).a.a(0);
    }
    ((a)localObject).a.dismiss();
    i1 = this.j.size();
    if (i1 > 0) {
      this.r = ((a)this.j.get(i1 - 1)).c;
    } else {
      this.r = e();
    }
    if (i1 == 0)
    {
      dismiss();
      localObject = this.y;
      if (localObject != null) {
        ((v.a)localObject).a(paraml, true);
      }
      paraml = this.z;
      if (paraml != null)
      {
        if (paraml.isAlive()) {
          this.z.removeGlobalOnLayoutListener(this.k);
        }
        this.z = null;
      }
      this.q.removeOnAttachStateChangeListener(this.l);
      this.A.onDismiss();
    }
    else if (paramBoolean)
    {
      ((a)this.j.get(0)).b.a(false);
    }
  }
  
  public void a(v.a parama)
  {
    this.y = parama;
  }
  
  public void a(View paramView)
  {
    if (this.p != paramView)
    {
      this.p = paramView;
      this.o = android.support.v4.view.f.a(this.n, y.l(this.p));
    }
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.A = paramOnDismissListener;
  }
  
  public void a(boolean paramBoolean)
  {
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext()) {
      s.a(((a)localIterator.next()).a().getAdapter()).notifyDataSetChanged();
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public boolean a(D paramD)
  {
    Object localObject = this.j.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if (paramD == locala.b)
      {
        locala.a().requestFocus();
        return true;
      }
    }
    if (paramD.hasVisibleItems())
    {
      a(paramD);
      localObject = this.y;
      if (localObject != null) {
        ((v.a)localObject).a(paramD);
      }
      return true;
    }
    return false;
  }
  
  public void b(int paramInt)
  {
    this.s = true;
    this.u = paramInt;
  }
  
  public void b(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  protected boolean b()
  {
    return false;
  }
  
  public void c(int paramInt)
  {
    this.t = true;
    this.v = paramInt;
  }
  
  public void c(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }
  
  public void dismiss()
  {
    int i1 = this.j.size();
    if (i1 > 0)
    {
      a[] arrayOfa = (a[])this.j.toArray(new a[i1]);
      i1--;
      while (i1 >= 0)
      {
        a locala = arrayOfa[i1];
        if (locala.a.L()) {
          locala.a.dismiss();
        }
        i1--;
      }
    }
  }
  
  public void onDismiss()
  {
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      locala = (a)this.j.get(i2);
      if (!locala.a.L()) {
        break label52;
      }
    }
    a locala = null;
    label52:
    if (locala != null) {
      locala.b.a(false);
    }
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  private static class a
  {
    public final xa a;
    public final l b;
    public final int c;
    
    public a(xa paramxa, l paraml, int paramInt)
    {
      this.a = paramxa;
      this.b = paraml;
      this.c = paramInt;
    }
    
    public ListView a()
    {
      return this.a.M();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */