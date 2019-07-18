import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Locale;
import java.util.concurrent.Executor;

public class bd
  implements Spannable
{
  private static final Object a = new Object();
  private static Executor b = null;
  private final Spannable c;
  private final bd.a d;
  private final PrecomputedText e;
  
  public bd.a a()
  {
    return this.d;
  }
  
  public PrecomputedText b()
  {
    Spannable localSpannable = this.c;
    if ((localSpannable instanceof PrecomputedText)) {
      return (PrecomputedText)localSpannable;
    }
    return null;
  }
  
  public char charAt(int paramInt)
  {
    return this.c.charAt(paramInt);
  }
  
  public int getSpanEnd(Object paramObject)
  {
    return this.c.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject)
  {
    return this.c.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject)
  {
    return this.c.getSpanStart(paramObject);
  }
  
  public <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return this.e.getSpans(paramInt1, paramInt2, paramClass);
    }
    return this.c.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public int length()
  {
    return this.c.length();
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return this.c.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public void removeSpan(Object paramObject)
  {
    if (!(paramObject instanceof MetricAffectingSpan))
    {
      if (Build.VERSION.SDK_INT >= 28) {
        this.e.removeSpan(paramObject);
      } else {
        this.c.removeSpan(paramObject);
      }
      return;
    }
    throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!(paramObject instanceof MetricAffectingSpan))
    {
      if (Build.VERSION.SDK_INT >= 28) {
        this.e.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      } else {
        this.c.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      }
      return;
    }
    throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return this.c.subSequence(paramInt1, paramInt2);
  }
  
  public String toString()
  {
    return this.c.toString();
  }
  
  public static final class a
  {
    private final TextPaint a;
    private final TextDirectionHeuristic b;
    private final int c;
    private final int d;
    final PrecomputedText.Params e;
    
    public a(PrecomputedText.Params paramParams)
    {
      this.a = paramParams.getTextPaint();
      this.b = paramParams.getTextDirection();
      this.c = paramParams.getBreakStrategy();
      this.d = paramParams.getHyphenationFrequency();
      this.e = paramParams;
    }
    
    a(TextPaint paramTextPaint, TextDirectionHeuristic paramTextDirectionHeuristic, int paramInt1, int paramInt2)
    {
      if (Build.VERSION.SDK_INT >= 28) {
        this.e = new PrecomputedText.Params.Builder(paramTextPaint).setBreakStrategy(paramInt1).setHyphenationFrequency(paramInt2).setTextDirection(paramTextDirectionHeuristic).build();
      } else {
        this.e = null;
      }
      this.a = paramTextPaint;
      this.b = paramTextDirectionHeuristic;
      this.c = paramInt1;
      this.d = paramInt2;
    }
    
    public int a()
    {
      return this.c;
    }
    
    public int b()
    {
      return this.d;
    }
    
    public TextDirectionHeuristic c()
    {
      return this.b;
    }
    
    public TextPaint d()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if ((paramObject != null) && ((paramObject instanceof a)))
      {
        paramObject = (a)paramObject;
        PrecomputedText.Params localParams = this.e;
        if (localParams != null) {
          return localParams.equals(((a)paramObject).e);
        }
        if (Build.VERSION.SDK_INT >= 23)
        {
          if (this.c != ((a)paramObject).a()) {
            return false;
          }
          if (this.d != ((a)paramObject).b()) {
            return false;
          }
        }
        if ((Build.VERSION.SDK_INT >= 18) && (this.b != ((a)paramObject).c())) {
          return false;
        }
        if (this.a.getTextSize() != ((a)paramObject).d().getTextSize()) {
          return false;
        }
        if (this.a.getTextScaleX() != ((a)paramObject).d().getTextScaleX()) {
          return false;
        }
        if (this.a.getTextSkewX() != ((a)paramObject).d().getTextSkewX()) {
          return false;
        }
        if (Build.VERSION.SDK_INT >= 21)
        {
          if (this.a.getLetterSpacing() != ((a)paramObject).d().getLetterSpacing()) {
            return false;
          }
          if (!TextUtils.equals(this.a.getFontFeatureSettings(), ((a)paramObject).d().getFontFeatureSettings())) {
            return false;
          }
        }
        if (this.a.getFlags() != ((a)paramObject).d().getFlags()) {
          return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24)
        {
          if (!this.a.getTextLocales().equals(((a)paramObject).d().getTextLocales())) {
            return false;
          }
        }
        else if ((i >= 17) && (!this.a.getTextLocale().equals(((a)paramObject).d().getTextLocale()))) {
          return false;
        }
        if (this.a.getTypeface() == null)
        {
          if (((a)paramObject).d().getTypeface() != null) {
            return false;
          }
        }
        else if (!this.a.getTypeface().equals(((a)paramObject).d().getTypeface())) {
          return false;
        }
        return true;
      }
      return false;
    }
    
    public int hashCode()
    {
      int i = Build.VERSION.SDK_INT;
      if (i >= 24) {
        return pd.a(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) });
      }
      if (i >= 21) {
        return pd.a(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) });
      }
      if (i >= 18) {
        return pd.a(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) });
      }
      if (i >= 17) {
        return pd.a(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) });
      }
      return pd.a(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) });
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder("{");
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("textSize=");
      localStringBuilder2.append(this.a.getTextSize());
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", textScaleX=");
      localStringBuilder2.append(this.a.getTextScaleX());
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", textSkewX=");
      localStringBuilder2.append(this.a.getTextSkewX());
      localStringBuilder1.append(localStringBuilder2.toString());
      if (Build.VERSION.SDK_INT >= 21)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", letterSpacing=");
        localStringBuilder2.append(this.a.getLetterSpacing());
        localStringBuilder1.append(localStringBuilder2.toString());
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", elegantTextHeight=");
        localStringBuilder2.append(this.a.isElegantTextHeight());
        localStringBuilder1.append(localStringBuilder2.toString());
      }
      int i = Build.VERSION.SDK_INT;
      if (i >= 24)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", textLocale=");
        localStringBuilder2.append(this.a.getTextLocales());
        localStringBuilder1.append(localStringBuilder2.toString());
      }
      else if (i >= 17)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", textLocale=");
        localStringBuilder2.append(this.a.getTextLocale());
        localStringBuilder1.append(localStringBuilder2.toString());
      }
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", typeface=");
      localStringBuilder2.append(this.a.getTypeface());
      localStringBuilder1.append(localStringBuilder2.toString());
      if (Build.VERSION.SDK_INT >= 26)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", variationSettings=");
        localStringBuilder2.append(this.a.getFontVariationSettings());
        localStringBuilder1.append(localStringBuilder2.toString());
      }
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", textDir=");
      localStringBuilder2.append(this.b);
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", breakStrategy=");
      localStringBuilder2.append(this.c);
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", hyphenationFrequency=");
      localStringBuilder2.append(this.d);
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder1.append("}");
      return localStringBuilder1.toString();
    }
    
    public static class a
    {
      private final TextPaint a;
      private TextDirectionHeuristic b;
      private int c;
      private int d;
      
      public a(TextPaint paramTextPaint)
      {
        this.a = paramTextPaint;
        if (Build.VERSION.SDK_INT >= 23)
        {
          this.c = 1;
          this.d = 1;
        }
        else
        {
          this.d = 0;
          this.c = 0;
        }
        if (Build.VERSION.SDK_INT >= 18) {
          this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        } else {
          this.b = null;
        }
      }
      
      public a a(int paramInt)
      {
        this.c = paramInt;
        return this;
      }
      
      public a a(TextDirectionHeuristic paramTextDirectionHeuristic)
      {
        this.b = paramTextDirectionHeuristic;
        return this;
      }
      
      public bd.a a()
      {
        return new bd.a(this.a, this.b, this.c, this.d);
      }
      
      public a b(int paramInt)
      {
        this.d = paramInt;
        return this;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */