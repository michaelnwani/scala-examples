package finance

package object currencies {
    import Currency._

    def convert(money: Money, to: Currency) = {
        // fetch current market rate... using mocked values here
        val conversionRate = 2
        new Money(money.amount * conversionRate, to)
    }
}