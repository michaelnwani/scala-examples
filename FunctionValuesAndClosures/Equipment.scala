class Equipment(val routine: Int => Int) {
  def simulate(input: Int) = {
    print("Running simulation...")
    routine(input)
  }
}