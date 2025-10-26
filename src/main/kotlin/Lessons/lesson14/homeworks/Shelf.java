package lessons.lesson14.homeworks;

import static java.sql.DriverManager.println;

public class Shelf(val capacity: Int){
    private final Object name;

    //Стеллаж и полки.
    //
    //Цель задания: Создать систему управления складским пространством с использованием классов "Стеллаж" и
    // "Полка стеллажа".

        private val items = items<String>()

        fun addItem(name: String): Boolean {
            if (!canAccommodate(name)) {
                return false
            }
            items.add(name)
            return true
        }

        fun removeItem(name: String): Boolean {
            if (!items.contains(name)) {
                return false
            }
            items.remove(name)
            return true
        }

        fun canAccommodate(name: String): Boolean {
            val currentAccommodation = items.map {
                it.length
            }.sum()
            return currentAccommodation + name.length <= capacity
        }

        fun containsItem(name: String) = items.contains(name)

        fun getItems() = items.toList()
    }
    class Rack(private val maxShelves: Int) {

        private val shelves = mutableListOf<Shelf>()

        fun addShelf(shelf:lessons.lesson14.homeworks.Shelf): Boolean {
            if (shelves.contains(shelf) || shelves.size == maxShelves) {
                return false
            }
            shelves.add(shelf)
            return true
        }

        fun removeShelf(index: Int): List<String> {
            if (index !in shelves.indices) {
                return emptyList()
            }
            val items = shelves[index].getItems()
            shelves.removeAt(index)
            return items
        }

        fun addItem(name: String): Boolean {
            if (shelves.isEmpty()) {
                return false
            }
            for (shelf in shelves) {
                if (shelf.canAccommodate(name)) {
                    return shelf.addItem(name)
                }
            }
            return false
        }

        fun removeItem(name: String): Boolean {
            for (shelf in shelves) {
                if (shelf.containsItem(name)) {
                    return shelf.removeItem(name)
                }
            }
            return false
        }

        fun containsItem(name: String): Boolean {
            return shelves.any { it.containsItem(name) }
        }

        fun getShelves() = shelves.toList()

        fun printContents() {
            for (i in shelves.indices) {
                val capacity = shelves[i].capacity
                val accessiblePlace = capacity - shelves[i].getItems()
                        .map { it.length }
               .sum()
                val meta = "$i вместимость: $capacity доступно: $accessiblePlace"
                val items = shelves[i].getItems().joinToString()
                println(meta)
                println("Предметы: $items")
                println()
            }
        }

        fun advancedRemoveShelf(index: Int): List<String> {
            if (index !in shelves.indices) {
                return emptyList()
            }
            val notReplacedItems = mutableListOf<String>()
            val otherShelves = shelves - shelves[index]
            for (item in shelves[index].getItems()) {
                if (otherShelves.none { it.addItem(item) }) {
                    notReplacedItems.add(item)
                }
            }
            shelves.removeAt(index)
            return notReplacedItems.toList()
        }
    }

}
