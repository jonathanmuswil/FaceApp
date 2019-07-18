package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class i
  extends Filter
{
  a a;
  
  i(a parama)
  {
    this.a = parama;
  }
  
  public CharSequence convertResultToString(Object paramObject)
  {
    return this.a.convertToString((Cursor)paramObject);
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    paramCharSequence = this.a.a(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null)
    {
      localFilterResults.count = paramCharSequence.getCount();
      localFilterResults.values = paramCharSequence;
    }
    else
    {
      localFilterResults.count = 0;
      localFilterResults.values = null;
    }
    return localFilterResults;
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = this.a.h();
    paramFilterResults = paramFilterResults.values;
    if ((paramFilterResults != null) && (paramFilterResults != paramCharSequence)) {
      this.a.a((Cursor)paramFilterResults);
    }
  }
  
  static abstract interface a
  {
    public abstract Cursor a(CharSequence paramCharSequence);
    
    public abstract void a(Cursor paramCursor);
    
    public abstract CharSequence convertToString(Cursor paramCursor);
    
    public abstract Cursor h();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */