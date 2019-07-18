package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

final class k
{
  private static final Matrix a = new Matrix();
  private final float b;
  private final float c;
  private final float d;
  private final float e;
  private final a f;
  private final PointF g = new PointF();
  
  public k(a parama, i parami, float paramFloat1, float paramFloat2)
  {
    this.f = parama;
    this.b = parami.d();
    this.c = parami.c();
    this.d = parami.b();
    this.e = parami.a();
    a(parami.e(), paramFloat1, paramFloat2);
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (paramFloat3 - paramFloat1) / (paramFloat4 - paramFloat2);
  }
  
  private void a(RectF paramRectF, float paramFloat)
  {
    paramRectF.bottom = (paramRectF.top + paramRectF.width() / paramFloat);
  }
  
  private void a(RectF paramRectF, float paramFloat1, float paramFloat2)
  {
    int i = j.a[this.f.ordinal()];
    float f1 = 0.0F;
    float f2 = 0.0F;
    switch (i)
    {
    default: 
    case 9: 
    case 8: 
    case 7: 
    case 6: 
    case 5: 
      for (paramFloat1 = f2;; paramFloat1 = paramFloat2 - paramFloat1)
      {
        paramFloat2 = 0.0F;
        break label214;
        paramFloat1 = paramRectF.centerX() - paramFloat1;
        f1 = paramRectF.centerY();
        break;
        f2 = paramRectF.bottom;
        paramFloat1 = f1;
        f1 = f2;
        break;
        paramFloat2 = paramRectF.right;
        continue;
        f2 = paramRectF.top;
        paramFloat1 = f1;
        f1 = f2;
        break;
        paramFloat2 = paramRectF.left;
      }
    case 4: 
      paramFloat1 = paramRectF.right - paramFloat1;
      f1 = paramRectF.bottom;
      break;
    case 3: 
      paramFloat1 = paramRectF.left - paramFloat1;
      f1 = paramRectF.bottom;
      break;
    case 2: 
      paramFloat1 = paramRectF.right - paramFloat1;
      f1 = paramRectF.top;
      break;
    case 1: 
      paramFloat1 = paramRectF.left - paramFloat1;
      f1 = paramRectF.top;
    }
    paramFloat2 = f1 - paramFloat2;
    label214:
    paramRectF = this.g;
    paramRectF.x = paramFloat1;
    paramRectF.y = paramFloat2;
  }
  
  private void a(RectF paramRectF1, float paramFloat1, float paramFloat2, RectF paramRectF2, int paramInt1, int paramInt2, float paramFloat3)
  {
    float f1 = paramFloat1 - paramRectF1.centerX();
    float f2 = paramFloat2 - paramRectF1.centerY();
    paramFloat1 = paramRectF1.left;
    if (paramFloat1 + f1 >= 0.0F)
    {
      paramFloat2 = paramRectF1.right;
      if ((paramFloat2 + f1 <= paramInt1) && (paramFloat1 + f1 >= paramRectF2.left))
      {
        paramFloat1 = f1;
        if (paramFloat2 + f1 <= paramRectF2.right) {
          break label101;
        }
      }
    }
    paramFloat1 = f1 / 1.05F;
    PointF localPointF = this.g;
    localPointF.x -= paramFloat1 / 2.0F;
    label101:
    paramFloat2 = paramRectF1.top;
    if (paramFloat2 + f2 >= 0.0F)
    {
      f1 = paramRectF1.bottom;
      if ((f1 + f2 <= paramInt2) && (paramFloat2 + f2 >= paramRectF2.top))
      {
        paramFloat2 = f2;
        if (f1 + f2 <= paramRectF2.bottom) {
          break label189;
        }
      }
    }
    paramFloat2 = f2 / 1.05F;
    localPointF = this.g;
    localPointF.y -= paramFloat2 / 2.0F;
    label189:
    paramRectF1.offset(paramFloat1, paramFloat2);
    c(paramRectF1, paramRectF2, paramFloat3);
  }
  
  private void a(RectF paramRectF1, float paramFloat1, float paramFloat2, RectF paramRectF2, int paramInt1, int paramInt2, float paramFloat3, float paramFloat4)
  {
    switch (j.a[this.f.ordinal()])
    {
    default: 
      break;
    case 8: 
      a(paramRectF1, paramFloat2, paramRectF2, paramInt2, paramFloat3, paramFloat4, true, true);
      a(paramRectF1, paramRectF2, paramFloat4);
      break;
    case 7: 
      b(paramRectF1, paramFloat1, paramRectF2, paramInt1, paramFloat3, paramFloat4, true, true);
      b(paramRectF1, paramRectF2, paramFloat4);
      break;
    case 6: 
      b(paramRectF1, paramFloat2, paramRectF2, paramFloat3, paramFloat4, true, true);
      a(paramRectF1, paramRectF2, paramFloat4);
      break;
    case 5: 
      a(paramRectF1, paramFloat1, paramRectF2, paramFloat3, paramFloat4, true, true);
      b(paramRectF1, paramRectF2, paramFloat4);
      break;
    case 4: 
      if (a(paramRectF1.left, paramRectF1.top, paramFloat1, paramFloat2) < paramFloat4)
      {
        a(paramRectF1, paramFloat2, paramRectF2, paramInt2, paramFloat3, paramFloat4, false, true);
        c(paramRectF1, paramFloat4);
      }
      else
      {
        b(paramRectF1, paramFloat1, paramRectF2, paramInt1, paramFloat3, paramFloat4, false, true);
        a(paramRectF1, paramFloat4);
      }
      break;
    case 3: 
      if (a(paramFloat1, paramRectF1.top, paramRectF1.right, paramFloat2) < paramFloat4)
      {
        a(paramRectF1, paramFloat2, paramRectF2, paramInt2, paramFloat3, paramFloat4, true, false);
        b(paramRectF1, paramFloat4);
      }
      else
      {
        a(paramRectF1, paramFloat1, paramRectF2, paramFloat3, paramFloat4, false, true);
        a(paramRectF1, paramFloat4);
      }
      break;
    case 2: 
      if (a(paramRectF1.left, paramFloat2, paramFloat1, paramRectF1.bottom) < paramFloat4)
      {
        b(paramRectF1, paramFloat2, paramRectF2, paramFloat3, paramFloat4, false, true);
        c(paramRectF1, paramFloat4);
      }
      else
      {
        b(paramRectF1, paramFloat1, paramRectF2, paramInt1, paramFloat3, paramFloat4, true, false);
        d(paramRectF1, paramFloat4);
      }
      break;
    case 1: 
      if (a(paramFloat1, paramFloat2, paramRectF1.right, paramRectF1.bottom) < paramFloat4)
      {
        b(paramRectF1, paramFloat2, paramRectF2, paramFloat3, paramFloat4, true, false);
        b(paramRectF1, paramFloat4);
      }
      else
      {
        a(paramRectF1, paramFloat1, paramRectF2, paramFloat3, paramFloat4, true, false);
        d(paramRectF1, paramFloat4);
      }
      break;
    }
  }
  
  private void a(RectF paramRectF1, float paramFloat1, RectF paramRectF2, float paramFloat2, float paramFloat3, boolean paramBoolean1, boolean paramBoolean2)
  {
    float f1 = paramFloat1;
    PointF localPointF;
    if (paramFloat1 < 0.0F)
    {
      f1 = paramFloat1 / 1.05F;
      localPointF = this.g;
      localPointF.x -= f1 / 1.1F;
    }
    paramFloat1 = paramRectF2.left;
    if (f1 < paramFloat1)
    {
      localPointF = this.g;
      localPointF.x -= (f1 - paramFloat1) / 2.0F;
    }
    paramFloat1 = paramRectF2.left;
    float f2 = f1;
    if (f1 - paramFloat1 < paramFloat2) {
      f2 = paramFloat1;
    }
    f1 = paramRectF1.right;
    float f3 = this.b;
    paramFloat1 = f2;
    if (f1 - f2 < f3) {
      paramFloat1 = f1 - f3;
    }
    f1 = paramRectF1.right;
    f3 = this.d;
    f2 = paramFloat1;
    if (f1 - paramFloat1 > f3) {
      f2 = f1 - f3;
    }
    f1 = paramRectF2.left;
    paramFloat1 = f2;
    if (f2 - f1 < paramFloat2) {
      paramFloat1 = f1;
    }
    paramFloat2 = paramFloat1;
    if (paramFloat3 > 0.0F)
    {
      f3 = paramRectF1.right;
      f2 = (f3 - paramFloat1) / paramFloat3;
      f1 = this.c;
      paramFloat2 = f2;
      if (f2 < f1)
      {
        paramFloat1 = Math.max(paramRectF2.left, f3 - f1 * paramFloat3);
        paramFloat2 = (paramRectF1.right - paramFloat1) / paramFloat3;
      }
      f3 = this.e;
      f1 = paramFloat2;
      f2 = paramFloat1;
      if (paramFloat2 > f3)
      {
        f2 = Math.max(paramRectF2.left, paramRectF1.right - f3 * paramFloat3);
        f1 = (paramRectF1.right - f2) / paramFloat3;
      }
      if ((paramBoolean1) && (paramBoolean2))
      {
        paramFloat2 = Math.max(f2, Math.max(paramRectF2.left, paramRectF1.right - paramRectF2.height() * paramFloat3));
      }
      else
      {
        f3 = f1;
        paramFloat1 = f2;
        if (paramBoolean1)
        {
          float f4 = paramRectF1.bottom;
          paramFloat2 = paramRectF2.top;
          f3 = f1;
          paramFloat1 = f2;
          if (f4 - f1 < paramFloat2)
          {
            paramFloat1 = Math.max(paramRectF2.left, paramRectF1.right - (f4 - paramFloat2) * paramFloat3);
            f3 = (paramRectF1.right - paramFloat1) / paramFloat3;
          }
        }
        paramFloat2 = paramFloat1;
        if (paramBoolean2)
        {
          f2 = paramRectF1.top;
          f1 = paramRectF2.bottom;
          paramFloat2 = paramFloat1;
          if (f3 + f2 > f1) {
            paramFloat2 = Math.max(paramFloat1, Math.max(paramRectF2.left, paramRectF1.right - (f1 - f2) * paramFloat3));
          }
        }
      }
    }
    paramRectF1.left = paramFloat2;
  }
  
  private void a(RectF paramRectF1, float paramFloat1, RectF paramRectF2, int paramInt, float paramFloat2, float paramFloat3, boolean paramBoolean1, boolean paramBoolean2)
  {
    float f1 = paramInt;
    float f2 = paramFloat1;
    PointF localPointF;
    if (paramFloat1 > f1)
    {
      f2 = (paramFloat1 - f1) / 1.05F + f1;
      localPointF = this.g;
      localPointF.y -= (f2 - f1) / 1.1F;
    }
    paramFloat1 = paramRectF2.bottom;
    if (f2 > paramFloat1)
    {
      localPointF = this.g;
      localPointF.y -= (f2 - paramFloat1) / 2.0F;
    }
    paramFloat1 = paramRectF2.bottom;
    f1 = f2;
    if (paramFloat1 - f2 < paramFloat2) {
      f1 = paramFloat1;
    }
    f2 = paramRectF1.top;
    float f3 = this.c;
    paramFloat1 = f1;
    if (f1 - f2 < f3) {
      paramFloat1 = f2 + f3;
    }
    f2 = paramRectF1.top;
    f3 = this.e;
    f1 = paramFloat1;
    if (paramFloat1 - f2 > f3) {
      f1 = f2 + f3;
    }
    f2 = paramRectF2.bottom;
    paramFloat1 = f1;
    if (f2 - f1 < paramFloat2) {
      paramFloat1 = f2;
    }
    paramFloat2 = paramFloat1;
    if (paramFloat3 > 0.0F)
    {
      f2 = paramRectF1.top;
      f1 = (paramFloat1 - f2) * paramFloat3;
      f3 = this.b;
      paramFloat2 = f1;
      if (f1 < f3)
      {
        paramFloat1 = Math.min(paramRectF2.bottom, f2 + f3 / paramFloat3);
        paramFloat2 = (paramFloat1 - paramRectF1.top) * paramFloat3;
      }
      f1 = this.d;
      f2 = paramFloat1;
      paramFloat1 = paramFloat2;
      if (paramFloat2 > f1)
      {
        f2 = Math.min(paramRectF2.bottom, paramRectF1.top + f1 / paramFloat3);
        paramFloat1 = (f2 - paramRectF1.top) * paramFloat3;
      }
      if ((paramBoolean1) && (paramBoolean2))
      {
        paramFloat2 = Math.min(f2, Math.min(paramRectF2.bottom, paramRectF1.top + paramRectF2.width() / paramFloat3));
      }
      else
      {
        f1 = f2;
        f3 = paramFloat1;
        if (paramBoolean1)
        {
          float f4 = paramRectF1.right;
          paramFloat2 = paramRectF2.left;
          f1 = f2;
          f3 = paramFloat1;
          if (f4 - paramFloat1 < paramFloat2)
          {
            f1 = Math.min(paramRectF2.bottom, paramRectF1.top + (f4 - paramFloat2) / paramFloat3);
            f3 = (f1 - paramRectF1.top) * paramFloat3;
          }
        }
        paramFloat2 = f1;
        if (paramBoolean2)
        {
          f2 = paramRectF1.left;
          paramFloat1 = paramRectF2.right;
          paramFloat2 = f1;
          if (f3 + f2 > paramFloat1) {
            paramFloat2 = Math.min(f1, Math.min(paramRectF2.bottom, paramRectF1.top + (paramFloat1 - f2) / paramFloat3));
          }
        }
      }
    }
    paramRectF1.bottom = paramFloat2;
  }
  
  private void a(RectF paramRectF1, RectF paramRectF2, float paramFloat)
  {
    paramRectF1.inset((paramRectF1.width() - paramRectF1.height() * paramFloat) / 2.0F, 0.0F);
    paramFloat = paramRectF1.left;
    float f1 = paramRectF2.left;
    if (paramFloat < f1) {
      paramRectF1.offset(f1 - paramFloat, 0.0F);
    }
    f1 = paramRectF1.right;
    paramFloat = paramRectF2.right;
    if (f1 > paramFloat) {
      paramRectF1.offset(paramFloat - f1, 0.0F);
    }
  }
  
  private void b(RectF paramRectF, float paramFloat)
  {
    paramRectF.left = (paramRectF.right - paramRectF.height() * paramFloat);
  }
  
  private void b(RectF paramRectF1, float paramFloat1, float paramFloat2, RectF paramRectF2, int paramInt1, int paramInt2, float paramFloat3)
  {
    switch (j.a[this.f.ordinal()])
    {
    default: 
      break;
    case 8: 
      a(paramRectF1, paramFloat2, paramRectF2, paramInt2, paramFloat3, 0.0F, false, false);
      break;
    case 7: 
      b(paramRectF1, paramFloat1, paramRectF2, paramInt1, paramFloat3, 0.0F, false, false);
      break;
    case 6: 
      b(paramRectF1, paramFloat2, paramRectF2, paramFloat3, 0.0F, false, false);
      break;
    case 5: 
      a(paramRectF1, paramFloat1, paramRectF2, paramFloat3, 0.0F, false, false);
      break;
    case 4: 
      a(paramRectF1, paramFloat2, paramRectF2, paramInt2, paramFloat3, 0.0F, false, false);
      b(paramRectF1, paramFloat1, paramRectF2, paramInt1, paramFloat3, 0.0F, false, false);
      break;
    case 3: 
      a(paramRectF1, paramFloat2, paramRectF2, paramInt2, paramFloat3, 0.0F, false, false);
      a(paramRectF1, paramFloat1, paramRectF2, paramFloat3, 0.0F, false, false);
      break;
    case 2: 
      b(paramRectF1, paramFloat2, paramRectF2, paramFloat3, 0.0F, false, false);
      b(paramRectF1, paramFloat1, paramRectF2, paramInt1, paramFloat3, 0.0F, false, false);
      break;
    case 1: 
      b(paramRectF1, paramFloat2, paramRectF2, paramFloat3, 0.0F, false, false);
      a(paramRectF1, paramFloat1, paramRectF2, paramFloat3, 0.0F, false, false);
    }
  }
  
  private void b(RectF paramRectF1, float paramFloat1, RectF paramRectF2, float paramFloat2, float paramFloat3, boolean paramBoolean1, boolean paramBoolean2)
  {
    float f1 = paramFloat1;
    PointF localPointF;
    if (paramFloat1 < 0.0F)
    {
      f1 = paramFloat1 / 1.05F;
      localPointF = this.g;
      localPointF.y -= f1 / 1.1F;
    }
    paramFloat1 = paramRectF2.top;
    if (f1 < paramFloat1)
    {
      localPointF = this.g;
      localPointF.y -= (f1 - paramFloat1) / 2.0F;
    }
    paramFloat1 = paramRectF2.top;
    float f2 = f1;
    if (f1 - paramFloat1 < paramFloat2) {
      f2 = paramFloat1;
    }
    float f3 = paramRectF1.bottom;
    f1 = this.c;
    paramFloat1 = f2;
    if (f3 - f2 < f1) {
      paramFloat1 = f3 - f1;
    }
    f1 = paramRectF1.bottom;
    f3 = this.e;
    f2 = paramFloat1;
    if (f1 - paramFloat1 > f3) {
      f2 = f1 - f3;
    }
    f1 = paramRectF2.top;
    paramFloat1 = f2;
    if (f2 - f1 < paramFloat2) {
      paramFloat1 = f1;
    }
    paramFloat2 = paramFloat1;
    if (paramFloat3 > 0.0F)
    {
      f1 = paramRectF1.bottom;
      paramFloat2 = (f1 - paramFloat1) * paramFloat3;
      f3 = this.b;
      f2 = paramFloat2;
      if (paramFloat2 < f3)
      {
        paramFloat1 = Math.max(paramRectF2.top, f1 - f3 / paramFloat3);
        f2 = (paramRectF1.bottom - paramFloat1) * paramFloat3;
      }
      f3 = this.d;
      paramFloat2 = f2;
      f1 = paramFloat1;
      if (f2 > f3)
      {
        f1 = Math.max(paramRectF2.top, paramRectF1.bottom - f3 / paramFloat3);
        paramFloat2 = (paramRectF1.bottom - f1) * paramFloat3;
      }
      if ((paramBoolean1) && (paramBoolean2))
      {
        paramFloat2 = Math.max(f1, Math.max(paramRectF2.top, paramRectF1.bottom - paramRectF2.width() / paramFloat3));
      }
      else
      {
        f2 = paramFloat2;
        paramFloat1 = f1;
        if (paramBoolean1)
        {
          float f4 = paramRectF1.right;
          f3 = paramRectF2.left;
          f2 = paramFloat2;
          paramFloat1 = f1;
          if (f4 - paramFloat2 < f3)
          {
            paramFloat1 = Math.max(paramRectF2.top, paramRectF1.bottom - (f4 - f3) / paramFloat3);
            f2 = (paramRectF1.bottom - paramFloat1) * paramFloat3;
          }
        }
        paramFloat2 = paramFloat1;
        if (paramBoolean2)
        {
          f3 = paramRectF1.left;
          f1 = paramRectF2.right;
          paramFloat2 = paramFloat1;
          if (f2 + f3 > f1) {
            paramFloat2 = Math.max(paramFloat1, Math.max(paramRectF2.top, paramRectF1.bottom - (f1 - f3) / paramFloat3));
          }
        }
      }
    }
    paramRectF1.top = paramFloat2;
  }
  
  private void b(RectF paramRectF1, float paramFloat1, RectF paramRectF2, int paramInt, float paramFloat2, float paramFloat3, boolean paramBoolean1, boolean paramBoolean2)
  {
    float f1 = paramInt;
    float f2 = paramFloat1;
    PointF localPointF;
    if (paramFloat1 > f1)
    {
      f2 = (paramFloat1 - f1) / 1.05F + f1;
      localPointF = this.g;
      localPointF.x -= (f2 - f1) / 1.1F;
    }
    paramFloat1 = paramRectF2.right;
    if (f2 > paramFloat1)
    {
      localPointF = this.g;
      localPointF.x -= (f2 - paramFloat1) / 2.0F;
    }
    paramFloat1 = paramRectF2.right;
    f1 = f2;
    if (paramFloat1 - f2 < paramFloat2) {
      f1 = paramFloat1;
    }
    f2 = paramRectF1.left;
    float f3 = this.b;
    paramFloat1 = f1;
    if (f1 - f2 < f3) {
      paramFloat1 = f2 + f3;
    }
    f2 = paramRectF1.left;
    f3 = this.d;
    f1 = paramFloat1;
    if (paramFloat1 - f2 > f3) {
      f1 = f2 + f3;
    }
    f2 = paramRectF2.right;
    paramFloat1 = f1;
    if (f2 - f1 < paramFloat2) {
      paramFloat1 = f2;
    }
    paramFloat2 = paramFloat1;
    if (paramFloat3 > 0.0F)
    {
      f3 = paramRectF1.left;
      f1 = (paramFloat1 - f3) / paramFloat3;
      f2 = this.c;
      paramFloat2 = f1;
      if (f1 < f2)
      {
        paramFloat1 = Math.min(paramRectF2.right, f3 + f2 * paramFloat3);
        paramFloat2 = (paramFloat1 - paramRectF1.left) / paramFloat3;
      }
      f1 = this.e;
      f2 = paramFloat1;
      paramFloat1 = paramFloat2;
      if (paramFloat2 > f1)
      {
        f2 = Math.min(paramRectF2.right, paramRectF1.left + f1 * paramFloat3);
        paramFloat1 = (f2 - paramRectF1.left) / paramFloat3;
      }
      if ((paramBoolean1) && (paramBoolean2))
      {
        paramFloat2 = Math.min(f2, Math.min(paramRectF2.right, paramRectF1.left + paramRectF2.height() * paramFloat3));
      }
      else
      {
        f1 = f2;
        f3 = paramFloat1;
        if (paramBoolean1)
        {
          paramFloat2 = paramRectF1.bottom;
          float f4 = paramRectF2.top;
          f1 = f2;
          f3 = paramFloat1;
          if (paramFloat2 - paramFloat1 < f4)
          {
            f1 = Math.min(paramRectF2.right, paramRectF1.left + (paramFloat2 - f4) * paramFloat3);
            f3 = (f1 - paramRectF1.left) / paramFloat3;
          }
        }
        paramFloat2 = f1;
        if (paramBoolean2)
        {
          f2 = paramRectF1.top;
          paramFloat1 = paramRectF2.bottom;
          paramFloat2 = f1;
          if (f3 + f2 > paramFloat1) {
            paramFloat2 = Math.min(f1, Math.min(paramRectF2.right, paramRectF1.left + (paramFloat1 - f2) * paramFloat3));
          }
        }
      }
    }
    paramRectF1.right = paramFloat2;
  }
  
  private void b(RectF paramRectF1, RectF paramRectF2, float paramFloat)
  {
    paramRectF1.inset(0.0F, (paramRectF1.height() - paramRectF1.width() / paramFloat) / 2.0F);
    paramFloat = paramRectF1.top;
    float f1 = paramRectF2.top;
    if (paramFloat < f1) {
      paramRectF1.offset(0.0F, f1 - paramFloat);
    }
    f1 = paramRectF1.bottom;
    paramFloat = paramRectF2.bottom;
    if (f1 > paramFloat) {
      paramRectF1.offset(0.0F, paramFloat - f1);
    }
  }
  
  private void c(RectF paramRectF, float paramFloat)
  {
    paramRectF.right = (paramRectF.left + paramRectF.height() * paramFloat);
  }
  
  private void c(RectF paramRectF1, RectF paramRectF2, float paramFloat)
  {
    float f1 = paramRectF1.left;
    float f2 = paramRectF2.left;
    if (f1 < f2 + paramFloat) {
      paramRectF1.offset(f2 - f1, 0.0F);
    }
    f1 = paramRectF1.top;
    f2 = paramRectF2.top;
    if (f1 < f2 + paramFloat) {
      paramRectF1.offset(0.0F, f2 - f1);
    }
    f1 = paramRectF1.right;
    f2 = paramRectF2.right;
    if (f1 > f2 - paramFloat) {
      paramRectF1.offset(f2 - f1, 0.0F);
    }
    f1 = paramRectF1.bottom;
    f2 = paramRectF2.bottom;
    if (f1 > f2 - paramFloat) {
      paramRectF1.offset(0.0F, f2 - f1);
    }
  }
  
  private void d(RectF paramRectF, float paramFloat)
  {
    paramRectF.top = (paramRectF.bottom - paramRectF.width() / paramFloat);
  }
  
  public void a(RectF paramRectF1, float paramFloat1, float paramFloat2, RectF paramRectF2, int paramInt1, int paramInt2, float paramFloat3, boolean paramBoolean, float paramFloat4)
  {
    PointF localPointF = this.g;
    paramFloat1 += localPointF.x;
    paramFloat2 += localPointF.y;
    if (this.f == a.i) {
      a(paramRectF1, paramFloat1, paramFloat2, paramRectF2, paramInt1, paramInt2, paramFloat3);
    } else if (paramBoolean) {
      a(paramRectF1, paramFloat1, paramFloat2, paramRectF2, paramInt1, paramInt2, paramFloat3, paramFloat4);
    } else {
      b(paramRectF1, paramFloat1, paramFloat2, paramRectF2, paramInt1, paramInt2, paramFloat3);
    }
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */