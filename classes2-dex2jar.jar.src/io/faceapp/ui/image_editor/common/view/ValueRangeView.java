package io.faceapp.ui.image_editor.common.view;

import GVa;
import QQa;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import cWa;
import cXa;
import dXa;
import io.faceapp.l;
import jRa;
import java.util.concurrent.TimeUnit;
import oXa;
import pya;

public final class ValueRangeView
  extends ConstraintLayout
{
  private ImageView A;
  private a B;
  private pya u;
  private GVa<Integer> v;
  private GVa<Integer> w;
  private dXa<? super pya, ? super Float, cWa> x;
  private CustomSeekBar y;
  private ImageView z;
  
  public ValueRangeView(Context paramContext)
  {
    super(paramContext);
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.v = localGVa;
    localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.w = localGVa;
    this.x = r.b;
    this.B = a.a;
    b(paramContext, null);
  }
  
  public ValueRangeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.v = localGVa;
    localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.w = localGVa;
    this.x = r.b;
    this.B = a.a;
    b(paramContext, paramAttributeSet);
  }
  
  public ValueRangeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.v = localGVa;
    localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.w = localGVa;
    this.x = r.b;
    this.B = a.a;
    b(paramContext, paramAttributeSet);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    Context localContext = null;
    try
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, l.ValueRangeView);
      if (paramContext != null)
      {
        localContext = paramContext;
        this.B = c(paramContext.getInt(0, 0));
      }
      return;
    }
    finally
    {
      if (localContext != null) {
        localContext.recycle();
      }
    }
  }
  
  private final void b(Context paramContext, AttributeSet paramAttributeSet)
  {
    a(paramContext, paramAttributeSet);
    View.inflate(paramContext, this.B.a(), this);
  }
  
  public final ValueRangeView a(dXa<? super pya, ? super Float, cWa> paramdXa)
  {
    oXa.b(paramdXa, "progressFunc");
    this.x = paramdXa;
    return this;
  }
  
  public final ValueRangeView a(jRa paramjRa)
  {
    oXa.b(paramjRa, "disposable");
    paramjRa.b(QQa.b(this.v, this.w.a(30L, TimeUnit.MILLISECONDS)).c(new s(this)));
    return this;
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    CustomSeekBar localCustomSeekBar;
    if (paramBoolean)
    {
      localCustomSeekBar = this.y;
      if (localCustomSeekBar != null)
      {
        ObjectAnimator.ofInt(localCustomSeekBar, "progress", new int[] { paramInt }).setDuration(300L).start();
      }
      else
      {
        oXa.b("seekBar");
        throw null;
      }
    }
    else
    {
      localCustomSeekBar = this.y;
      if (localCustomSeekBar == null) {
        break label60;
      }
      localCustomSeekBar.setProgress(paramInt);
    }
    return;
    label60:
    oXa.b("seekBar");
    throw null;
  }
  
  public final void a(pya parampya, float paramFloat, boolean paramBoolean)
  {
    oXa.b(parampya, "range");
    this.u = parampya;
    Object localObject = this.y;
    if (localObject != null)
    {
      ((CustomSeekBar)localObject).setZeroPoint(((Number)parampya.c().a(Float.valueOf(0.0F))).intValue());
      a(((Number)parampya.c().a(Float.valueOf(paramFloat))).intValue(), paramBoolean);
      localObject = Integer.valueOf(parampya.d());
      int i = ((Integer)localObject).intValue();
      int j = 1;
      if (i > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        localObject = null;
      }
      if (localObject != null)
      {
        i = ((Integer)localObject).intValue();
        localObject = this.y;
        if (localObject != null)
        {
          ((SeekBar)localObject).setThumb(getResources().getDrawable(i));
        }
        else
        {
          oXa.b("seekBar");
          throw null;
        }
      }
      localObject = Integer.valueOf(parampya.g());
      if (((Integer)localObject).intValue() > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        localObject = null;
      }
      if (localObject != null)
      {
        i = ((Integer)localObject).intValue();
        localObject = this.z;
        if (localObject != null) {
          ((ImageView)localObject).setImageResource(i);
        }
      }
      parampya = Integer.valueOf(parampya.f());
      if (parampya.intValue() > 0) {
        i = j;
      } else {
        i = 0;
      }
      if (i == 0) {
        parampya = null;
      }
      if (parampya != null)
      {
        i = parampya.intValue();
        parampya = this.A;
        if (parampya != null) {
          parampya.setImageResource(i);
        }
      }
      return;
    }
    oXa.b("seekBar");
    throw null;
  }
  
  public final a c(int paramInt)
  {
    a locala;
    if (paramInt != 0) {
      locala = a.b;
    } else {
      locala = a.a;
    }
    return locala;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    Object localObject = findViewById(2131296821);
    if (localObject != null)
    {
      this.y = ((CustomSeekBar)localObject);
      this.z = ((ImageView)findViewById(2131296886));
      this.A = ((ImageView)findViewById(2131296538));
      localObject = this.y;
      if (localObject != null)
      {
        ((SeekBar)localObject).setOnSeekBarChangeListener(new p(this));
        setOnClickListener(q.a);
        return;
      }
      oXa.b("seekBar");
      throw null;
    }
    oXa.a();
    throw null;
  }
  
  public static enum a
  {
    private final int d;
    
    static
    {
      a locala1 = new a("SEEKBAR", 0, 2131493128);
      a = locala1;
      a locala2 = new a("DECORATED", 1, 2131493127);
      b = locala2;
      c = new a[] { locala1, locala2 };
    }
    
    private a(int paramInt)
    {
      this.d = paramInt;
    }
    
    public final int a()
    {
      return this.d;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/ValueRangeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */