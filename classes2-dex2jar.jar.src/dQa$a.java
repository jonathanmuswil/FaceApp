import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.c;
import android.support.v4.widget.DrawerLayout.d;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ScrollView;
import io.palaima.debugdrawer.view.DebugView;
import io.palaima.debugdrawer.view.ScrimInsetsFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dQa$a
{
  private ViewGroup a;
  private Activity b;
  private DrawerLayout c;
  private ScrollView d;
  private int e = 8388613;
  private int f = -1;
  private pQa[] g;
  private DrawerLayout.c h;
  private int i = 0;
  private int j = -1;
  private Drawable k;
  private int l = -1;
  private int m = -1;
  private DebugView n;
  private ScrimInsetsFrameLayout o;
  
  public dQa$a(Activity paramActivity)
  {
    this.a = ((ViewGroup)paramActivity.findViewById(16908290));
    this.b = paramActivity;
  }
  
  private DrawerLayout.d a(DrawerLayout.d paramd)
  {
    if (paramd != null)
    {
      int i1 = this.e;
      if ((i1 != 0) && ((i1 == 5) || (i1 == 8388613)))
      {
        paramd.rightMargin = 0;
        if (Build.VERSION.SDK_INT >= 17) {
          paramd.setMarginEnd(0);
        }
        paramd.leftMargin = this.b.getResources().getDimensionPixelSize(fQa.dd_debug_drawer_margin);
        if (Build.VERSION.SDK_INT >= 17) {
          paramd.setMarginEnd(this.b.getResources().getDimensionPixelSize(fQa.dd_debug_drawer_margin));
        }
      }
      i1 = this.f;
      if (i1 > -1) {
        paramd.width = i1;
      } else {
        paramd.width = vQa.b(this.b);
      }
    }
    return paramd;
  }
  
  public a a(pQa... paramVarArgs)
  {
    this.g = paramVarArgs;
    return this;
  }
  
  public dQa a()
  {
    if (this.b != null)
    {
      Object localObject1 = this.a;
      if ((localObject1 != null) && (((ViewGroup)localObject1).getChildCount() != 0))
      {
        Object localObject2 = this.b.getLayoutInflater();
        int i1 = this.m;
        localObject1 = localObject2;
        if (i1 > 0) {
          localObject1 = ((LayoutInflater)localObject2).cloneInContext(new ContextThemeWrapper(this.b, i1));
        }
        this.c = ((DrawerLayout)((LayoutInflater)localObject1).inflate(hQa.dd_debug_drawer, this.a, false));
        if (this.a.getChildAt(0).getId() == gQa.dd_drawer_layout) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        localObject1 = new ArrayList(this.a.getChildCount());
        for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
          ((List)localObject1).add(this.a.getChildAt(i2));
        }
        this.o = ((ScrimInsetsFrameLayout)this.c.getChildAt(0));
        View localView;
        if (i1 == 0)
        {
          localObject2 = ((List)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localView = (View)((Iterator)localObject2).next();
            this.a.removeView(localView);
          }
        }
        this.a.removeAllViews();
        localObject2 = new FrameLayout.LayoutParams(-1, -1);
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localView = (View)((Iterator)localObject1).next();
          this.o.addView(localView, (ViewGroup.LayoutParams)localObject2);
        }
        this.a.addView(this.c, new ViewGroup.LayoutParams(-1, -1));
        localObject1 = new bQa(this);
        this.a.addOnAttachStateChangeListener(new cQa(this, (DrawerLayout.c)localObject1));
        this.d = ((ScrollView)this.c.findViewById(gQa.dd_slider_layout));
        this.n = ((DebugView)this.d.findViewById(gQa.dd_debug_view));
        localObject1 = (DrawerLayout.d)this.d.getLayoutParams();
        if (localObject1 != null)
        {
          i1 = this.e;
          if (i1 != 0) {
            ((DrawerLayout.d)localObject1).a = i1;
          }
          a((DrawerLayout.d)localObject1);
          this.d.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
        i1 = this.i;
        if (i1 != 0)
        {
          this.d.setBackgroundColor(i1);
        }
        else
        {
          i1 = this.j;
          if (i1 != -1)
          {
            this.d.setBackgroundColor(this.b.getResources().getColor(this.j));
          }
          else
          {
            localObject1 = this.k;
            if (localObject1 != null) {
              vQa.a(this.d, (Drawable)localObject1);
            } else if (this.l != -1) {
              vQa.a(this.d, i1);
            }
          }
        }
        this.n.a(this.g);
        localObject1 = new dQa(this, null);
        this.b.getApplication().registerActivityLifecycleCallbacks(new eQa(this.b, (dQa)localObject1));
        this.b = null;
        return (dQa)localObject1;
      }
      throw new RuntimeException("You have to set your layout for this activity with setContentView() first.");
    }
    throw new RuntimeException("please pass an activity");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dQa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */