# Example1
- Um novo método que retorna o total na classe OrderLine 
- Método calculateOrderPrice()
- Remover métodos não utilizados
- Um print para Order e para OrderLine (Move Method)
- Orderline: Passar métodos public em OrderLine para private (Encapsulate Field)
- Order line 27 : if pode ser simplificado (Inline Method)

# Example2
- Interface igual
- Mudar nos testes apenas a criação dos objetos para new Circle e new Rectangle
- Divergent Change: Duas novas classes Rectangle e Circle extendem Shape, eliminando type
- Classe Shape abstract e métodos getArea(), getPerimeter() e draw() abstract, sendo depois implementados pelas duas subclasses (Move Method)

# Example3
- Mudar nos testes a criação de objetos para os novos nomes FixedDiscount e PercentageDiscount (e NullDiscount)
- Cada uma das novas classes implementa ela propria, à sua maneira, o applyDiscount da Interface
- Divergent Change: Similarmente ao example2, criaçao de 3 novas classes que desta vez implementam a agora Interface Discount
- Inline temp nas linhas 18 e 22

#Example4