package io.faceapp.ui.components;

import KOa;
import UPa;
import UVa;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;

public final class ShareButtonView
  extends ConstraintLayout
  implements jta<a>
{
  private HashMap u;
  
  public ShareButtonView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public ShareButtonView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public ShareButtonView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void d()
  {
    Object localObject = (ImageView)c(k.iconView);
    oXa.a(localObject, "iconView");
    UPa.e((View)localObject);
    ((ImageView)c(k.iconView)).setImageResource(2131230998);
    localObject = c(k.separatorView);
    oXa.a(localObject, "separatorView");
    UPa.e((View)localObject);
    ((TextView)c(k.labelView)).setText(2131689660);
    setBackgroundResource(2131230854);
  }
  
  private final void e()
  {
    Object localObject = (ImageView)c(k.iconView);
    oXa.a(localObject, "iconView");
    UPa.a((View)localObject);
    localObject = c(k.separatorView);
    oXa.a(localObject, "separatorView");
    UPa.a((View)localObject);
    ((TextView)c(k.labelView)).setText(2131689667);
    setBackgroundResource(2131230852);
  }
  
  private final void f()
  {
    Object localObject = (ImageView)c(k.iconView);
    oXa.a(localObject, "iconView");
    UPa.e((View)localObject);
    ((ImageView)c(k.iconView)).setImageResource(2131231007);
    localObject = c(k.separatorView);
    oXa.a(localObject, "separatorView");
    UPa.e((View)localObject);
    ((TextView)c(k.labelView)).setText(2131689661);
    setBackgroundResource(2131230852);
  }
  
  private final void g()
  {
    Object localObject = (ImageView)c(k.iconView);
    oXa.a(localObject, "iconView");
    UPa.a((View)localObject);
    localObject = c(k.separatorView);
    oXa.a(localObject, "separatorView");
    UPa.a((View)localObject);
    ((TextView)c(k.labelView)).setText(2131689934);
    setBackgroundResource(2131230852);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493146, this);
    setMinimumWidth((int)KOa.b.a(paramContext, 138));
    setPaddingRelative((int)KOa.b.a(paramContext, 8), 0, 0, 0);
    if (isInEditMode()) {
      a(ShareButtonView.a.a.a);
    }
  }
  
  public void a(a parama)
  {
    oXa.b(parama, "model");
    if ((parama instanceof ShareButtonView.a.a))
    {
      d();
    }
    else if ((parama instanceof ShareButtonView.a.c))
    {
      f();
    }
    else if ((parama instanceof ShareButtonView.a.d))
    {
      g();
    }
    else
    {
      if (!(parama instanceof ShareButtonView.a.b)) {
        break label60;
      }
      e();
    }
    return;
    label60:
    throw new UVa();
  }
  
  public View c(int paramInt)
  {
    if (this.u == null) {
      this.u = new HashMap();
    }
    View localView1 = (View)this.u.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.u.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static abstract class a
  {
    public static final class a
      extends ShareButtonView.a
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends ShareButtonView.a
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends ShareButtonView.a
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends ShareButtonView.a
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/ShareButtonView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */