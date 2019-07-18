package io.faceapp.ui.image_editor.filter_editor;

import android.graphics.Canvas;
import android.graphics.Paint;
import cWa;
import eXa;
import pXa;

final class u
  extends pXa
  implements eXa<Integer, Integer, Boolean, cWa>
{
  u(FilterStrengthItemView paramFilterStrengthItemView, float paramFloat1, float paramFloat2, float paramFloat3, Canvas paramCanvas)
  {
    super(3);
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    if (paramBoolean == true)
    {
      localObject = this.b;
      i = FilterStrengthItemView.a((FilterStrengthItemView)localObject, FilterStrengthItemView.a((FilterStrengthItemView)localObject), FilterStrengthItemView.b(this.b), FilterStrengthItemView.i(this.b));
    }
    else
    {
      localObject = this.b;
      i = FilterStrengthItemView.a((FilterStrengthItemView)localObject, FilterStrengthItemView.c((FilterStrengthItemView)localObject), FilterStrengthItemView.d(this.b), FilterStrengthItemView.i(this.b));
    }
    float f1 = FilterStrengthItemView.g(this.b);
    float f2 = FilterStrengthItemView.f(this.b);
    float f3 = FilterStrengthItemView.g(this.b);
    float f4 = paramInt1 - 1;
    f1 += (f2 - f3) * f4 / (paramInt2 - 1);
    f2 = this.c;
    float f5 = (this.d + f2) * f4;
    f3 = this.e - f1;
    Object localObject = this.f;
    f4 = FilterStrengthItemView.e(this.b);
    float f6 = FilterStrengthItemView.e(this.b);
    Paint localPaint = FilterStrengthItemView.h(this.b);
    localPaint.setColor(i);
    ((Canvas)localObject).drawRoundRect(f5, f3, f5 + f2, f3 + f1, f4, f6, localPaint);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */