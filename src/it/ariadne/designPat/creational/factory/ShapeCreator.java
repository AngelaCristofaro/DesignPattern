package it.ariadne.designPat.creational.factory;
/**
 * Classe di creazione dello Shape
 * @author cristofaro
 *
 */
public class ShapeCreator {
	
        private static ShapeCreator instance = new ShapeCreator();

        public static ShapeCreator Instance() {
			return instance;
		}

        public static Shape CreateShape(ShapeType type) throws Exception
        {
            switch (type)
            {
                case Rettangolo:
                    return new Rettangolo();
                case Cerchio:
                    return new Cerchio();
                default:
                    throw new Exception("type");
            }
        }
  }

