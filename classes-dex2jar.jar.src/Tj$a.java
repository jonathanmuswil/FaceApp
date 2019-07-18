import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class tj$a
{
  static Integer a;
  private final View b;
  private final List<rj> c = new ArrayList();
  boolean d;
  private tj.a.a e;
  
  tj$a(View paramView)
  {
    this.b = paramView;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt3;
    if (i > 0) {
      return i;
    }
    if ((this.d) && (this.b.isLayoutRequested())) {
      return 0;
    }
    paramInt1 -= paramInt3;
    if (paramInt1 > 0) {
      return paramInt1;
    }
    if ((!this.b.isLayoutRequested()) && (paramInt2 == -2))
    {
      if (Log.isLoggable("ViewTarget", 4)) {
        Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
      }
      return a(this.b.getContext());
    }
    return 0;
  }
  
  private static int a(Context paramContext)
  {
    if (a == null)
    {
      paramContext = (WindowManager)paramContext.getSystemService("window");
      Nj.a(paramContext);
      paramContext = ((WindowManager)paramContext).getDefaultDisplay();
      Point localPoint = new Point();
      paramContext.getSize(localPoint);
      a = Integer.valueOf(Math.max(localPoint.x, localPoint.y));
    }
    return a.intValue();
  }
  
  private boolean a(int paramInt)
  {
    boolean bool;
    if ((paramInt <= 0) && (paramInt != Integer.MIN_VALUE)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean a(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((a(paramInt1)) && (a(paramInt2))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    Iterator localIterator = new ArrayList(this.c).iterator();
    while (localIterator.hasNext()) {
      ((rj)localIterator.next()).a(paramInt1, paramInt2);
    }
  }
  
  private int c()
  {
    int i = this.b.getPaddingTop();
    int j = this.b.getPaddingBottom();
    ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
    int k;
    if (localLayoutParams != null) {
      k = localLayoutParams.height;
    } else {
      k = 0;
    }
    return a(this.b.getHeight(), k, i + j);
  }
  
  private int d()
  {
    int i = this.b.getPaddingLeft();
    int j = this.b.getPaddingRight();
    ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
    int k;
    if (localLayoutParams != null) {
      k = localLayoutParams.width;
    } else {
      k = 0;
    }
    return a(this.b.getWidth(), k, i + j);
  }
  
  void a()
  {
    if (this.c.isEmpty()) {
      return;
    }
    int i = d();
    int j = c();
    if (!a(i, j)) {
      return;
    }
    b(i, j);
    b();
  }
  
  void a(rj paramrj)
  {
    int i = d();
    int j = c();
    if (a(i, j))
    {
      paramrj.a(i, j);
      return;
    }
    if (!this.c.contains(paramrj)) {
      this.c.add(paramrj);
    }
    if (this.e == null)
    {
      paramrj = this.b.getViewTreeObserver();
      this.e = new tj.a.a(this);
      paramrj.addOnPreDrawListener(this.e);
    }
  }
  
  void b()
  {
    ViewTreeObserver localViewTreeObserver = this.b.getViewTreeObserver();
    if (localViewTreeObserver.isAlive()) {
      localViewTreeObserver.removeOnPreDrawListener(this.e);
    }
    this.e = null;
    this.c.clear();
  }
  
  void b(rj paramrj)
  {
    this.c.remove(paramrj);
  }
  
  private static final class a
    implements ViewTreeObserver.OnPreDrawListener
  {
    private final WeakReference<tj.a> a;
    
    a(tj.a parama)
    {
      this.a = new WeakReference(parama);
    }
    
    public boolean onPreDraw()
    {
      if (Log.isLoggable("ViewTarget", 2))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("OnGlobalLayoutListener called attachStateListener=");
        ((StringBuilder)localObject).append(this);
        Log.v("ViewTarget", ((StringBuilder)localObject).toString());
      }
      Object localObject = (tj.a)this.a.get();
      if (localObject != null) {
        ((tj.a)localObject).a();
      }
      return true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tj$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */