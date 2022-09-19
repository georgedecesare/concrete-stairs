colour = "orange"
colours = {"black", "blue", "brown", "cyan", "gray", "green", "light_blue", "lime", "magenta", "orange", "pink", "purple", "red", "yellow", "light_gray"}

for colour in colours:
    blockstate = open("assets/concretestairs/blockstates/" + colour + "_concrete_slab.json", "w")
    blockstate.write(f"""
    {{
      "variants": {{
        "type=bottom": {{
          "model": "concretestairs:block/{colour}_concrete_slab"
        }},
        "type=double": {{
          "model": "minecraft:block/{colour}_concrete"
        }},
        "type=top": {{
          "model": "concretestairs:block/{colour}_concrete_slab_top"
        }}
      }}
    }}

                     """)
    blockstate.close();

    block = open("assets/concretestairs/models/block/" + colour + "_concrete_slab.json", "w")
    block.write(f"""
    {{
      "parent": "minecraft:block/slab",
      "textures": {{
        "bottom": "minecraft:block/{colour}_concrete",
        "side": "minecraft:block/{colour}_concrete",
        "top": "minecraft:block/{colour}_concrete"
      }}
    }}
    """)
    block.close()

    block_top = open("assets/concretestairs/models/block/" + colour + "_concrete_slab_top.json", "w")
    block_top.write(f"""
    {{
      "parent": "minecraft:block/slab_top",
      "textures": {{
        "bottom": "minecraft:block/{colour}_concrete",
        "side": "minecraft:block/{colour}_concrete",
        "top": "minecraft:block/{colour}_concrete"
      }}
    }}
    """)
    block_top.close()

    item = open("assets/concretestairs/models/item/" + colour + "_concrete_slab.json", "w")
    item.write(f"""
    {{
      "parent": "concretestairs:block/{colour}_concrete_slab"
    }}
    """)
    item.close()

    loot = open("data/concretestairs/loot_tables/blocks/" + colour + "_concrete_slab.json", "w")
    loot.write(f"""
    {{
      "type": "minecraft:block",
      "pools": [
        {{
          "bonus_rolls": 0.0,
          "entries": [
            {{
              "type": "minecraft:item",
              "functions": [
                {{
                  "add": false,
                  "conditions": [
                    {{
                      "block": "concretestairs:{colour}_concrete_slab",
                      "condition": "minecraft:block_state_property",
                      "properties": {{
                        "type": "double"
                      }}
                    }}
                  ],
                  "count": 2.0,
                  "function": "minecraft:set_count"
                }},
                {{
                  "function": "minecraft:explosion_decay"
                }}
              ],
              "name": "concretestairs:{colour}_concrete_slab"
            }}
          ],
          "rolls": 1.0
        }}
      ]
    }}
    """)
    loot.close()

    craft = open("data/concretestairs/recipes/" + colour + "_concrete_slab.json", "w")
    craft.write(f"""
    {{
      "type": "minecraft:crafting_shaped",
      "key": {{
        "#": {{
          "item": "minecraft:{colour}_concrete"
        }}
      }},
      "pattern": [
        "###"
      ],
      "result": {{
        "count": 6,
        "item": "concretestairs:{colour}_concrete_slab"
      }}
    }}
    """)
    craft.close()

    stonecut = open("data/concretestairs/recipes/" + colour + "_concrete_slab_from_" + colour + "_concrete_stonecutting.json", "w")
    stonecut.write(f"""
    {{
      "type": "minecraft:stonecutting",
      "count": 2,
      "ingredient": {{
        "item": "minecraft:{colour}_concrete"
      }},
      "result": "concretestairs:{colour}_concrete_slab"
    }}
    """)
    stonecut.close()

