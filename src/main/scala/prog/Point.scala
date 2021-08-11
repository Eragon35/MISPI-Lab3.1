package prog

case class Point(x: Float, y: Float, r: Int) {
  def check(): Boolean = {
    if (x >= 0) {
      if (y >= 0) { if (x * x + y * y <= r * r) return true }
      else if (y > (x - r / 2)) return true
    }
    else if ((y > -r) && (x > -r) && (y <= 0)) return true
    false
  }
}
