package io.faceapp.ui.components;

import KOa;
import UVa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;

public final class AuthButtonView
  extends LinearLayout
  implements jta<a>
{
  private HashMap a;
  
  public AuthButtonView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public AuthButtonView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public AuthButtonView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void a(Integer paramInteger)
  {
    ((ImageView)b(k.iconView)).setImageResource(2131230998);
    TextView localTextView = (TextView)b(k.labelView);
    int i;
    if (paramInteger != null) {
      i = paramInteger.intValue();
    } else {
      i = 2131689491;
    }
    localTextView.setText(i);
    setBackgroundResource(2131230821);
  }
  
  private final void b(Integer paramInteger)
  {
    ((ImageView)b(k.iconView)).setImageResource(2131231022);
    TextView localTextView = (TextView)b(k.labelView);
    int i;
    if (paramInteger != null) {
      i = paramInteger.intValue();
    } else {
      i = 2131689492;
    }
    localTextView.setText(i);
    setBackgroundResource(2131230823);
  }
  
  private final void setupView(Context paramContext)
  {
    LinearLayout.inflate(paramContext, 2131493112, this);
    setOrientation(0);
    setGravity(16);
    setMinimumWidth((int)KOa.b.a(paramContext, 220));
    if (isInEditMode()) {
      a(new AuthButtonView.a.a(null, 1, null));
    }
  }
  
  public void a(a parama)
  {
    oXa.b(parama, "model");
    if ((parama instanceof AuthButtonView.a.a))
    {
      a(((AuthButtonView.a.a)parama).a());
    }
    else
    {
      if (!(parama instanceof AuthButtonView.a.b)) {
        break label46;
      }
      b(((AuthButtonView.a.b)parama).a());
    }
    return;
    label46:
    throw new UVa();
  }
  
  public View b(int paramInt)
  {
    if (this.a == null) {
      this.a = new HashMap();
    }
    View localView1 = (View)this.a.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.a.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static abstract class a
  {
    public static final class a
      extends AuthButtonView.a
    {
      private final Integer a;
      
      public a()
      {
        this(null, 1, null);
      }
      
      public a(Integer paramInteger)
      {
        super();
        this.a = paramInteger;
      }
      
      public final Integer a()
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
        Integer localInteger = this.a;
        int i;
        if (localInteger != null) {
          i = localInteger.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Facebook(customTitleRes=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends AuthButtonView.a
    {
      private final Integer a;
      
      public b()
      {
        this(null, 1, null);
      }
      
      public b(Integer paramInteger)
      {
        super();
        this.a = paramInteger;
      }
      
      public final Integer a()
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
        Integer localInteger = this.a;
        int i;
        if (localInteger != null) {
          i = localInteger.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("PhoneNumber(customTitleRes=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/AuthButtonView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */