package rs.symphony.cicak.webshop.domain

import org.jetbrains.compose.resources.DrawableResource
import webshop.composeapp.generated.resources.Res
import webshop.composeapp.generated.resources.p1
import webshop.composeapp.generated.resources.p2
import webshop.composeapp.generated.resources.p3
import webshop.composeapp.generated.resources.p4
import webshop.composeapp.generated.resources.p5

data class Product(
    val id: Long,
    val name: String,
    val price: Double,
    val favorite: Boolean = false
)

fun Product.getImageResource(): DrawableResource {
    return when (id % 5) {
        0L -> Res.drawable.p1
        1L -> Res.drawable.p2
        2L -> Res.drawable.p3
        3L -> Res.drawable.p4
        else -> Res.drawable.p5
    }
}

data class Category(
    val id: Long,
    val name: String,
    val price: Double
)

data class CartItem(
    val productId: Long,
    val quantity: Int
)

data class Currency(
    val name: String,
    val symbol: String
) {
    companion object {
        val USD = Currency("US Dollar", "USD")
        val EUR = Currency("EURO", "EUR")
        val RSD = Currency("Serbian Dinar", "RSD")
    }
}
