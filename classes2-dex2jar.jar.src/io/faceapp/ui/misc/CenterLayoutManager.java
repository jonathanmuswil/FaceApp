package io.faceapp.ui.misc;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.t;
import android.support.v7.widget.RecyclerView.u;
import android.support.v7.widget.ra;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import oXa;

public final class CenterLayoutManager
  extends LinearLayoutManager
{
  public static final b H = new b(null);
  private boolean I;
  private final int J;
  
  public CenterLayoutManager(Context paramContext)
  {
    this(paramContext, 0, false, false, 0, 24, null);
  }
  
  public CenterLayoutManager(Context paramContext, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    super(paramContext, paramInt1, paramBoolean1);
    this.J = paramInt2;
    this.I = paramBoolean2;
  }
  
  public void a(RecyclerView paramRecyclerView, RecyclerView.u paramu, int paramInt)
  {
    oXa.b(paramRecyclerView, "recyclerView");
    if (this.I)
    {
      paramRecyclerView = paramRecyclerView.getContext();
      oXa.a(paramRecyclerView, "recyclerView.context");
      paramRecyclerView = new a(paramRecyclerView);
      paramRecyclerView.c(paramInt);
      b(paramRecyclerView);
    }
    else
    {
      f(paramInt, (paramRecyclerView.getWidth() - paramRecyclerView.getPaddingStart() - paramRecyclerView.getPaddingEnd() - this.J) / 2);
      this.I = true;
    }
  }
  
  private final class a
    extends ra
  {
    public a()
    {
      super();
    }
    
    protected float a(DisplayMetrics paramDisplayMetrics)
    {
      oXa.b(paramDisplayMetrics, "displayMetrics");
      return 150.0F / paramDisplayMetrics.densityDpi;
    }
    
    public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      return paramInt3 + (paramInt4 - paramInt3) / 2 - (paramInt1 + (paramInt2 - paramInt1) / 2);
    }
  }
  
  public static final class b {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/CenterLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */