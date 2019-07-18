package io.faceapp.ui.components;

import UPa;
import UVa;
import Vd;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import bXa;
import cWa;
import io.faceapp.k;
import io.faceapp.l;
import java.util.HashMap;
import oXa;

public final class AppBar
  extends ConstraintLayout
{
  private static final int u = 0;
  @Deprecated
  public static final a v = new a(null);
  private HashMap A;
  private int w = u;
  private int x = -16777216;
  private b y = AppBar.b.d.c;
  private String z;
  
  public AppBar(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  public AppBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  private final Drawable a(b paramb)
  {
    boolean bool = oXa.a(paramb, AppBar.b.d.c);
    Object localObject = null;
    if (bool)
    {
      paramb = (b)localObject;
    }
    else if ((paramb instanceof AppBar.b.f))
    {
      paramb = (b)localObject;
    }
    else if (oXa.a(paramb, AppBar.b.a.c))
    {
      Drawable localDrawable = Vd.b(getContext(), 2131230959);
      paramb = (b)localObject;
      if (localDrawable != null)
      {
        localDrawable.setAutoMirrored(true);
        paramb = localDrawable;
      }
    }
    else if (oXa.a(paramb, AppBar.b.b.c))
    {
      paramb = Vd.b(getContext(), 2131230965);
    }
    else
    {
      if (!oXa.a(paramb, AppBar.b.e.c)) {
        break label116;
      }
      paramb = Vd.b(getContext(), 2131231045);
    }
    return paramb;
    label116:
    throw new UVa();
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    ViewGroup.inflate(paramContext, 2131493111, this);
    setClickable(true);
    if (paramAttributeSet != null)
    {
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, l.AppBar);
      int i = paramAttributeSet.getInt(2, this.y.a());
      this.w = paramAttributeSet.getColor(0, u);
      this.x = paramAttributeSet.getColor(3, -16777216);
      this.y = b.a.a(i);
      this.z = paramAttributeSet.getString(1);
      paramContext = this.z;
      if ((paramContext != null) && ((this.y instanceof AppBar.b.f))) {
        this.y = new AppBar.b.f(paramContext);
      }
      paramAttributeSet.recycle();
      a(this, this.y, null, 2, null);
    }
  }
  
  public final void a(Context paramContext, int paramInt, Integer paramInteger, bXa<cWa> parambXa)
  {
    oXa.b(paramContext, "context");
    oXa.b(parambXa, "onNavigationClick");
    if ((oXa.a(this.y, AppBar.b.d.c) ^ true)) {
      a(this.y, parambXa);
    }
    ((TextView)c(k.titleView)).setText(paramInt);
    ((TextView)c(k.titleView)).setTextColor(this.x);
    if (paramInteger != null)
    {
      paramInteger.intValue();
      ((FrameLayout)c(k.customButtonsView)).addView(LayoutInflater.from(paramContext).inflate(paramInteger.intValue(), (FrameLayout)c(k.customButtonsView), false));
    }
  }
  
  public final void a(b paramb, bXa<cWa> parambXa)
  {
    oXa.b(paramb, "navType");
    oXa.b(parambXa, "onClick");
    this.y = paramb;
    if (oXa.a(paramb, AppBar.b.d.c))
    {
      paramb = (ImageButton)c(k.navigationIconView);
      oXa.a(paramb, "navigationIconView");
      UPa.a(paramb);
      paramb = (TextView)c(k.navigationTextView);
      oXa.a(paramb, "navigationTextView");
      UPa.a(paramb);
    }
    else
    {
      Object localObject;
      if ((paramb instanceof AppBar.b.f))
      {
        localObject = (TextView)c(k.navigationTextView);
        oXa.a(localObject, "navigationTextView");
        ((TextView)localObject).setText(((AppBar.b.f)paramb).b());
        paramb = (TextView)c(k.navigationTextView);
        oXa.a(paramb, "navigationTextView");
        UPa.e(paramb);
        paramb = (TextView)c(k.navigationTextView);
        oXa.a(paramb, "navigationTextView");
        paramb.setOnClickListener(new b(parambXa));
        paramb = (ImageButton)c(k.navigationIconView);
        oXa.a(paramb, "navigationIconView");
        UPa.a(paramb);
      }
      else
      {
        localObject = (TextView)c(k.navigationTextView);
        oXa.a(localObject, "navigationTextView");
        UPa.a((View)localObject);
        paramb = a(paramb);
        if (paramb != null)
        {
          if (this.w != u)
          {
            paramb.mutate();
            paramb.setColorFilter(this.w, PorterDuff.Mode.SRC_ATOP);
          }
          localObject = (ImageButton)c(k.navigationIconView);
          oXa.a(localObject, "navigationIconView");
          UPa.e((View)localObject);
          localObject = (ImageButton)c(k.navigationIconView);
          oXa.a(localObject, "navigationIconView");
          ((View)localObject).setOnClickListener(new a(this, parambXa));
          ((ImageButton)c(k.navigationIconView)).setImageDrawable(paramb);
        }
        else
        {
          paramb = (ImageButton)c(k.navigationIconView);
          oXa.a(paramb, "navigationIconView");
          UPa.a(paramb);
        }
      }
    }
  }
  
  public View c(int paramInt)
  {
    if (this.A == null) {
      this.A = new HashMap();
    }
    View localView1 = (View)this.A.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.A.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public final void i(boolean paramBoolean)
  {
    ImageView localImageView;
    if (paramBoolean)
    {
      localImageView = (ImageView)c(k.labelView);
      oXa.a(localImageView, "labelView");
      UPa.e(localImageView);
    }
    else
    {
      localImageView = (ImageView)c(k.labelView);
      oXa.a(localImageView, "labelView");
      UPa.a(localImageView);
    }
  }
  
  public final void j(boolean paramBoolean)
  {
    FrameLayout localFrameLayout = (FrameLayout)c(k.customButtonsView);
    if (paramBoolean) {
      UPa.e(localFrameLayout);
    } else {
      UPa.c(localFrameLayout);
    }
  }
  
  public final void setTitle(int paramInt)
  {
    ((TextView)c(k.titleView)).setText(paramInt);
  }
  
  public final void setTitle(String paramString)
  {
    TextView localTextView = (TextView)c(k.titleView);
    oXa.a(localTextView, "titleView");
    localTextView.setText(paramString);
  }
  
  private static final class a {}
  
  public static abstract class b
  {
    public static final c a = new c(null);
    private final int b;
    
    private b(int paramInt)
    {
      this.b = paramInt;
    }
    
    public final int a()
    {
      return this.b;
    }
    
    public static final class a
      extends AppBar.b
    {
      public static final a c = new a();
      
      private a()
      {
        super(null);
      }
    }
    
    public static final class b
      extends AppBar.b
    {
      public static final b c = new b();
      
      private b()
      {
        super(null);
      }
    }
    
    public static final class c
    {
      public final AppBar.b a(int paramInt)
      {
        Object localObject;
        if (paramInt != 0)
        {
          if (paramInt != 1)
          {
            if (paramInt != 2)
            {
              if (paramInt != 3)
              {
                if (paramInt == 4) {
                  localObject = new AppBar.b.f("");
                } else {
                  throw new IllegalArgumentException("unsupported NavigationType id");
                }
              }
              else {
                localObject = AppBar.b.e.c;
              }
            }
            else {
              localObject = AppBar.b.b.c;
            }
          }
          else {
            localObject = AppBar.b.a.c;
          }
        }
        else {
          localObject = AppBar.b.d.c;
        }
        return (AppBar.b)localObject;
      }
    }
    
    public static final class d
      extends AppBar.b
    {
      public static final d c = new d();
      
      private d()
      {
        super(null);
      }
    }
    
    public static final class e
      extends AppBar.b
    {
      public static final e c = new e();
      
      private e()
      {
        super(null);
      }
    }
    
    public static final class f
      extends AppBar.b
    {
      private final String c;
      
      public f(String paramString)
      {
        super(null);
        this.c = paramString;
      }
      
      public final String b()
      {
        return this.c;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof f))
          {
            paramObject = (f)paramObject;
            if (oXa.a(this.c, ((f)paramObject).c)) {}
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
        String str = this.c;
        int i;
        if (str != null) {
          i = str.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Text(text=");
        localStringBuilder.append(this.c);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/AppBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */