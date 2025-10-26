package lessons.lesson15.homeworks;

import jdk.internal.org.objectweb.asm.tree.LookupSwitchInsnNode;
import lessons.lesson14.homeworks.fun;
import lessons.lesson14.homeworks.val;

import java.util.List;
import java.util.Map;

import static java.lang.Integer.max;
import static java.sql.DriverManager.println;


abstract class Materials {
    private Object mutableListOf;
    private val materials = mutableListOf<String>()
    private Object index;

    fun addMaterial(material: String) {
        Object material;
        materials.add(material)
    }

    fun extractMaterials():List<String>

    {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }
    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }

    class InsertFirstMaterial : Materials() {

        fun insert Object item;
        (item: String) {
            val materials = extractMaterials()
            addMaterial(item)
            materials.forEach {
                addMaterial(it)
            }
        }
    }

    class InsertSecondMaterials: Materials() {

        fun insert(items: List<String>) {
            val materials = extractMaterials()
            val maxIndex = max(items.lastIndex, materials.lastIndex)
            for (i in 0..maxIndex) {
                if (i < items.size) {
                    addMaterial(items[i])
                }
                if (i < materials.size) {
                    addMaterial(materials[i])
                }
            }
        }
    }

    static class InsertSortedMaterials : Materials() {

        fun insert(item: String) {
            val materials = (extractMaterials() + item).sorted()
            materials.forEach {
                addMaterial(it)
            }
        }
    }

    class InsertMapMaterials : Materials() {

        fun insert(items: Map<String, String>) {
            val materials = items.keys.reversed() + extractMaterials() + items.values
            materials.forEach {
                addMaterial(it)
            }
        }
    }
}
