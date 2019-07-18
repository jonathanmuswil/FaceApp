package io.faceapp.ui.user_settings.item;

import UNa.b;
import UVa;
import VQa;
import aka;
import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cka;
import dka;
import dka.a;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;

public final class UserSettingsLoginItemView
  extends ConstraintLayout
  implements jta<a>
{
  private VQa<UNa.b> u;
  private HashMap v;
  
  public UserSettingsLoginItemView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public UserSettingsLoginItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public UserSettingsLoginItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void a(dka paramdka)
  {
    ((ImageView)c(k.loginIcon)).setImageResource(2131230997);
    ((TextView)c(k.loginSource)).setText(2131689987);
    aka localaka = paramdka.d();
    if (localaka != null)
    {
      paramdka = (TextView)c(k.loginStatus);
      oXa.a(paramdka, "loginStatus");
      paramdka.setText(localaka.c());
      setOnClickListener(new c(localaka, this));
    }
    else
    {
      ((TextView)c(k.loginStatus)).setText(2131689985);
      setOnClickListener(new a(this));
    }
  }
  
  private final void b(dka paramdka)
  {
    ((ImageView)c(k.loginIcon)).setImageResource(2131231023);
    ((TextView)c(k.loginSource)).setText(2131689988);
    paramdka = paramdka.g();
    if (paramdka != null)
    {
      TextView localTextView = (TextView)c(k.loginStatus);
      oXa.a(localTextView, "loginStatus");
      localTextView.setText(paramdka.b());
      setOnClickListener(new d(paramdka, this));
    }
    else
    {
      ((TextView)c(k.loginStatus)).setText(2131689985);
      setOnClickListener(new b(this));
    }
  }
  
  private final void c(dka paramdka) {}
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493153, this);
    if (isInEditMode())
    {
      a(new UserSettingsLoginItemView.a.a(dka.b.a()));
      setBackgroundColor(getResources().getColor(2131099686));
    }
  }
  
  public final void a(VQa<UNa.b> paramVQa)
  {
    oXa.b(paramVQa, "screenActions");
    this.u = paramVQa;
  }
  
  public void a(a parama)
  {
    oXa.b(parama, "model");
    if ((parama instanceof UserSettingsLoginItemView.a.a))
    {
      a(((UserSettingsLoginItemView.a.a)parama).a());
    }
    else if ((parama instanceof UserSettingsLoginItemView.a.c))
    {
      c(((UserSettingsLoginItemView.a.c)parama).a());
    }
    else
    {
      if (!(parama instanceof UserSettingsLoginItemView.a.b)) {
        break label67;
      }
      b(((UserSettingsLoginItemView.a.b)parama).a());
    }
    return;
    label67:
    throw new UVa();
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
      extends UserSettingsLoginItemView.a
    {
      private final dka a;
      
      public a(dka paramdka)
      {
        super();
        this.a = paramdka;
      }
      
      public final dka a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if (oXa.a(this.a, ((a)paramObject).a)) {}
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
        dka localdka = this.a;
        int i;
        if (localdka != null) {
          i = localdka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Facebook(user=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends UserSettingsLoginItemView.a
    {
      private final dka a;
      
      public b(dka paramdka)
      {
        super();
        this.a = paramdka;
      }
      
      public final dka a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            if (oXa.a(this.a, ((b)paramObject).a)) {}
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
        dka localdka = this.a;
        int i;
        if (localdka != null) {
          i = localdka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("PhoneNumber(user=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends UserSettingsLoginItemView.a
    {
      private final dka a;
      
      public c(dka paramdka)
      {
        super();
        this.a = paramdka;
      }
      
      public final dka a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof c))
          {
            paramObject = (c)paramObject;
            if (oXa.a(this.a, ((c)paramObject).a)) {}
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
        dka localdka = this.a;
        int i;
        if (localdka != null) {
          i = localdka.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("VK(user=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/user_settings/item/UserSettingsLoginItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */