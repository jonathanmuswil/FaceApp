package com.theartofdev.edmodo.cropper;

class g
  implements CropOverlayView.a
{
  g(CropImageView paramCropImageView) {}
  
  public void a(boolean paramBoolean)
  {
    CropImageView.a(this.a, paramBoolean, true);
    Object localObject = CropImageView.a(this.a);
    if ((localObject != null) && (!paramBoolean)) {
      ((CropImageView.f)localObject).a(this.a.getCropRect());
    }
    localObject = CropImageView.b(this.a);
    if ((localObject != null) && (paramBoolean)) {
      ((CropImageView.e)localObject).a(this.a.getCropRect());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */