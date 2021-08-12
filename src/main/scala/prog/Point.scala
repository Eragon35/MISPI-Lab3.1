package prog

case class Point(x: Double, y: Double, r: Int) {
  def check(): Boolean = {
    if (x >= 0) {
      if (y >= 0) { if (x * x + y * y <= r * r) return true }
      else if (y > (x - r / 2)) return true
    }
    else if ((y > -r) && (x > -r) && (y <= 0)) return true
    false
  }
}
