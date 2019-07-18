package com.zhihu.matisse.internal.ui.widget;

import AY;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.x;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import lY;
import mY;
import rY;
import yY;

public class MediaGrid
  extends SquareFrameLayout
  implements View.OnClickListener
{
  private ImageView a;
  private yY b;
  private b c;
  private a d;
  
  public MediaGrid(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public MediaGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(mY.media_grid_content, this, true);
    this.a = ((ImageView)findViewById(lY.media_thumbnail));
    this.a.setOnClickListener(this);
  }
  
  private void h()
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (this.b.n())
    {
      localObject1 = AY.b().p;
      localObject2 = getContext();
      localObject3 = this.c;
      ((rY)localObject1).b((Context)localObject2, ((b)localObject3).a, ((b)localObject3).b, this.a, this.b.l());
    }
    else
    {
      localObject3 = AY.b().p;
      localObject1 = getContext();
      localObject2 = this.c;
      ((rY)localObject3).a((Context)localObject1, ((b)localObject2).a, ((b)localObject2).b, this.a, this.b.l());
    }
  }
  
  public void a(b paramb)
  {
    this.c = paramb;
  }
  
  public void a(yY paramyY)
  {
    this.b = paramyY;
    h();
  }
  
  public yY getMedia()
  {
    return this.b;
  }
  
  public void onClick(View paramView)
  {
    paramView = this.d;
    if (paramView != null) {
      paramView.a(this.a, this.b, this.c.d);
    }
  }
  
  public void setOnMediaGridClickListener(a parama)
  {
    this.d = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a(ImageView paramImageView, yY paramyY, RecyclerView.x paramx);
  }
  
  public static class b
  {
    int a;
    Drawable b;
    boolean c;
    RecyclerView.x d;
    
    public b(int paramInt, Drawable paramDrawable, boolean paramBoolean, RecyclerView.x paramx)
    {
      this.a = paramInt;
      this.b = paramDrawable;
      this.c = paramBoolean;
      this.d = paramx;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/internal/ui/widget/MediaGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */