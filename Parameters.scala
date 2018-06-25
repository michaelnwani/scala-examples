def max(values: Int*) = {
    values.foldLeft(values(0)) { Math.max }
}

