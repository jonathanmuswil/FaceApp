package io.faceapp.ui.rate_us.item;

import GVa;
import QQa;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;

public final class StarsRatingView
  extends ConstraintLayout
  implements jta<a>
{
  private final GVa<Integer> u;
  private HashMap v;
  
  public StarsRatingView(Context paramContext)
  {
    super(paramContext);
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create<Int>()");
    this.u = localGVa;
    setupView(paramContext);
  }
  
  public StarsRatingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = GVa.t();
    oXa.a(paramAttributeSet, "PublishSubject.create<Int>()");
    this.u = paramAttributeSet;
    setupView(paramContext);
  }
  
  public StarsRatingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = GVa.t();
    oXa.a(paramAttributeSet, "PublishSubject.create<Int>()");
    this.u = paramAttributeSet;
    setupView(paramContext);
  }
  
  private final void d(int paramInt)
  {
    ImageView localImageView = (ImageView)c(k.star1View);
    int i = 2131231033;
    int j;
    if (paramInt >= 1) {
      j = 2131231033;
    } else {
      j = 2131231032;
    }
    localImageView.setImageResource(j);
    localImageView = (ImageView)c(k.star2View);
    if (paramInt >= 2) {
      j = 2131231033;
    } else {
      j = 2131231032;
    }
    localImageView.setImageResource(j);
    localImageView = (ImageView)c(k.star3View);
    if (paramInt >= 3) {
      j = 2131231033;
    } else {
      j = 2131231032;
    }
    localImageView.setImageResource(j);
    localImageView = (ImageView)c(k.star4View);
    if (paramInt >= 4) {
      j = 2131231033;
    } else {
      j = 2131231032;
    }
    localImageView.setImageResource(j);
    localImageView = (ImageView)c(k.star5View);
    if (paramInt >= 5) {
      paramInt = i;
    } else {
      paramInt = 2131231032;
    }
    localImageView.setImageResource(paramInt);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493147, this);
    paramContext = (ImageView)c(k.star1View);
    oXa.a(paramContext, "star1View");
    paramContext.setOnClickListener(new a(this));
    paramContext = (ImageView)c(k.star2View);
    oXa.a(paramContext, "star2View");
    paramContext.setOnClickListener(new b(this));
    paramContext = (ImageView)c(k.star3View);
    oXa.a(paramContext, "star3View");
    paramContext.setOnClickListener(new c(this));
    paramContext = (ImageView)c(k.star4View);
    oXa.a(paramContext, "star4View");
    paramContext.setOnClickListener(new d(this));
    paramContext = (ImageView)c(k.star5View);
    oXa.a(paramContext, "star5View");
    paramContext.setOnClickListener(new e(this));
    if (isInEditMode()) {
      a(new StarsRatingView.a.b(4));
    }
  }
  
  public final QQa<Integer> a()
  {
    QQa localQQa = this.u.i();
    oXa.a(localQQa, "clickSubject.hide()");
    return localQQa;
  }
  
  public void a(a parama)
  {
    oXa.b(parama, "model");
    int i;
    if ((parama instanceof StarsRatingView.a.b)) {
      i = ((StarsRatingView.a.b)parama).a();
    } else {
      i = 0;
    }
    d(i);
  }
  
  public View c(int paramInt)
  {
    if (this.v == null) {
      this.v = new HashMap();
    }
    View localView1 = (View)this.v.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.v.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static abstract class a
  {
    public static final class a
      extends StarsRatingView.a
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends StarsRatingView.a
    {
      private final int a;
      
      public b(int paramInt)
      {
        super();
        this.a = paramInt;
      }
      
      public final int a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            int i;
            if (this.a == ((b)paramObject).a) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {}
          }
          else
          {
            return false;
          }
        }
        return true;
      }
      
      public int hashCode()
      {
        return this.a;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Rated(rating=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/rate_us/item/StarsRatingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */